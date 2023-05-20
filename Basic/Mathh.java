package Basic;

import java.util.Scanner;
import java.lang.*;

public class Mathh {

	public static void main(String[] args) { 

		// The math.sqrt class is used to find the root of a number, and it works with double.

		double root = Math.sqrt(8);

		System.out.println("The root is : "+ root);

		// Math.pow is used to raise a number to the power.

		double base = 4; double exponent = 2;
		double result = Math.pow(base, exponent);

		System.out.println("The result of a potentiation is : "+ result);

		// Math.round is used to round a number

		double num = 4.56;
		double result1 = Math.round(num);
		System.out.println("The result of rounding is : "+ result1);

		//Math.random works to give a random number 


		int	 x =  (int) (Math.random() * 10);


		System.out.println(x);
	}
} 

