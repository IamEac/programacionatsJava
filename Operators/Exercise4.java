package Operators;

import java.util.Scanner;

/* Exercise 4: A used car sales company pays its sales staff a salary of $1,000 per month,
 * plus a commission of $150 for each car sold, plus 5% of the value of the sale by car.
 * Every month the company's data entry manager enters into the computer the relevant data. 
 * Write a program that calculates and prints the monthly salary of a given salesperson.
 */

public class Exercise4 {

	public static void main (String[]args) {

		Scanner sc = new Scanner(System.in);
		String employer; 
		float  carSelled , carPrice, comission, total;
		


		System.out.println("Hello, we are going to calculate your total salary, please tell me your name : ");
		employer = sc.next();
		System.out.println("Hi " + employer +" How many cars did you sell this month? : ");
		carSelled = sc.nextFloat();
		System.out.println("Your commission for selling " + carSelled + " cars is : " + carSelled * 150);
		carSelled *=150;
		System.out.println("Introduce how much is the price of the sell");
		carPrice = sc.nextFloat();
		comission = (carPrice*5)/100;
		comission *=5;
		System.out.println("Your comission for sell this car is : " + comission);

		total = 1000+carSelled+comission;
		System.out.println(employer + " Your salary total is : " + total);


		/*
		 * The main problem is that all the cars cost the same, 
		 * we want to make a program that tells me how many cars 
		 * he sold and stores the price nof each car sold in a single
		 *  variable, according to the information given by the user 
		 *  about how many cars he sold.
		 */

	}


}
