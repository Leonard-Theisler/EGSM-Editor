package newEditor.design;

import org.eclipse.emf.ecore.EObject;

/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    Translator translator;
    String filename;

    public EObject myService(EObject self) {
    	System.out.println("method successfully called");
		//translator.transformXML("C:\\Users\\leona\\git\\EGSM-Editor\\newModel\\newModel.gsm_derived", "C:\\Users\\leona\\OneDrive\\Bureau\\SerializationTest\\newModel.xml", "C:\\Users\\leona\\OneDrive\\Bureau\\Thesis\\bpmn2egsm\\it.polimi.isgroup.bpmn2egsmplugin\\xmi2siena.xsl");
      return self;
    }
    
    public int test(EObject self) {return 3;} 
    
    public void save(EObject self) {
    	filename= translator.getProcessName("C:\\Users\\leona\\git\\EGSM-Editor\\newModel\\newModel.gsm_derived");
		translator.transformXML(filename, "C:\\Users\\leona\\OneDrive\\Bureau\\SerializationTest\\newModel.xml", "C:\\Users\\leona\\OneDrive\\Bureau\\Thesis\\bpmn2egsm\\it.polimi.isgroup.bpmn2egsmplugin\\xmi2siena.xsl");
		System.out.println("3333");
    }
	
}
