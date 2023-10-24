package newEditor.design;

import javax.swing.JOptionPane;

public class ErrorMessage {

	public ErrorMessage(String s) {
			
		JOptionPane.showMessageDialog(null, "Invalid model. " + s,"Invalid model", JOptionPane.ERROR_MESSAGE);
    
	    
	}
}
