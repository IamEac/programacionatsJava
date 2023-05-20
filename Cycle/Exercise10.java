package Cycle;

/* Exercise 10 : Ask for 10 numbers and write the total sum
 * 
 */

import javax.swing.JOptionPane;

public class Exercise10 {

	public static void main(String[]args) {

		int numb;
		int cont = 0;
		for(int i = 1; i<=10; i++) {
			
			numb = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
			cont += numb;
	
		//	JOptionPane.showMessageDialog(null,("The result of the addition is : " + cont));
			System.out.println(i + ": The result of the addition is : " + cont);

		}
		
	}
}
