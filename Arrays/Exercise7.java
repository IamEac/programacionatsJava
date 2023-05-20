package Arrays;

/* Exercise 7: Read by keyboard a series of 10 integers. 
 * The application has to tell us if the numbers are arranged in an increasing,
 *  decreasing or unordered manner.
 */

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int array[] = new int[10];
		boolean cr = false, dc = false;

		System.out.println("Fill the array");

		for(int i=0; i < array.length;i++){
			System.out.print((i+1)+"Enter a number: ");
			array[i] = sc.nextInt();	
		}

		for (int i = 0;i<9;i++) {
			if(array[i] < array[i+1]) {
				cr = true;
			}
			if(array[i] > array[i+1]) {
				dc = true;
			}
		}  

		if(cr == true && dc == false) {
			System.out.println("the series is growing");
		}
		else if (cr == false && dc == true) { 
			System.out.println("the series is decreasing");
		}
		else if(cr == true && dc == true) {
			System.out.println("the series is messed up");
		}
		else if (cr == false & dc == false) {
			System.out.println("the series is the same");

		}
	}
}
