package Cycle;

/* Exercise 11 : Design a program that displays the product of the first 10 odd numbers
 * 
 */

public class Exercise11 {

	public static void main(String[]args) {

		long mult = 1;

		int oddcont =0;

		for (int i = 1; i<=20; i+=2) {
			mult *= i;
		}
		System.out.println("The multiplication is : " + mult);


	}


}





