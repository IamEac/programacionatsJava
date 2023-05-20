package Basic;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args ) {
		Scanner sc = new Scanner(System.in);

		float a, b, addition, subtraction, multiplication,division, remainder;

		System.out.println("Type two numbers");

		a=sc.nextFloat();
		b=sc.nextFloat();

		addition = a+b;
		subtraction = a-b;
		multiplication = a*b;
		division = a/b;
		remainder = a%b;

		System.out.println("The result of the sum is " + addition);
		System.out.println("The result of the subtraction  is " + subtraction);
		System.out.println("The result of the multiplication is " + multiplication);
		System.out.println("The result of the division is " + division);
		System.out.println("The result of the remainder is " + remainder);

		if(division == a/0) {
			System.err.println("You can't split with 0");		    } 

	/*
	 * Operators Arithmetic operators combined with assignment
	 */

		int num = 10;
		num = num + 5;
		System.out.println(num); 
		
		// o lo mismo
		num+=5;	
		
	//Increase and decrease	
		
		int x = 5;
		x++; // x += 1; or x--;  
		int y = ++x;
		System.out.println("Y is : " +y  );
		
		
	}

}

