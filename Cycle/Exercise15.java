package Cycle;

/* Exercise 15: Given the ages and heights of 5 students, show the average age and height; the number of students
 *  over 18 years of age and the number of students who measure more than 1.75
 */

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercise15 {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int age, plusAge=0, cont18 =0, cont175=0;
		float height, plusHeight=0, meanAge, meanHeight;
		
		for(int i=1; i<=5;i++) {
			
	
		age = Integer.parseInt(JOptionPane .showInputDialog("Student "+ i +  "\n Enter your age "));
		height = Float.parseFloat(JOptionPane.showInputDialog("Student " +i+ "\n Enter your height "));
		
		plusAge += age;
		plusHeight += 	height;
		
		if (age>18) {
			cont18++;
		}
		if(height >1.75) {
			cont175++;
		
			
		}
		}
		
		meanAge = (float) plusAge/5;
		meanHeight = (float) plusHeight/5;
		
		JOptionPane.showMessageDialog(null, "The average age is " + meanAge +"\nThe average height is " + meanHeight + "\nThe number of students over 18 is "+cont18+ "\nNumber of students who measure more than 1.75 : " + cont175);
		System.out.println("");
	}
}

