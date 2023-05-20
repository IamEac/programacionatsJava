package Cycle;

/* Exercise 22 : Ask for 5 student grades and say at the end if there is any fail
 * 
 */

import java.util.Scanner;

public class Exercise22 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		float grade;
		int cont=0;
		boolean failstudent = false;
		
		System.out.println("Enter 5 student grades : ");
		for (int i =1;i<=5;i++) {
			System.out.println(i+" Enter your rating");
			grade = sc.nextFloat();
			
			if((grade < 0)  || (grade>10)) {
				System.err.println("Enter a value between 1 and 10");
				i-=1;
			}
			else if ((grade <=4) && (grade <=10)) {
				
				failstudent = true;
				cont++;
			}
				
		
		}
		if (failstudent == true) {
			System.out.println("There are failed students, they are exactly : " + cont);
		}
		else {
			System.out.println("All students passed");
		}
		
	}
}
