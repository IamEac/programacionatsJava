package Arrays;

/* Exercise 5: Read by keyboard two tables of 10 whole numbers and mix them in a third of the form:
 * the 1* of A, the 1* of B, the 2* of A, the 2* of B, etc.
 */

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercise5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		int a[] = new int[10];
		int b[] = new int[10];
		int c[] = new int[20];
		JOptionPane.showInternalMessageDialog(null, "Enter A / 10 numbers");
		for(int i=0;i<10;i++){
			a[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
			
		}
		JOptionPane.showInternalMessageDialog(null, "Enter B / 10 numbers");

		for(int i=0;i<10;i++){
			b[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
		
		}
		
		int j = 0;
		for(int i=0;i<10;i++){
			c[j] = a[i];
			j++;
	
			c[j] = b[i];
		
			j++;	


	}
		System.out.println("C : ");
		for(int i =0;i<20;i++) {
			System.out.println(c[i]+ "  ");
		}
	}
}

