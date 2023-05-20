package Operators;

import java.util.Scanner;

/* Exercise 7 : Build a program that, given a total number of hours, 
 * returns the number of weeks equivalent days and hours. 
 * For example, given a total of 1000 hours, it should show 5 weeks, 6 days and 16 hours.
 */

public class Exercise7 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hours, weeks, days, total;
		
		

		System.out.println("Introduce a number of hours");
		hours = sc.nextInt();
		
		weeks = hours / 168;
		days = hours%168 / 24;
		total = hours%24; 
		
		System.out.println(weeks + " weeks, " + days + " days and " + total + " hours");
		
		
	}
}
