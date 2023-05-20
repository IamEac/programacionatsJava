package Operators;

import java.util.Scanner;

/*
 * Exercise 8: Build a program that calculates and displays the roots of the quadratic equation on the screen
 * of real coefficients
 * ax² + bx + c = 0
 * x = -b+-√b²-4ac/2a
 */

public class Exercise8 {

	public static void main(String[]args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("This program that calculates and displays the roots of the quadratic equation \n on the screen"
				+ "  of real coefficients \n"	+ "  ax² + bx + c = 0");
		double a,b,c;
		System.out.println("Intrudce a : " );
		a = sc.nextDouble();
		System.out.println("Intrudce b : " );
		b = sc.nextDouble();
		System.out.println("Intrudce c : " );
		c = sc.nextDouble();


		double numerator = Math.pow(b, 2)-4*a*c;
		double denominator = 2*a;
		double x1 = -b+Math.sqrt(numerator);
		double x2 = -b-Math.sqrt(numerator);

		double result1 = x1/denominator; 
		double result2 = x2/denominator; 


		System.out.println("x1 : " + result1);
		System.out.println("x2 : " + result2);

	}
}
