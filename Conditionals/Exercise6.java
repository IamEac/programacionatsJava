package Conditionals;

import javax.swing.JOptionPane;

/* Exercise 6 : Make a program that takes two numbers and says if they are both even or odd.
 * 
 */

public class Exercise6 {

	public static void main(String[]args) {

		double a,b;

		a = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce a number 1 "));
		b = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce a number 2"));

		if (a%2==0 && b%2==0) {
			JOptionPane.showMessageDialog(null, "Both numbers are even");    
			
		}
		
		else if (a%2 == 0  && b % 2 != 0) { 
			JOptionPane.showMessageDialog(null, "The number " + a + " is even and the number " + b + " is odd ");       

		}

		else if(a % 2 != 0 && b  % 2 == 0){
			JOptionPane.showMessageDialog(null, "The number  " + a + " is odd and the number " + b + " is even ");

		}

		else{
			JOptionPane.showMessageDialog(null, "Both numbers are odds");
		}

	}

}
