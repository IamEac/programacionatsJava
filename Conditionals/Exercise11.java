package Conditionals;

/* Exercise 11 : Build a program that simulates the operation of a calculator that can perform
 * the four basic arithmetic operations (addition, subtraction, product and division) with integer numeric values.
 * The user must specify the operation with the first character of the first command line parameter:
 * S or s for addition, R or r for subtraction, P , p M or m for product, and D or d for division.
 */

import javax.swing.JOptionPane;

public class Exercise11 {

	public static void main(String[]args) {

		int num1, num2, addition, rest, mult , div;
		char operation;

		num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));

		operation = JOptionPane.showInputDialog("Enter the operation you want to perform: ").charAt(0);

		switch(operation) {
		case 's':
		case 'S': addition = num1+num2;
		JOptionPane.showMessageDialog(null, "The result of the addition is " + addition);
		break;
		case 'r':
		case 'R': rest = num1-num2;
		JOptionPane.showMessageDialog(null, "The result of the rest is " + rest);	
		break;
		case 'm':
		case 'M': mult = num1*num2;
		JOptionPane.showMessageDialog(null, "The result of the multiplication is " + mult);	
		break;
		case 'd':
		case 'D': div = num1/num2;
	
			JOptionPane.showMessageDialog(null, "The result of the division is " + div);	
			
		break;
		default: 
			JOptionPane.showMessageDialog(null, "The made a mistake in the operation");	
		break;
		}		 
	}

}
