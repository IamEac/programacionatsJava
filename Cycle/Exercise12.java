package Cycle;

/* Exercise 12 : Ask for a number and calculate its factorial
 * N! = 1*2*3*...*N
 */

import java.util.Scanner;

public class Exercise12 {

	public static void main(String[]args) {
		int n;
		double factorial = 1;
		Scanner sc = new Scanner(System.in);

		do {  
			System.out.print("Enter a whole number >= 0: ");
			n = sc.nextInt();
		} while (n < 0);


		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}

		System.out.printf("%d! = %.0f %n", n, factorial); 
	}
}
