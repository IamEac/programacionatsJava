package Cycle;

/* Exercise 8 : Ask for a number N, and show all the numbers from 1 to N.
 * 
 */

import javax.swing.JOptionPane;

public class Exercise8 {

	public static void main(String[]args) {

		int n;

		n = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
		for(int i =1; i<=n; i++) {
		JOptionPane.showMessageDialog(null,(i));

		}
	}
}
