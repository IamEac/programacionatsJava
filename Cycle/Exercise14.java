package Cycle;

/* Exercise 14 : Request 10 salaries. Show their sum and how many are greater than $1000
 * 
 */

import java.util.Scanner;

public class Exercise14 {

	public static void main (String[]args ) {

		Scanner sc = new Scanner(System.in);
	
		int salary = 0, cont = 0;
		double  sum = 0;

		
		for (int i = 1;i <= 10; i++) {

			System.out.println(i + " : Enter your salary");
			salary = sc.nextInt();
		
			sum += salary;
			
			if (salary > 1000) {
				cont++;

			}
		}
	
		System.out.println("The sym of the salary is " + sum + " and there is " + cont + " greater than 1000$");
		
	} 
	
}
