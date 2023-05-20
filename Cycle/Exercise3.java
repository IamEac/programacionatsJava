package Cycle;

/* Exercise 3: Read a number until a 0 is entered. For each one
 * indicate if it is even or odd.
 */

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercise3 {

	public static void main(String[]args) {

		int num;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
		
		while(num != 0) { 
			if (num%2 == 0) { 
				JOptionPane.showMessageDialog(null, num + " is even ");
			}
			else {
				JOptionPane.showMessageDialog(null, num + " is odd ");

			}
			num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));

		}
	}
}
