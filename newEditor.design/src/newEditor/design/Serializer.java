package newEditor.design;

public class Serializer {
	
	public Serializer() {}
	
	Translator translator;
	
	public void save() {
		System.out.println("called the method");
		translator.transformXML("C:\\Users\\leona\\git\\EGSM-Editor\\newModel\\newModel.gsm_derived", "C:\\Users\\leona\\OneDrive\\Bureau\\SerializationTest\\newModel.xml", "C:\\Users\\leona\\OneDrive\\Bureau\\Thesis\\bpmn2egsm\\it.polimi.isgroup.bpmn2egsmplugin\\xmi2siena.xsl");
	}
	
	
	

}
