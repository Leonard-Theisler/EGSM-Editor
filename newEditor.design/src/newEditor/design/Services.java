package newEditor.design;

import java.util.ArrayList;
import org.eclipse.emf.ecore.EObject;
import application.CompositeApplicationType;




/**
 * The services class used by VSM.
 */
public class Services {
	
	//This class is a facade that calls methods from all of the other classes, it does not implement any logic.
	
	private Exporter exporter = new Exporter();
	private UUIDFactory idFactory = new UUIDFactory();
	private Checker checker = new Checker();
	private ModelElementMaker modelElementMaker = new ModelElementMaker(); 


	
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
    	
    	return modelElementMaker.EGSMfactory(element);
    	
    }
    
    public void createHierarchy(CompositeApplicationType app) {
    	
    	modelElementMaker.createHierarchy(app);
    	
    }
    
    public boolean createStage(CompositeApplicationType app) {
    	
    	return modelElementMaker.createStage(app);
    	
    }
      
    public void stageChecker(CompositeApplicationType app) {
    	
    	checker.stageChecker(app);
    	
    }
    
    public void createEvents(CompositeApplicationType app) {
    	
    	modelElementMaker.makeEvents(app);
    	
    }
       
    
}
