package Conditionals;

/* Exercise 9 : Ask for the day, month and
 * year of a date and indicate whether the date is correct.
 * Assuming that every month is 30 days
 */

import javax.swing.JOptionPane;

public class Exercise9 {

	public static void main(String[]args) {

		int month, day, year;

		day = Integer.parseInt(JOptionPane.showInputDialog("Enter the day "));


		if ((day < 1 )|| (day>30)) {
			JOptionPane.showMessageDialog(null, "value out of range, try again");

		} 	else {
			month = Integer.parseInt(JOptionPane.showInputDialog("Enter the month "));
			if ((month < 1 )|| (month>12)) {
				JOptionPane.showMessageDialog(null, "value out of range, try again");

			}
			else {
				year = Integer.parseInt(JOptionPane.showInputDialog("Enter the year "));
				if (year != 2023) {
					JOptionPane.showMessageDialog(null, "value out of range, try again");

				} else {
					JOptionPane.showMessageDialog(null, " Day " + day + " Month " + month + " Year " + year);

				}

			}


		}

	}
}



	

