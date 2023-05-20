package Cycle;

/* Exercise 7 : Ask for numbers until a negative one is entered, and calculate the mean.
 * 
 */

import javax.swing.JOptionPane;

public class Exercise7 {

	public static void main(String[]args) {
		int number, cont= 0, addition= 0;
		float mean;
		
		number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
		
		while(number>=0) {
			addition += number;
			cont++;
			
			number = Integer.parseInt(JOptionPane.showInputDialog("Enter another number"));

			
		}
		
		if(cont ==0) {
			JOptionPane.showMessageDialog(null,("Mistake! The division / 0 does'nt exist"));

		}
		else {
			mean = (float) addition/cont;
			JOptionPane.showMessageDialog(null,("The mean is : " + mean));

		}
	}
}
