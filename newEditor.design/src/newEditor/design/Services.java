package newEditor.design;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.UUID;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Templates;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.eclipse.emf.ecore.EObject;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import com.sun.jdi.event.Event;

import application.ComponentType;
import application.CompositeApplicationType;
import application.ConditionType;
import application.DataFlowGuardType;
import application.EventType;
import application.impl.DataItemTypeImpl;
import application.impl.EventModelTypeImpl;
import application.FaultLoggerType;
import application.impl.InformationModelTypeImpl;
import application.MilestoneType;
import application.ProcessFlowGuardType;
import application.StageType;
import application.SubStageType;
import application.impl.ComponentTypeImpl;
import application.impl.ConditionTypeImpl;
import application.impl.DataFlowGuardTypeImpl;
import application.impl.GuardedStageModelTypeImpl;
import application.impl.MilestoneTypeImpl;
import application.impl.StageTypeImpl;
import application.impl.SubStageTypeImpl;
import application.impl.EventTypeImpl;




/**
 * The services class used by VSM.
 */
public class Services {
	
	
	String filePath;
	String inFile = "C:\\Users\\leona\\git\\EGSM-Editor\\newModel2\\newModel2.gsm_derived";
	String xslFile = "C:\\Users\\leona\\OneDrive\\Bureau\\Thesis\\bpmn2egsm\\it.polimi.isgroup.bpmn2egsmplugin\\xmi2siena.xsl";
    
	int stagenum = 0;
	int eventnum = 0;
	int stageIndex;
	String id;
	String name;
	String failure = "You must create a model";
	ArrayList<String> alreadyGen = new ArrayList<String>();
	ArrayList<String> eventCheck = new ArrayList<String>();


	
    public EObject myService(EObject self) {
    	return self;
    }
    
    
    public EObject save(CompositeApplicationType app) {
    	
    	getFilePath();
    	transformXML(inFile, filePath, xslFile);
    	
		return app;
    }
    
    public boolean applicationChecker(EObject app) {
    	if (app instanceof CompositeApplicationType) {
    		return true;
    	}
    	return false;
    }
    
  
    
    
  
    public void createCondition(MilestoneType milestone) {
    	milestone.setCondition(new ConditionTypeImpl());
    	
    }
    
    public String generateIDorName(EObject element) {
    	
    	id = UUID.randomUUID().toString().substring(0,4);

    	if (element instanceof SubStageType) {
    		name = "Nested Stage ";
    	}
    	else if (element instanceof DataFlowGuardType) {
    		name = "Data Flow Guard ";
    	}
    	else if (element instanceof ProcessFlowGuardType) {
    		name = "Process Flow Guard ";
    	}
    	else if (element instanceof MilestoneType) {
    		name = "Milestone ";
    	}
    	else if (element instanceof FaultLoggerType) {
    		name = "Fault Logger ";
    	}
    	else if (element instanceof ConditionType) {
    		name = "Condition ";
    	}
    	
    	return name + id;
    }
    
    public void createHierarchy(CompositeApplicationType app) {
    	app.setComponent(new ComponentTypeImpl());
    	app.getComponent().get(0).setId("model");
    	app.getComponent().get(0).setName("model");
    	app.getComponent().get(0).setAccessControlModel("AccessControlModel");
    	
    	app.getComponent().get(0).setGuardedStageModel(new GuardedStageModelTypeImpl());
    	
    	app.getComponent().get(0).setInformationModel(new InformationModelTypeImpl());
    	app.getComponent().get(0).getInformationModel().setDataItem(new DataItemTypeImpl());
    	
    	app.setEventModel(new EventModelTypeImpl());
    	
    	System.out.println("we here");
    }
    
    public void createEvent(CompositeApplicationType app) {
    	    	
    	EventTypeImpl event = new EventTypeImpl();
    	
    	id = UUID.randomUUID().toString().substring(0,4);
    	event.setId("Event " + id);

    	
    	app.getEventModel().setEvent(event);     	
    	
    }
    
    public void makeEvents(CompositeApplicationType app) {
    	
    	ArrayList<String> dupeCheck = new ArrayList<String>();
    	
    	generateEvents(app);
    	
    	   	
    	if (alreadyGen.size() > 0) {
    		//eventcheck is the new events
    		//alreadygen is all of the events
    		   		
    		for (int j = 0; j < alreadyGen.size(); j++) {
        		if ( !eventCheck.contains(alreadyGen.get(j))) {
        			for (int k = 0; k < app.getEventModel().getEvent().size(); k++) {
        				if (app.getEventModel().getEvent().get(k).getId() == alreadyGen.get(j)) {
        					app.getEventModel().getEvent().remove(k);
        					alreadyGen.remove(j);
        				}
        			}
        		}
        	}
    		
    	}
    	
		removeDupes(app, dupeCheck);

    }
    
