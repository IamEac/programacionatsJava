package Conditionals;

import javax.swing.JOptionPane;

/*
 * The if statement

 * if (condition) {
 *    Instruction1;
 * }
 *  else { 
 *  Instruction2;
 */

public class IfandElse {

	public static void main(String[]args) { 

		int number, data = 5;

		number = Integer.parseInt(JOptionPane.showInputDialog("Introduce a number"));


		// ---> "!=" -->  means different  ---> ">" means bigger
		// ---> ">=" -->  means bigger or equals  ---> "<" means less or "<=" less or equals

		if(number == data) {

			JOptionPane.showMessageDialog(null, "The number is 5");
		} 
		else { 
			JOptionPane.showMessageDialog(null, "The number isn't 5");
		}
	}
}

