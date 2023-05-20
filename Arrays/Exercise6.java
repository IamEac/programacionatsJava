package Arrays;

/* Exercise 6: Read the data corresponding to two tables of 12 numerical elements, and mix them
 * in a third of the form: 3 from table A, 3 from B, another 3 from A, another 3 from B, etc.0
 */

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[]args ) {

		Scanner sc = new Scanner(System.in);

		int a[] = new int[12];
		int b[] = new int [12];
		int c[] = new int[24];

		System.out.println(" Enter 12 numbers A");
		for(int i= 0; i<a.length; i++) {
			System.out.print(" Enter " + (i+1)+ " number ");
			a[i] = sc.nextInt();
		}


		System.out.println(" Enter 12 numbers B ");
		for( int i = 0; i<b.length; i++) {
			System.out.print(" Enter" + (i+1) + " number:");
			b[i] = sc.nextInt();
		}

		int j = 0;

		for(int i = 0; i<12; i+=3) {
			c[j] = a[i];
			j++;
			c[j] = a[i+1];  
			j++;
			c[j] = a[i+2];  
			j++;

			c[j] = b[i];
			j++;
			c[j] = b[i+1];
			j++;
			c[j] = b[i+2];
			j++;
		}

		System.out.println("Results : ");
		for(int i = 0; i<24; i++) {
			System.out.print(c[i] + " ");
		}
		System.out.println();
		System.out.println();
	}
}