    public void removeDupes(CompositeApplicationType app, ArrayList<String> list) {
    	for (int i = 0; i < app.getEventModel().getEvent().size(); i++) {
			if (!list.contains(app.getEventModel().getEvent().get(i).getId())){
				list.add(app.getEventModel().getEvent().get(i).getId());
			}
			else {
				app.getEventModel().getEvent().remove(i);
			}
			if (app.getEventModel().getEvent().get(i).getId() == "") {
				app.getEventModel().getEvent().remove(i);
			}
		}
    }
    
    public void generateEvents(CompositeApplicationType app) {
    	
    	eventCheck.clear();
    	
    	int stages = app.getComponent().get(0).getGuardedStageModel().getStage().size();
    	
    	if (stages == 0) {
    		app.getEventModel().getEvent().clear();
    	}
    	
    	for (int i = 0; i < stages; i++) {
    		for (int j = 0; j < app.getComponent().get(0).getGuardedStageModel().getStage().get(i).getMilestone().size(); j++) {
    			if (app.getComponent().get(0).getGuardedStageModel().getStage().get(i).getMilestone().get(j).getEventIds() != null) {
    				
    				String eventID = app.getComponent().get(0).getGuardedStageModel().getStage().get(i).getMilestone().get(j).getEventIds();
    				
    				eventCheck.add(eventID);

    				if (!alreadyGen.contains(eventID)) {
    					
    					EventTypeImpl event = new EventTypeImpl();
    					event.setId(eventID);
    					event.setName(eventID);
        				alreadyGen.add(eventID);
    				
    					app.getEventModel().setEvent(event);
    				}
    			}
    		
    		}
    		
    		for (int j = 0; j < app.getComponent().get(0).getGuardedStageModel().getStage().get(i).getDataFlowGuard().size(); j++) {
    			if (app.getComponent().get(0).getGuardedStageModel().getStage().get(i).getDataFlowGuard().get(j).getEventIds() != null) {
    				
    				String eventID = app.getComponent().get(0).getGuardedStageModel().getStage().get(i).getDataFlowGuard().get(j).getEventIds();
    				
    				eventCheck.add(eventID);

    				if (!alreadyGen.contains(eventID)) {
    					
    					EventTypeImpl event = new EventTypeImpl();
    					event.setId(eventID);
    					event.setName(eventID);
        				alreadyGen.add(eventID);
    				
    					app.getEventModel().setEvent(event);
    				}
    			}
    		
    		}
    		
    		for (int j = 0; j < app.getComponent().get(0).getGuardedStageModel().getStage().get(i).getFaultLogger().size(); j++) {
    			if (app.getComponent().get(0).getGuardedStageModel().getStage().get(i).getFaultLogger().get(j).getEventIds() != null) {
    				
    				String eventID = app.getComponent().get(0).getGuardedStageModel().getStage().get(i).getFaultLogger().get(j).getEventIds();
    				
    				eventCheck.add(eventID);

    				if (!alreadyGen.contains(eventID)) {
    					
    					EventTypeImpl event = new EventTypeImpl();
    					event.setId(eventID);
    					event.setName(eventID);
        				alreadyGen.add(eventID);
    				
    					app.getEventModel().setEvent(event);
    				}
    			}
    		
    		}
    		
    		if (app.getComponent().get(0).getGuardedStageModel().getStage().get(i).getSubStage().size() != 0) {
    			substageEventID(app.getComponent().get(0).getGuardedStageModel().getStage().get(i), app);
    		}
    	}
    }
    
