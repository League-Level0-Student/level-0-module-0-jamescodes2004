package strings_and_dialogs;

import javax.swing.JOptionPane;

public class IKnowWhatYouDidLastSummer {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog(null, "What is your name?");
	String activity = JOptionPane.showInputDialog(null, "What is your favorite activity in past tense");
	JOptionPane.showMessageDialog(null, "I know that you " + activity + " last summer, " + name + " Muhahaha!");
}
}
