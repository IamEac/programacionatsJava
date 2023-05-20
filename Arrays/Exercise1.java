package Arrays;

/* Exercise 1 : Read 5 numbers, save them in an array and display them in the same order entered.
 * 
 */

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercise1 {

	public static void main(String[]args) {

		Scanner sc = new Scanner(System.in);

		int[] number = new int[5];
		
		
		System.out.println("Enter 5 elements");
		for(int i=0; i<5;i++) {
			System.out.println((i+1)+ ". Enter a number ");
			number[i] = sc.nextInt();
		}
		System.out.println("\nThe numbers of the array are : ");
		for(int i:number) {
			System.out.println(i);
		}
			 }
	

		}


