package Basic;
import java.util.Scanner;

public class DataEntry {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			
			int number;
			
			System.out.println("Enter your age");
			number = sc.nextInt();
			System.out.println("Your age is : "+ number);
			
			String chain;
			System.out.println("Type a string");
			chain = sc.next();
			System.out.println("The string is : " + chain);
			
			char letter;
			System.out.println("Type a letter");			
			letter = sc.next().charAt(0);
			System.out.println("The letter is : " + letter);
			
	}
}
