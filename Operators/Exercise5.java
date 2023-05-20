package Operators;

import java.util.Scanner;

/*
 * Exercise 5: The final grade of a Computer Science student is calculated based on the grades
 * of four aspects of their academic performance: Participation, First partial exam, Second partial exam and
 * final exam. Knowing that the previous ratings enter the final rating with weights
 * of 10%, 25%, 25% and 40%, Make a program that calculates and prints the final grade obtained by a student
 */
public class Exercise5 {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		float grade, participation, exam1,exam2,examfinal;
		String student;

		System.out.println("Hello, we are going to calculate the grade you have obtained in this course.");
		System.out.println("What is your name? : ");
		student = sc.next();
		
		System.out.println("Ok " + student + " What is the participation rating? (1-100)");
		participation = sc.nextFloat();
		participation*=0.10f;
		
		System.out.println("What is the qualification of the first partial?");
		exam1 = sc.nextFloat();
		exam1*=0.25f;
		
		System.out.println("What is the qualification of the second partial?");
		exam2 = sc.nextFloat();
		exam2*=0.25f;
		
		System.out.println("What is the qualification of the final exam?");
		examfinal = sc.nextFloat();
		examfinal*=0.40f;
		
		grade = participation + exam1 + exam2+ examfinal;
		System.out.println(student + " The final grade is: " + grade);
		
	}

}
