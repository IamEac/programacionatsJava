package Conditionals;

import javax.swing.JOptionPane;

/* Exercise 2 : Ask for two numbers and say which is the largest or if they are the same.
 * 
 */
public class Exercise2 {

	public static void main (String[]args) {


		double a,b;
		a = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce a number 1 "));
        b = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce a number 2"));
        
		if (a > b) {
			JOptionPane.showMessageDialog(null, a + " is largest than " + b );            

		} 	  else if (a < b ){ 
			JOptionPane.showMessageDialog(null, b + " is largest than " + a );            


		} 
		else {
			JOptionPane.showMessageDialog(null,  a + " and " + b + ", are equals");

		}
	}

}
