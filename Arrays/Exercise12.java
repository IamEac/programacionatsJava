package Arrays;

/* Exercise 12: Read by keyboard a table of 10 integer numeric elements
 * and a position (between 0 and 9). Delete the element located at the given position without leaving gaps.
 */

import java.util.Scanner;

public class Exercise12 {
	public static void main(String[] args) {
		int[] table = new int[10];
		Scanner sc = new Scanner(System.in);

		// Read a table of 10 integer elements
		System.out.println("Enter a table of 10 integer numbers:");
		for (int i = 0; i < 10; i++) {
			System.out.print("Element " + i + ": ");
			table[i] = sc.nextInt();
		}

		// Read the position to remove
		System.out.print("Enter a position (0-9) to remove an element: ");
		int position = sc.nextInt();

		// Validate the position
		while (position < 0 || position > 9) {
			System.out.print("Invalid position. Enter a position between 0 and 9: ");
			position = sc.nextInt();
		}

		// Remove the element at the given position
		table[position] = 0;

		// Display the updated table
        System.out.println("\nUpdated table:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Element " + i + ": " + table[i]);
        }

        sc.close();
    }
}