    public void substageEventID(EObject stage, CompositeApplicationType app) {
    	
    	if (stage instanceof StageType) {
    		
    		int subStages = ((StageType) stage).getSubStage().size();
    	
    		for (int i = 0; i < subStages; i++) {
    			for (int j = 0; j < ((StageType) stage).getSubStage().get(i).getMilestone().size(); j++) {
    				if (((StageType) stage).getSubStage().get(i).getMilestone().get(j).getEventIds() != null) {
    				
    					String eventID = ((StageType)stage).getSubStage().get(i).getMilestone().get(j).getEventIds();
    				
        				eventCheck.add(eventID);

    					if (!alreadyGen.contains(eventID)) {
    					
    						EventTypeImpl event = new EventTypeImpl();
    						event.setId(eventID);
    						event.setName(eventID);
    						alreadyGen.add(eventID);
        				
    						app.getEventModel().setEvent(event);
    				}
    			}
    		
    		}
    		
    			for (int j = 0; j < ((StageType) stage).getSubStage().get(i).getDataFlowGuard().size(); j++) {
    				if (((StageType) stage).getSubStage().get(i).getDataFlowGuard().get(j).getEventIds() != null) {
    				
    					String eventID = ((StageType) stage).getSubStage().get(i).getDataFlowGuard().get(j).getEventIds();
    				
        				eventCheck.add(eventID);

    					if (!alreadyGen.contains(eventID)) {
    					
    						EventTypeImpl event = new EventTypeImpl();
    						event.setId(eventID);
    						event.setName(eventID);
        					alreadyGen.add(eventID);
    				
        					app.getEventModel().setEvent(event);
    					}
    				}
    		
    			}
    			for (int j = 0; j < ((StageType) stage).getSubStage().get(i).getFaultLogger().size(); j++) {
    				if (((StageType) stage).getSubStage().get(i).getFaultLogger().get(j).getEventIds() != null) {
    				
    					String eventID = ((StageType) stage).getSubStage().get(i).getFaultLogger().get(j).getEventIds();
    				
        				eventCheck.add(eventID);

    					if (!alreadyGen.contains(eventID)) {
    					
    						EventTypeImpl event = new EventTypeImpl();
    						event.setId(eventID);
    						event.setName(eventID);
        					alreadyGen.add(eventID);
    				
        					app.getEventModel().setEvent(event);
    					}
    				}
    		
    			}
    		
    			if (((StageType) stage).getSubStage().get(i).getSubStage().size() != 0) {
    				substageEventID(((StageType)stage).getSubStage().get(i), app);
    			}
    		}
    	}
    	
    	else if (stage instanceof SubStageType) {
 
    		int subStages = ((SubStageType) stage).getSubStage().size();
    	
    		for (int i = 0; i < subStages; i++) {
    			for (int j = 0; j < ((SubStageType) stage).getSubStage().get(i).getMilestone().size(); j++) {
    				if (((SubStageType) stage).getSubStage().get(i).getMilestone().get(j).getEventIds() != null) {
    				
    					String eventID = ((SubStageType)stage).getSubStage().get(i).getMilestone().get(j).getEventIds();
    				
        				eventCheck.add(eventID);

    					if (!alreadyGen.contains(eventID)) {
    					
    						EventTypeImpl event = new EventTypeImpl();
    						event.setId(eventID);
    						event.setName(eventID);
    						alreadyGen.add(eventID);
        				
    						app.getEventModel().setEvent(event);
    				}
    			}
    		
    		}
    		
    			for (int j = 0; j < ((SubStageType) stage).getSubStage().get(i).getDataFlowGuard().size(); j++) {
    				if (((SubStageType) stage).getSubStage().get(i).getDataFlowGuard().get(j).getEventIds() != null) {
    				
    					String eventID = ((SubStageType) stage).getSubStage().get(i).getDataFlowGuard().get(j).getEventIds();
    				
        				eventCheck.add(eventID);

    					if (!alreadyGen.contains(eventID)) {
    					
    						EventTypeImpl event = new EventTypeImpl();
    						event.setId(eventID);
    						event.setName(eventID);
        					alreadyGen.add(eventID);
    				
        					app.getEventModel().setEvent(event);
    					}
    				}
    		
    			}
    			
    			for (int j = 0; j < ((SubStageType) stage).getSubStage().get(i).getFaultLogger().size(); j++) {
    				if (((SubStageType) stage).getSubStage().get(i).getFaultLogger().get(j).getEventIds() != null) {
    				
    					String eventID = ((SubStageType) stage).getSubStage().get(i).getFaultLogger().get(j).getEventIds();
    				
        				eventCheck.add(eventID);

    					if (!alreadyGen.contains(eventID)) {
    					
    						EventTypeImpl event = new EventTypeImpl();
    						event.setId(eventID);
    						event.setName(eventID);
        					alreadyGen.add(eventID);
    				
        					app.getEventModel().setEvent(event);
    					}
    				}
    		
    			}
    		
    			if (((SubStageType) stage).getSubStage().get(i).getSubStage().size() != 0) {
    				substageEventID(((SubStageType)stage).getSubStage().get(i), app);
    			}
    		}
    	}
    	
    }
 

    
    public boolean createStage(CompositeApplicationType app) {
    	
    	
    	if (!hierarchyChecker(app)) {
    		return true;
    	}
    	
    	StageTypeImpl stage = new StageTypeImpl(); 

   
    	id = UUID.randomUUID().toString().substring(0,4);
    	stage.setName("Stage " + id);
    	id = UUID.randomUUID().toString().substring(0,4);
    	stage.setId("Stage " + id);
    	    	
    	app.getComponent().get(0).getGuardedStageModel().setStage(stage);
    	
    	populateStage(app);    
    	    	
    	return false;
    }
    
