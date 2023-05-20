package Cycle;

/*  Do while loop
 * do {
 * Instructions;
 * }while(condition)
 */

import java.util.Scanner;

public class doWhile {

	public static void main(String[]args) {
	
	Scanner sc = new Scanner(System.in);
		int i = 1, cont;
		
		System.out.println("Enter the number of terms");
		cont = sc.nextInt();
		
		do {
			System.out.println(i);			
			i+=3;
			}while(i<=cont);
	}
}

