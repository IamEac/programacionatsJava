package Cycle;

/* Exercise 1: Read a number and show its square, repeat the process until it is
 * enter a negative number
 */

import javax.swing.JOptionPane;
import java.lang.*;

public class Exercise1 {

	public static void main(String[]args) {
		
		int number, square;
		
		number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number and I'll show you its square, until you enter a negative number"));
		 
		while(number >= 0) {
			square = (int)Math.pow(number, 2);
			
		JOptionPane.showMessageDialog(null, " "
				+ "The number : " +number+ " squared is ; " + square );
		
		number = Integer.parseInt(JOptionPane.showInputDialog(" Enter another number"));
		}
	}
}


