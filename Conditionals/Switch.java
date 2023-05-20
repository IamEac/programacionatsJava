package Conditionals;

import javax.swing.JOptionPane;

/* The switch statement:
 * 
 * switch (data) {
 * case 1: Instruction;
 * 	break;
 * case 2: Instruction;
 *  break;
 *  ...
 * case n: InstructionN;
 *  break;
 * default: diferentCase;
 *  break;
 *  }
 */

public class Switch {

	public static void main(String[]args) {

		int data;
		data = Integer.parseInt(JOptionPane.showInputDialog("Introduce a number between 1-5"));

		switch (data) {
		case 1:
			JOptionPane.showMessageDialog(null, "This is the number " + data);
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "This is the number " + data);
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "This is the number " + data);

			break;
		case 4:
			JOptionPane.showMessageDialog(null, "This is the number " + data);

			break;
		case 5:
			JOptionPane.showMessageDialog(null, "This is the number " + data);

			break;
		default:
			JOptionPane.showMessageDialog(null, "Introduce a number between 1-5");

		}

	}
}
