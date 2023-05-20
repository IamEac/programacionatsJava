package Cycle;

/* Exercise 21 : Ask for 10 numbers and show at the end if any negative has been entered
 * 
 */

import java.util.Scanner;

public class Exercise21 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
			
		int number, cont = 0;
				
			for (int i = 1; i<=10; i++) {
			System.out.println(i+ " Enter a number : ");
			number = sc.nextInt();
			if(number <0) {
				cont++;
			}
			
		
		}	
			System.out.println("Negative numbers : " + cont);

		}
}
	
