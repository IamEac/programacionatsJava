package Cycle;

/* Exercise 6: Ask for numbers until a 0 is typed, show the sum of all the numbers entered
 * 
 */

import javax.swing.JOptionPane;

public class Exercise6 {

	public static void main(String[]args) {
		int num,addition=0;
		do {
			num=Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
			addition+=num;
		} while (num!=0);

		JOptionPane.showMessageDialog(null,("The result of the addition is : " + addition));

	}
}
