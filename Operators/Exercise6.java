package Operators;

import java.util.Scanner;

/*
 * Exercise 6 : Make a program that calculates the square of a sum.
 * (a+b)² = a² + b² + 2ab
 */

public class Exercise6 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		double a,b;
		System.out.println("Introduce a");
		a = sc.nextInt();
		System.out.println("Introduce b");
		b= sc.nextInt();
		double result  = Math.pow(a, 2) + Math.pow(b, 2) + (2*a*b);
		
		System.out.println(" (a+b)² = a² + b² + 2ab : " + result );

	}
}
