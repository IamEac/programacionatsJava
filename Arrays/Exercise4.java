package Arrays;

/* Exercise 4: Read 10 integers, store them in an array.
 * We must show them in the following order: the first, the last
 * the second, the penultimate, the third, etc. 
 */
import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int number[] = new int[10];

		System.out.println("enter 10  numbers");

		for(int i=0;10>i;i++){
			System.out.print((i+1)+ ": ");
			number[i] = sc.nextInt();
		}
		System.out.println("\nNew Order");

		for(int i=0;5>i;i++){
			System.out.println((i+1) + ": "+number[i]);
			System.out.println((10-i) + ": "+number[9-i]);
		}
	}

}






