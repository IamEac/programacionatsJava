package Arrays;

/* Exercise 2 : Read 5 numbers, save them in an array and display them in the reverse order of the one entered
 * 
 */

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercise2  {

	public static void main(String[]args) {

		Scanner sc = new Scanner(System.in);

		int[] number = new int[5];
		int cont = 0;
		System.out.println("Enter 5 numbers");
		
		for(int i=4; i>=0; i--){
			cont++;
			System.out.println(cont+ " Enter a number");
			number[i]= sc.nextInt();  
		}
		for(int i: number){
			System.out.println(i);
		}


	}
}





