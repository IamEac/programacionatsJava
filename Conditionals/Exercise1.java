package Conditionals; 

import javax.swing.JOptionPane;

/* Exercise 1 : Make a program that reads an integer and shows if the number is a multiple of 10
 * 
 */
public class Exercise1 {

	public static void main(String []args) {

        int i = Integer.parseInt(JOptionPane.showInputDialog("Introduce a number"));

		if(i%10==0) {
			JOptionPane.showInputDialog("This numer " + i + " is multiple of 10");
		}
		else {
			JOptionPane.showInputDialog("This number " + i + " isn't multiple of 10");
	}
}

}
