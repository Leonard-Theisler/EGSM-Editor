package newEditor.design;

import java.util.ArrayList;
import org.eclipse.emf.ecore.EObject;
import application.CompositeApplicationType;




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
    
    public boolean createElement(EObject element) {
    	
    	return eFactory.EGSMfactory(element);
    	
    }
    
    public void createHierarchy(CompositeApplicationType app) {
    	
    	eFactory.createHierarchy(app);
    	
    }
    
    public boolean createStage(CompositeApplicationType app) {
    	
    	return eFactory.createStage(app);
    	
    }
      
    public void stageChecker(CompositeApplicationType app) {
    	
    	checker.stageChecker(app);
    	
    }
    
    public void createEvents(CompositeApplicationType app) {
    	
    	eFactory.makeEvents(app);
    	
    }
       
    
}
