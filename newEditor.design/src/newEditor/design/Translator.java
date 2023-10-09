package newEditor.design;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

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

import org.eclipse.core.runtime.NullProgressMonitor;
//import org.eclipse.m2m.atl.common.ATLExecutionException;
//import org.eclipse.m2m.atl.core.ATLCoreException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/*This code was written by Giovanni Meroni and I have received permission to reuse it for this project
 *The code can be found here: https://bitbucket.org/polimiisgroup/egsmengine/src/master/  
 */

public class Translator {
	

	public String getProcessName(String filename){
		System.out.println("getProcessName()");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(new File(filename));
        doc.getDocumentElement().normalize();
        return doc.getDocumentElement().getElementsByTagName("bpmn2:process").item(0).getAttributes().getNamedItem("id").getNodeValue();

		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return filename;
	}
	
	/*
	 * inFilename is the name (including path) of the xmi
	 * outFilename is the name (including path) of the outputed xml file
	 * xslFilename is the name (including path) of the xsl file (xmi to xml convention)
	 * C:\Users\leona\OneDrive\Bureau\Thesis\bpmn2egsm\it.polimi.isgroup.bpmn2egsmplugin\xmi2siena.xsl
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
        	System.out.println("error1");
        	
        } catch (TransformerConfigurationException e) {
            // An error occurred in the XSL file
        	System.out.println("error2");
        } catch (TransformerException e) {
        	System.out.println("error3");
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
