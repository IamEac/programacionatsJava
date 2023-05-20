package Cycle;

/* Exercise 19: Given 6 grades, write the number of students passed, conditional (=4) and failed.
 * 
 */

import java.util.Scanner;

public class Exercise19 {
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int grade, contpass=0, contcond=0, contfail=0;
		
		for (int i = 1; i<=6; i++) {
			System.out.println("Student : "+i+" enter your grade, 1 or 10");
			grade = sc.nextInt();
			
			if ((grade == 1) || (grade == 2) || (grade == 3)) {
				contfail++;
			} else if ((grade <= 0) || (grade >10)) {
				System.err.println("Enter a number between 1 or 10");
				 i-=1;
			}

			if (grade==4) {
				contcond++;
			}
			if ((grade==5) || (grade==6) || (grade==7) ||  (grade==8) ||  (grade==9) || (grade==10)) {
				contpass++;
			}
					}	
		
		System.out.println("Students passed : " + contpass);
		System.out.println("Students conditional : " + contcond);
		System.out.println("Students failed : " + contfail);
		}
	}


