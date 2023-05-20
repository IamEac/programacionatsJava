package Arrays;

/* Exercise 9 : Create a program that reads from the keyboard a table of 10 integers and the
 * move down one position: first becomes second, second becomes
 * be the third and so on. The last becomes the first.
 */

import java.util.Scanner;


public class Exercise9 {

	public static void main(String[]args) {

		// Declare a table of 10 integer elements and the last
		int table [] = new int[10];
		int last;

		// Read through the keyboard 10 numbers.

		Scanner sc = new Scanner(System.in);

		System.out.println("Fill the array with 10 elements");
		for (int i=0; i<table.length; i++) {
			System.out.println(i+". Enter a number ");
			table[i] = sc.nextInt();
		}
		
		last = table[9];
		// We advance one position down in the array
		for(int i=8;i>=0;i--) {
			table[i+1] = table[i];
		}
		table[0] = last;

		//Print new array
		System.out.println("New Array");
		for(int i=0;i<10;i++) {
			System.out.println(i+"Number: "+table[i]);
		}
	}
}
