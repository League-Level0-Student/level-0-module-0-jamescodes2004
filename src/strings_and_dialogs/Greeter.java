package strings_and_dialogs;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	String Name = JOptionPane.showInputDialog("What's your name?");
	String feeling = JOptionPane.showInputDialog("Hi " + Name + ", how are you?");
}
}
