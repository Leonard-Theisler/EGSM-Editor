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

    public EObject myService(EObject self, String arg) {
    	System.out.println("sflghsdæl");
      return self;
    }
    
	
}
