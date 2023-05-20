package Cycle;

/* While Loop
 * while(condition) {
 * Instructions;
 * }
*/

import java.util.Scanner;

public class While {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int contador , i = 1;
		 System.out.println("Introduce a number");
		contador = sc.nextInt();
		while(i<=contador) {
			System.out.println(i);
			i++;
		}
	}
}
