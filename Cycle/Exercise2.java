package Cycle;

/* Exercise 2: Read a number and indicate if it is positive or negative.
 * The process will repeat until a 0 is entered.
 */

import javax.swing.JOptionPane;

public class Exercise2 {

	public static void main(String[]args) {
		
		int number; 
		
		number = Integer.parseInt(JOptionPane.showInputDialog(" Enter a number"));

		while ((number>0) || (number<0)) {
			 
			if (number > 0) {
				JOptionPane.showMessageDialog(null, "Positive");

			} else if (number < 0) {
				JOptionPane.showMessageDialog(null, "Negative");

			}
		number = Integer.parseInt(JOptionPane.showInputDialog(" Enter another number"));

		}
	}

}
