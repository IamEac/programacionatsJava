package Conditionals;

/* Exercise 8 : Ask for a number between 0 and 99,999 and say how many digits it has
 * 
 */

import javax.swing.JOptionPane;

public class Exercise8 {

	public static void main(String[]args) {
		
		double number;
		
		number = Double.parseDouble(JOptionPane.showInputDialog(null, "Introuce a number between 0 and 999,999"));
		

		if ((number < 0 )|| (number>999999)) {
			JOptionPane.showMessageDialog(null, "You have entered two numbers outside the range, try again");
		}else {
			if(number == 0) number++;
			
			JOptionPane.showMessageDialog(null,("The Number of digits : " + Math.floor(Math.log10(Math.abs(number)) + 1)));
		}


	}
}

