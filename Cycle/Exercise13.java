package Cycle;

/* Exercise 13: Ask for 10 numbers. Show the mean of the positive numbers, the mean of the numbers
 * negatives and the number of zeros
 */

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercise13 {

	public static void main(String[]args) {

		int number, additionPositive=0, contPositive=0, additionNegative=0, contNegative=0, contZeros=0;
		float mean_pos , mean_neg;

		for(int i=1; i<=10; i++) {
			number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));

			if(number==0) {
				contZeros++;
			}
			else if(number>0) {
				additionPositive += number;
				contPositive++;
			}
			else {
				additionNegative += number;
				contNegative++;
			}

		}

		if (contPositive == 0) {
			System.out.println("It is not possible to take the average of the positives");
		}
		else {
			mean_pos = (float) additionPositive/contPositive;
			System.out.println("The mean of the numbers positives is : "+ mean_pos);

		}

		if(contNegative == 0) {
			System.out.println("It is not possible to take the average of the positives");

		}
		else { 
			mean_neg = (float) additionNegative / contNegative;
			System.out.println("The mean of the numbers negatives is : "+ mean_neg);

		}
		System.out.println("The number of zeros is = " +contZeros);


	}
}