    public boolean createStage(StageType stage) {
    	
 	
    	SubStageTypeImpl subStage = new SubStageTypeImpl(); 

   
    	id = UUID.randomUUID().toString().substring(0,4);
    	subStage.setName("Nested Stage " + id);
    	id = UUID.randomUUID().toString().substring(0,4);
    	subStage.setId("Nested Stage " + id);
    	  
    	
    	stage.setSubstage(subStage);
    	
    	populateStage(stage);
    	
    	return false;
    }
    
    public void populateStage(StageType stage) {
    	
    	DataFlowGuardType data = new DataFlowGuardTypeImpl();
    	
    	data.setId(generateIDorName(data));
    	data.setName(generateIDorName(data));
    	
    	MilestoneType mile = new MilestoneTypeImpl();
    	
    	mile.setId(generateIDorName(mile));
    	mile.setName(generateIDorName(mile));
    	
    	ConditionType condition = new ConditionTypeImpl();
    	
    	condition.setId(generateIDorName(condition));
    	condition.setName(generateIDorName(condition));

    	mile.setCondition(condition);

    	
    	
    	System.out.println(stage.getSubStage().get(stage.getSubStage().size() -1).getDataFlowGuard());//.setDFG(new DataFlowGuardTypeImpl());
    	stage.getSubStage().get(stage.getSubStage().size() -1).setDFG(data);
    	//System.out.println(app.getComponent().get(0).getGuardedStageModel().getStage().get(app.getComponent().get(0).getGuardedStageModel().getStage().size() -1).getDataFlowGuard());//.setDFG(new DataFlowGuardTypeImpl());

    	System.out.println(stage.getSubStage().get(stage.getSubStage().size() -1).getMilestone());
    	stage.getSubStage().get(stage.getSubStage().size() -1).setMilestone(mile);
    	//System.out.println(app.getComponent().get(0).getGuardedStageModel().getStage().get(app.getComponent().get(0).getGuardedStageModel().getStage().size() -1).getMilestone());//.setDFG(new DataFlowGuardTypeImpl());

    }
    
    public void populateStage(CompositeApplicationType app) {
    	
    	DataFlowGuardType data = new DataFlowGuardTypeImpl();
    	
    	data.setId(generateIDorName(data));
    	data.setName(generateIDorName(data));
    	
    	MilestoneType mile = new MilestoneTypeImpl();
    	
    	mile.setId(generateIDorName(mile));
    	mile.setName(generateIDorName(mile));
    	
    	ConditionType condition = new ConditionTypeImpl();
    	
    	condition.setId(generateIDorName(condition));
    	condition.setName(generateIDorName(condition));

    	mile.setCondition(condition);

    	
    	
    	System.out.println(app.getComponent().get(0).getGuardedStageModel().getStage().get(app.getComponent().get(0).getGuardedStageModel().getStage().size() -1).getDataFlowGuard());//.setDFG(new DataFlowGuardTypeImpl());
    	app.getComponent().get(0).getGuardedStageModel().getStage().get(app.getComponent().get(0).getGuardedStageModel().getStage().size() -1).setDFG(data);
    	//System.out.println(app.getComponent().get(0).getGuardedStageModel().getStage().get(app.getComponent().get(0).getGuardedStageModel().getStage().size() -1).getDataFlowGuard());//.setDFG(new DataFlowGuardTypeImpl());

    	System.out.println(app.getComponent().get(0).getGuardedStageModel().getStage().get(app.getComponent().get(0).getGuardedStageModel().getStage().size() -1).getMilestone());//.setDFG(new DataFlowGuardTypeImpl());
    	app.getComponent().get(0).getGuardedStageModel().getStage().get(app.getComponent().get(0).getGuardedStageModel().getStage().size() -1).setMilestone(mile);
    	//System.out.println(app.getComponent().get(0).getGuardedStageModel().getStage().get(app.getComponent().get(0).getGuardedStageModel().getStage().size() -1).getMilestone());//.setDFG(new DataFlowGuardTypeImpl());

    }
    
