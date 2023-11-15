package newEditor.design;

import javax.swing.JOptionPane;

public class ErrorMessage {

	//This class defines the error/warning popup when the user tries to export an invalid or incomplete model 
	public void show(String s, boolean error) {
		
		if (!error) {
			JOptionPane.showMessageDialog(null, "Your model is incomplete. " + s,"Warning", JOptionPane.WARNING_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null, "Your model is empty. " + s,"Empty model", JOptionPane.ERROR_MESSAGE);
		}
		
	}
}
