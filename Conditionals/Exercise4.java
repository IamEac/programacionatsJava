package Conditionals;

import javax.swing.JOptionPane;

/* Exercise 4: In MegaPlaza a 20% discount is given to customers whose purchase exceeds $300.
 * What will be the amount that a person will pay for their purchase?
 */

public class Exercise4 {

	public static void main (String[]args) {

		double purchase , discoun;	

		purchase = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce how much is your purchase : "));

		if (purchase > 300) {
			purchase =  purchase - (purchase*0.20);

			JOptionPane.showMessageDialog(null, " the price for your purchase will be = " + purchase);            


		} 	  else { 

			JOptionPane.showMessageDialog(null, " the price for your purchase will be = " + purchase);            

		}
	}
}
