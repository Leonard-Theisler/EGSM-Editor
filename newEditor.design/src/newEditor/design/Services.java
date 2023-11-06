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
      
    
    public void createEvents(CompositeApplicationType app) {
    	
    	eFactory.makeEvents(app);
    	
    }
       
    
}
