package Cycle;

/* For Loop
 *  
 *  for(initialization ; condition ; increase or decrease) {
 *  Instructions; 
 *  }
 */

import java.util.Scanner;

import javax.swing.JOptionPane; 

public class For {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cont;
		
		System.out.println("Enter the number of terms");
		cont = sc.nextInt();
		for(int i =2; i<=cont; i+=2) {
			System.out.println(i);
		}
		JOptionPane.showMessageDialog(null,("el resultado de la suma es: " + cont));
	}
}
