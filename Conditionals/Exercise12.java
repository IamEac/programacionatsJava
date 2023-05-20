package Conditionals;

/* Exercise 12 : Ask for a score from 0 to 10 and show it as: Insufficient,
 *  Sufficient, Good, Notable and Outstanding
 */

import javax.swing.JOptionPane;

public class Exercise12 {

	public static void main(String[]args) {

		int score;

		score = Integer.parseInt(JOptionPane.showInputDialog("Introduce your score = 0 / 10 "));

		switch(score) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		JOptionPane.showMessageDialog(null, "The result of score is Insufficient");	
			break;
		case 5:
		case 6:
		JOptionPane.showMessageDialog(null, "The result of score is Sufficient");	
			break;
		case 7:
		JOptionPane.showMessageDialog(null, "The result of score is Good");	
			break;
		case 8:
		case 9:
		JOptionPane.showMessageDialog(null, "The result of score is Notable");	
			break;
		case 10:
		JOptionPane.showMessageDialog(null, "The result of score is Outstanding");	
			break;
		default:	
			JOptionPane.showMessageDialog(null, "Introduce a number between 0-10");	
			break;
		}
	}
}
