package strings_and_dialogs;

import javax.swing.JOptionPane;

public class EverythingisAwesome {
public static void main(String[] args) {
	String activity = JOptionPane.showInputDialog("What do you like?");
	JOptionPane.showMessageDialog(null, activity + " is awesome!!!");
}
}
