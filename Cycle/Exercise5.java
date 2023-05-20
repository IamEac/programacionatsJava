package Cycle;

/* Exercise 5 : Play a game to guess a number. To do this, generate a random number.
 * between 0-100, and then ask for numbers indicating "it is greater" or "it is less" depending on whether it is greater
 * or less with respect to N. The process ends when the user hits and show the number of attempts
 */

import javax.swing.JOptionPane;

public class Exercise5 {

	public static void main(String[]args) {

		int random, number, cont=0;

		random =  (int) (Math.random() * 100);

		System.out.println(random);

		do {
			number = Integer.parseInt(JOptionPane.showInputDialog("Introduce a number "));

			if (random > number) { 
				JOptionPane.showMessageDialog(null,"it is greater ");
			} else if (random < number){
				JOptionPane.showMessageDialog(null, "it is less ");
			}
			cont++;

		}while(number != random);

		JOptionPane.showMessageDialog(null,"Correct, total number of attempts:"+cont+" numbers.");    		
	}		
}


