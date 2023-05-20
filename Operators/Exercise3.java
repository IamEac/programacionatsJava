package Operators;

import java.util.Scanner;

/* Exercise 3: Guillermo has n Dollars. Luis has half of what Guillermo owns.
 * Juan has half of what Luis owns and Guillermo together.
 *  Make a program that calculates and prints the amount of money they have between the three
 * 
 */
public class Exercise3 {

	public static void main(String[]args) {

		Scanner sc = new Scanner(System.in);
		float Guillermo, Luis, Juan, Result;

		System.out.println("Introduces the dollars of Guillermo");
		Guillermo = sc.nextFloat();
		System.out.println("Guillermo: " + Guillermo);
		Luis = Guillermo/2.0f;
		System.out.println("Luis: "+ Luis);
		Juan = (Luis + Guillermo) / 2.0f;
		System.out.println("Juan: " + Juan);

		Result = Juan+Luis+Guillermo;
		System.out.println("The amount of money they have between the three is: " + Result);


	}
}
