package Arrays;

/* Exercise 8 : Design an application that declares a table of 10 integer elements.
 * Read through the keyboard 8 numbers. Then you must ask for a number and a position,
 * insert it in the indicated position, displacing those behind it.
 */

import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {


		// Declare a table of 10 integer elements.
		int[] numbers = new int [10];
		int x, position;

		// Read through the keyboard 8 numbers.
		Scanner sc = new Scanner(System.in);
		System.out.println("Fill the array :");
		for(int i=0;i<=8;i++){
			System.out.print(i+".Enter a number:  ");
			numbers[i]=sc.nextInt();
		}

		// Ask for a number and a position.

		System.out.println("Enter the number you want to add to the table:");
		x=sc.nextInt();
		System.out.println("Enter the position of the number 0 / 9");	
		position = sc.nextInt();

		// Insert the number at the indicated position

		if ((position < 0) || (position >= numbers.length))  {
			System.err.println("enter a value between 0 or 9");
		} 
		else  {
			// Move the elements back
			for (int i=numbers.length-1;i>position;i--){
				numbers[i] = numbers[i-1];
			}
			// Insert the number at the indicated position
			numbers[position] = x;

			// Print the updated table
			System.out.println("Array : ");
			for (int i=0;i<numbers.length;i++) {
				System.out.println(numbers[i] + " ");
			}
		}
	}
}



