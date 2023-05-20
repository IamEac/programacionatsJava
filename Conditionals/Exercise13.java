package Conditionals;

/* Exercise 13: Make a program that simulates an ATM with an initial balance of 1000 Dollars,
 * with the following menu options:
 * 1. Add money to the account
 * 2. Withdraw money from the account
 * 3. Exit 
 */

import javax.swing.JOptionPane;

public class Exercise13 {

	public static void main(String[]args) {

		int menu;
		double add, remove; final double balance = 1000;

		menu = Integer.parseInt(JOptionPane.showInputDialog("Select which operation you want to perform \n 1. Add money to the account\n 2. Withdraw money from the account\n		 3. Exit " ));
		switch(menu) {
		case 1:
			add = Double.parseDouble(JOptionPane.showInputDialog("How much money are you going to add?"));
			JOptionPane.showMessageDialog(null, "The current balance is: " + (balance+add));	
			break;
			
		case 2:
			remove = Double.parseDouble(JOptionPane.showInputDialog("How much money are you going to remove?"));

			if (remove>balance) {
			JOptionPane.showMessageDialog(null, "You don't have enough balance");	

			}else {


				JOptionPane.showMessageDialog(null, "The current balance is: " + (balance-remove));	
			}
			break;

		case 3:
			JOptionPane.showMessageDialog(null, "Good Bye");	
			break;
		default:
			JOptionPane.showMessageDialog(null, "Introduce a number between 1 / 3 ");	
			break;
		}
	}
}
