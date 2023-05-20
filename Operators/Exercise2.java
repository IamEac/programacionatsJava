package Operators;

import java.util.Scanner;

/* Exercise 2: Make a schedule that calculates and prints an employee's weekly salary
 * from their weekly hours worked and their hourly wage 
 */

public class Exercise2 {

	public static void main(String[]args) {

		Scanner sc = new Scanner(System.in);

		float salaryWeekly, hoursWeekly, salaryHour;

		System.out.println("Introduce hours worked for week");
		hoursWeekly = sc.nextFloat();
		System.out.println("Now introduce your salary for hour");
		salaryHour = sc.nextFloat();

		salaryWeekly = hoursWeekly * salaryHour; 
		System.out.println("Your salary weekly is :" + salaryWeekly);
	}

}