    public ComponentType getComponent(CompositeApplicationType app) {
    	return app.getComponent().get(0);
    }
        
    
    public boolean correctnessChecker(CompositeApplicationType app) {
    	if (!hierarchyChecker(app)) {
    		ErrorMessage EM = new ErrorMessage(failure, true);
    		return false;
    	}
    	else if (!stageChecker(app)) {
    		ErrorMessage EM = new ErrorMessage(failure, false);
    		return true;
    	}
    	
    	return true;
    }
    
    public boolean stageChecker(CompositeApplicationType app) {
    	
    	if (app.getComponent().get(0).getGuardedStageModel().getStage().size() == 0) {
    		failure = "No stages were found.";
    		return false;
    	}
    	
    	 for (int j = 0; j < app.getComponent().get(0).getGuardedStageModel().getStage().size(); j++) {
    		 if (app.getComponent().get(0).getGuardedStageModel().getStage().get(j).getDataFlowGuard().size() == 0 || app.getComponent().get(0).getGuardedStageModel().getStage().get(j).getMilestone().size() == 0) {
    			 failure = "All stages should have at least one data flow guard and one milestone.";
    			 return false;
    		 }
    		 else if (app.getComponent().get(0).getGuardedStageModel().getStage().get(j).getMilestone().size() != 0 && app.getComponent().get(0).getGuardedStageModel().getStage().get(0).getMilestone().get(0).getCondition() == null) {
    			 failure = "All milestones should have a condition.";
    			 return false;
    		 }
    		 if (app.getComponent().get(0).getGuardedStageModel().getStage().get(j).getSubStage().size() != 0) {
    			 for (int k = 0; k < app.getComponent().get(0).getGuardedStageModel().getStage().get(j).getSubStage().size(); k++) {
    				 if (app.getComponent().get(0).getGuardedStageModel().getStage().get(j).getSubStage().get(k).getDataFlowGuard().size() == 0 || app.getComponent().get(0).getGuardedStageModel().getStage().get(j).getSubStage().get(k).getMilestone().size() == 0) {
    					 failure = "All nested stages should have at least one data flow guard and one milestone.";
    					 return false;
    	    		 }
    				 else if (app.getComponent().get(0).getGuardedStageModel().getStage().get(j).getSubStage().get(k).getMilestone().get(0).getCondition() == null) {
    					 failure = "All nested stages should have at least one data flow guard and one milestone.";
    					 return false;
    				 }
    			 }
    		 }
    	 }
    	 
    	 return true;	
    }
    
    public boolean hierarchyChecker(CompositeApplicationType app) {
    	if (app.getComponent().size() == 0) {
    		failure = "You must create the hierarchy.";
    		return false;
    	}
    	
    	return true;
    }

    // Opens the file explorer and gets the filename and path from the user   
    public String getFilePath() {
        
        JFileChooser fileExplorer = new JFileChooser();

        fileExplorer.setDialogTitle("Save to");
    	FileNameExtensionFilter xmlFilter = new FileNameExtensionFilter("xml files (*.xml)", "xml");
    	fileExplorer.setFileFilter(xmlFilter);
    	
        fileExplorer.showSaveDialog(null);
        
        filePath = fileExplorer.getSelectedFile().toString();
        if (!filePath.contains(".xml")) {filePath += ".xml";}; 

        return filePath;
   
   }
    
	
	/* This method was implemented by Giovanni Meroni and I have received permission to reuse it for this project
     * The code can be found here: https://bitbucket.org/polimiisgroup/egsmengine/src/master/ 
	 */
	public void transformXML(String inFilename, String outFilename, String xslFilename){
		try {
            // Create transformer factory
            TransformerFactory factory = TransformerFactory.newInstance();

            // Use the factory to create a template containing the xsl file
            Templates template = factory.newTemplates(new StreamSource(
                new FileInputStream(xslFilename)));
            // Use the template to create a transformer
            Transformer xformer = template.newTransformer();
            // Prepare the input and output files
            Source source = new StreamSource(new FileInputStream(inFilename));
            Result result = new StreamResult(new FileOutputStream(outFilename));

            // Apply the xsl file to the source file and write the result to the output file
            xformer.transform(source, result);
            
        } catch (FileNotFoundException e) {
        	
        } catch (TransformerConfigurationException e) {
            // An error occurred in the XSL file
        } catch (TransformerException e) {
            // An error occurred while applying the XSL file
            // Get location of error in input file
            /*
        	SourceLocator locator = e.getLocator();
            int col = locator.getColumnNumber();
            int line = locator.getLineNumber();
            String publicId = locator.getPublicId();
            String systemId = locator.getSystemId();
            */
        }
	}
	

    
    
    
    
    
}
