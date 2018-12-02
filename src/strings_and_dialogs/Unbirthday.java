package strings_and_dialogs;

import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	String birthday = JOptionPane.showInputDialog(null, "What is your birthday mm/dd");
	if (birthday.equals("12/2")) {
JOptionPane.showMessageDialog(null, "Happy Brithday!");
}else {
JOptionPane.showMessageDialog(null, "Very merry UNbirthday!");
}
}
}
