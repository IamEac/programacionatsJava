package Arrays;

/* Exercise 11: Read 5 numerical elements to be introduced in increasing order.
 * We will store these in a table of size 10. Read a number N, and insert it in the place
 * suitable for the table to remain ordered  
 */

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[]args) {
		
		// Declare variables
		Scanner sc = new Scanner (System.in);
		int [] numbers = new int[10];	
		int n, site_num=0,j=0;
		boolean cr = true; 


		System.out.println("Insert 5 numbers in increasing order");
		do {
			// Fill Array
			for (int i = 0; i<5; i++) {
				System.out.println(i+1+": Enter a number");
				numbers[i] = sc.nextInt();
			}
			//	Check if it is ordered in descending order
			for (int i=0;i<4;i++) {
				if(numbers[i]<numbers[i+1]) { //Increasing 1*2*3
					cr =  true;
				}
				if(numbers[i]>numbers[i+1]) { //Decreasing
					cr = false; 
					break;
			}
		}	
			if (cr == false) {
				System.err.println("The array is nor order in the increasing way, try again");
			}
		}while(cr == false);
		
		System.out.println("Enter a number to insert");
		n = sc.nextInt();
		
		// This is to realize in which position the number goes
		while(numbers[j]<n && j<5) {
			site_num++;
			j++;
		}
		
		// Finally, we transfer a position in the array to the elements that come after the number
		
		for (int i=4; i>=-site_num;i--) {
			numbers[i+1] = numbers[i];
		}
		
		// Insert the number that the user entered 
		numbers[site_num] = n;

		System.out.println();
		for(int i = 0;i<6;i++) {
			System.out.println(numbers[i]+" - ");
		}
		System.out.println();
}
}
