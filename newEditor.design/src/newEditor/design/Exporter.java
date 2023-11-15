package newEditor.design;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Templates;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import application.CompositeApplicationType;

public class Exporter {
	
	
	//absolute paths
	//String inFile;// = "C:\\Users\\leona\\git\\EGSM-Editor\\newModel2\\newModel2.gsm_derived";
	//String xslFile = "C:\\Users\\leona\\OneDrive\\Bureau\\Thesis\\bpmn2egsm\\it.polimi.isgroup.bpmn2egsmplugin\\xmi2siena.xsl";
	//String xsdFile = "C:\\Users\\leona\\OneDrive\\Bureau\\Thesis\\bpmn2egsm\\it.polimi.isgroup.bpmn2egsmplugin\\xmi2xsd.xsl";
	
	//relative paths
	String xslFile = Exporter.class.getProtectionDomain().getCodeSource().getLocation().getPath().toString() + "StyleSheets/xmi2siena.xsl";
	String xsdFile = Exporter.class.getProtectionDomain().getCodeSource().getLocation().getPath().toString() + "StyleSheets/xmi2xsd.xsl";
	String inFile = Exporter.class.getProtectionDomain().getCodeSource().getLocation().getPath().toString();
			
	int trimmer;
	String xsdFilePath;
	String filePath;
	
	public void export(CompositeApplicationType app) {
		
		trimmer = inFile.lastIndexOf('/');
		inFile = inFile.substring(0,trimmer);
		inFile = inFile.substring(0,trimmer);
		trimmer = inFile.lastIndexOf('/');
		inFile = inFile.substring(0,trimmer); 
		trimmer = inFile.lastIndexOf('/');
		inFile = inFile.substring(0,trimmer) + "/newModel2/newModel2.gsm_derived";

		
		filePath = getFilePath();

		if (filePath == null) {return;} //stops execution of the method if there is no file name
		
		trimmer = filePath.lastIndexOf('\\');
		xsdFilePath = filePath.substring(0, trimmer) + "\\infoModel.xsd";
		

    	transformXML(inFile, filePath + ".xml", xslFile);
    	transformXML(inFile, xsdFilePath, xsdFile);
    	  	


 	}
	
	// Opens the file explorer and gets the filename and path from the user   
    private String getFilePath() {
        
        JFileChooser fileExplorer = new JFileChooser();

        fileExplorer.setDialogTitle("Save to");
    	FileNameExtensionFilter xmlFilter = new FileNameExtensionFilter("xml files (*.xml)", "xml", "xsd files (*.xsd)", "xsd");
    	fileExplorer.setFileFilter(xmlFilter);
    	
        fileExplorer.showSaveDialog(null);
        
        if (fileExplorer.getSelectedFile() != null) {
        	filePath = fileExplorer.getSelectedFile().toString();
        
        	if (filePath.contains(".xml")) {filePath = filePath.replace(".xml", "");}; 
        	if (filePath.contains(".xsd")) {filePath = filePath.replace(".xsd", "");}; 
        }
        
        return filePath;
           
   }
    
	
	/* This method was implemented by Giovanni Meroni and I have received permission to reuse it for this project
     * The code can be found here: https://bitbucket.org/polimiisgroup/egsmengine/src/master/ 
	 */
	private void transformXML(String inFilename, String outFilename, String xslFilename){
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
        	System.out.println("File not found");
        	System.out.println(inFilename);
        	
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
