package Conditionals;

/* Exercise 3: Make a program that reads a character on the keyboard and checks if it is a capital letter
 * 
 */

import javax.swing.JOptionPane;

public class Exercise3 {


public static void main (String[]args) {


	char letter;
	
	letter = JOptionPane.showInputDialog("Introduce a letter").charAt(0);

	if (Character.isUpperCase(letter)) {
		JOptionPane.showMessageDialog(null," is capital letter");
		       

	} 	  else { 
		JOptionPane.showMessageDialog(null, " it is lowercase ");            

		
	}
}
}