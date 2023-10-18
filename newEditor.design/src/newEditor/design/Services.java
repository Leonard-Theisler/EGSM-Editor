package newEditor.design;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.util.UUID;

import javax.swing.JFileChooser;
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

import application.CompositeApplicationType;
import application.ConditionType;
import application.DataFlowGuardType;
import application.FaultLoggerType;
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




/**
 * The services class used by VSM.
 */
public class Services {
	
	
	String filePath;
	String inFile = "C:\\Users\\leona\\git\\EGSM-Editor\\newModel2\\newModel2.gsm_derived";
	String xslFile = "C:\\Users\\leona\\OneDrive\\Bureau\\Thesis\\bpmn2egsm\\it.polimi.isgroup.bpmn2egsmplugin\\xmi2siena.xsl";
    
	int i = 0;
	String id;
	String name;


	
    public EObject myService(EObject self) {
    	return self;
    }
    
    
    public EObject save(EObject self) {

    	getFilePath();
    	transformXML(inFile, filePath, xslFile);
    	
		return self;
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
    }
 
    
    public void createStage(CompositeApplicationType app) {
    	
    	//if stage 0, 1, 2 exist and stage 1 is deleted, the next stage created will be called 2 and not 1
    	/*if (app.getComponent().get(0).getGuardedStageModel().getStage().size() >= 1) {
    		i = app.getComponent().get(0).getGuardedStageModel().getStage().size();
    	}
    	else {
    		i = 0;
    	}*/
    	
    	id = UUID.randomUUID().toString().substring(0,4);
    	
    	app.getComponent().get(0).getGuardedStageModel().setStage(new StageTypeImpl());
    	
    	//sets default values to ensure compatibility
    	app.getComponent().get(0).getGuardedStageModel().getStage().get(i).setName("Stage " + id);  
    	app.getComponent().get(0).getGuardedStageModel().getStage().get(i).setId("Stage " + id);
    	

    	i ++; 
    	
    	
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
