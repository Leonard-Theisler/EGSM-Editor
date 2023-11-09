package newEditor.design;

import javax.swing.JOptionPane;

public class ErrorMessage {

	public void show(String s, boolean error) {
		
		if (!error) {
			JOptionPane.showMessageDialog(null, "Your model is incomplete. " + s,"Warning", JOptionPane.WARNING_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null, "Your model is empty. " + s,"Empty model", JOptionPane.ERROR_MESSAGE);
		}
		
	}
}
