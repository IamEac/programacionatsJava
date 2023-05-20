package Arrays;

/* Exercise 3 : Read 5 numbers by keyboard, store them in an array and then perform
 * the mean of the positive numbers, the mean of the negative numbers and count the number of zeros
 */
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		float sumpos=0, sumneg=0;
		int contpos=0, contneg=0;;
		float[] number = new float[5]; 
		float meanpositives=0, meannegatives=0, contzeros=0;
		
		System.out.println("Introduce 5 numbers");

		for(int i = 0; i<=4;i++) {
			System.out.println(i+1+" Introduce a number");
			number[i] = sc.nextFloat();
		
		
			if (number[i] == 0) {
				contzeros++;
			}else if (number[i] > 0) {
				contpos++;
				sumpos+=number[i];
				meanpositives = sumpos / contpos;
			}else if (number[i] < 0) {
				sumneg +=number[i];
				contneg++;
				meannegatives = sumneg / contneg;
			
			}

			}
	
		System.out.println("Mean positives : "+meanpositives);
		System.out.println("Mean negatives : "+meannegatives);
		System.out.println("Cont zeros : "+contzeros);
 }
}


