package Arrays;

 // Fill an array

import javax.swing.JOptionPane;
import java.util.Scanner;

public class fillArrays {

	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
		int nElements;
		
		nElements = Integer.parseInt(JOptionPane.showInputDialog("Enter the size of your array "));
	
		char[] letter = new char[nElements];
		
		System.out.println("Enter the elements of your array");
		for(int i=0; i<nElements;i++) {
			System.out.println((i+1)+ ". Enter a letter ");
			letter[i] = sc.next().charAt(0);
		}
		
		System.out.println("\nThe characters of the array are : ");
		for(int i=0;i<nElements;i++) {
			System.out.print(letter[i]+ " ");
		}
	}
}