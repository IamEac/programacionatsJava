package Operators;

import java.util.Scanner; 

/* Exercise 1: Make a program that calculates 
 * and prints the sum of three grades
 */

public class Exercise1 {

	public static void main(String[]args) {

		Scanner sc = new Scanner(System.in);
		float a,b,c;

		System.out.println("Insert rating 1: ");
		a=sc.nextFloat();
		System.out.println("Insert rating 2: ");
		b=sc.nextFloat();
		System.out.println("Insert rating 3: ");
		c=sc.nextFloat();
		float result = a+b+c;

		System.out.println("The sum of the 3 classifications is: " + result);
	}

}
