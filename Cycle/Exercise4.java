package Cycle;

/* Exercise 4 : Ask for numbers until a negative one is typed, and show
 * how many numbers have been entered
 */

import javax.swing.JOptionPane;

public class Exercise4 {

	public static void main(String[]args) {

		int num, cont=0;

		num = Integer.parseInt(JOptionPane.showInputDialog("Enter a positive number"));



		while(num>=0){
			cont++;
			num = Integer.parseInt(JOptionPane.showInputDialog("Enter another number "));

		} 
		JOptionPane.showMessageDialog(null,"Invalid number. You entered a total of "+cont+" numbers.");    
	} 

}
