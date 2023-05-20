package Conditionals;

import javax.swing.JOptionPane;

/*Exercise 5: A worker needs to calculate his salary
 * weekly, which is obtained as follows:
 * If he works 40 hours or less he is paid $16 per hour
 * If you work more than 40 hours you are paid $16 for each
 * one of the first 40 hours and $20 for each hour is

 */
public class Exercise5 {

	public static void main(String[]args) {

		double salaryweek , hours;

		hours = Double.parseDouble(JOptionPane.showInputDialog(null, " enter how many hours you work "));

		if (hours <= 40) { 
			salaryweek = 16*hours;
		}
		else {
			salaryweek = (40*16) + ((hours-40)*20);

		}

		JOptionPane.showMessageDialog(null, "the salary week will be : "+ salaryweek );

	}
}

