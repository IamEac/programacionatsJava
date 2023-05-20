package Cycle;

/*
 * Exercise 16: Ask for a number (which must be between 0 and 10) and show the multiclarity table of that number
 */


import java.util.Scanner;

public class Exercise16 {

	public static void main(String[]args) {
	
		Scanner sc = new Scanner (System.in);
		System.out.println("What multiplication table do you want to see?");
        int mult = sc.nextInt();
        int i = 1;
        
        while(i <= 10) {
            System.out.println(  i + " x " + mult + " = " + ((i)*mult));
            i++;
        }
		}
	}
