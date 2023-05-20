package Cycle;

/* Exercise 20 : Ask for a number N, introduce N salaries, and show the maximum salary
 * 
 */

import java.util.Scanner;

public class Exercise20 {

	public static void main(String[]args) { 

		Scanner sc = new Scanner(System.in);
		int salary=0;
		int salaryMax=0;
		int n=0;
		int i=1;

		System.out.println("Enter a number");
		n =Integer.parseInt(sc.nextLine());
		while(i<=n) {
			System.out.println("Ingrese sueldo "+i);
			salary = Integer.parseInt(sc.nextLine());
			if(salary>salaryMax) {
				salaryMax=salary;
			}
			i++;
		}System.out.println("el sueldo maximo es "+ salaryMax);

	}		


}

