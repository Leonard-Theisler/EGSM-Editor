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
	
	Exporter exporter = new Exporter();
	UUIDFactory idFactory = new UUIDFactory();
	Checker checker = new Checker();
	ModelElementFactory eFactory = new ModelElementFactory(); 
    
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
    
    
    
    public void save(CompositeApplicationType app) {
    	
    	exporter.export(app);

    }
    
    public String generateIDorName(EObject element) {
    	
    	return idFactory.getUUID(element);
    	
    }
    
    
    public boolean applicationChecker(EObject app) {
    	
    	return checker.checkApplication(app);
    	
    }
    
    public boolean correctnessChecker(CompositeApplicationType app) {
    	
    	return checker.checkCorrectness(app);
    	
    }
    
    public void createElement(EObject element) {
    	
    	eFactory.EGSMfactory(element);
    	
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
 
    
    /*public ComponentType getComponent(CompositeApplicationType app) {
    	return app.getComponent().get(0);
    }*/
        
    
    
    
      
       
    
}
