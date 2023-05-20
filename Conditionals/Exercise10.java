package Conditionals;

/* Exercise 10 : Request the day, month and year of a date and indicate
 * if the date is correct, with months of 28, 30 and 31. No leap years
 */


import javax.swing.JOptionPane;

public class Exercise10 {

	public static void main(String[]args) {
		
		String month1;
		int month,day,year;

		month = Integer.parseInt(JOptionPane.showInputDialog("Enter the month "));
	
		switch (month) {
		case 1:
			month1 = "January";
			day = Integer.parseInt(JOptionPane.showInputDialog("Enter the day "));
			if ((day < 1 ) || (day>31)) {
				JOptionPane.showMessageDialog(null, "value " + day + " out of range, try again");
			}	else {
				year = Integer.parseInt(JOptionPane.showInputDialog("Enter the year "));
				if (year != 2023) {
					JOptionPane.showMessageDialog(null, "value " + year + " out of range, try again");
				} else {
					JOptionPane.showMessageDialog(null, month1 + "\n Day : " + day + " Month : " + month + " Year : " + year);
				}
			}
				break;
		case 2: 
			month1 = "February";
			day = Integer.parseInt(JOptionPane.showInputDialog("Enter the day "));
			if ((day < 1 ) || (day>28)) {
				JOptionPane.showMessageDialog(null, "value " + day + " out of range, try again");
			}	else {
				year = Integer.parseInt(JOptionPane.showInputDialog("Enter the year "));
				if (year != 2023) {
					JOptionPane.showMessageDialog(null, "value " + year + " out of range, try again");
				} else {
					JOptionPane.showMessageDialog(null, month1 + "\n Day : " + day + " Month : " + month + " Year : " + year);
				}
			}
			break;
		case 3: 
			month1 = "March";
			day = Integer.parseInt(JOptionPane.showInputDialog("Enter the day "));
			if ((day < 1 ) || (day>31)) {
				JOptionPane.showMessageDialog(null, "value " + day + " out of range, try again");
			}	else {
				year = Integer.parseInt(JOptionPane.showInputDialog("Enter the year "));
				if (year != 2023) {
					JOptionPane.showMessageDialog(null, "value " + year + " out of range, try again");
				} else {
					JOptionPane.showMessageDialog(null, month1 + "\n Day : " + day + " Month : " + month + " Year : " + year);
				}
			}
			break;
		case 4: 
			month1 = "April";
			day = Integer.parseInt(JOptionPane.showInputDialog("Enter the day "));
			if ((day < 1 ) || (day>30)) {
				JOptionPane.showMessageDialog(null, "value " + day + " out of range, try again");
			}	else {
				year = Integer.parseInt(JOptionPane.showInputDialog("Enter the year "));
				if (year != 2023) {
					JOptionPane.showMessageDialog(null, "value " + year + " out of range, try again");
				} else {
					JOptionPane.showMessageDialog(null, month1 + "\n Day : " + day + " Month : " + month + " Year : " + year);
				}
			}
			break;
		case 5: 
			month1 = "May";
			day = Integer.parseInt(JOptionPane.showInputDialog("Enter the day "));
			if ((day < 1 ) || (day>31)) {
				JOptionPane.showMessageDialog(null, "value " + day + " out of range, try again");
			}	else {
				year = Integer.parseInt(JOptionPane.showInputDialog("Enter the year "));
				if (year != 2023) {
					JOptionPane.showMessageDialog(null, "value " + year + " out of range, try again");
				} else {
					JOptionPane.showMessageDialog(null, month1 + "\n Day : " + day + " Month : " + month + " Year : " + year);
				}
			}
			break;
		case 6: 
			month1 = "June";
			day = Integer.parseInt(JOptionPane.showInputDialog("Enter the day "));
			if ((day < 1 ) || (day>30)) {
				JOptionPane.showMessageDialog(null, "value " + day + " out of range, try again");
			}	else {
				year = Integer.parseInt(JOptionPane.showInputDialog("Enter the year "));
				if (year != 2023) {
					JOptionPane.showMessageDialog(null, "value " + year + " out of range, try again");
				} else {
					JOptionPane.showMessageDialog(null, month1 + "\n Day : " + day + " Month : " + month + " Year : " + year);
				}
			}
			break;
		case 7: 
			month1 = "July";
			day = Integer.parseInt(JOptionPane.showInputDialog("Enter the day "));
			if ((day < 1 ) || (day>31)) {
				JOptionPane.showMessageDialog(null, "value " + day + " out of range, try again");
			}	else {
				year = Integer.parseInt(JOptionPane.showInputDialog("Enter the year "));
				if (year != 2023) {
					JOptionPane.showMessageDialog(null, "value " + year + " out of range, try again");
				} else {
					JOptionPane.showMessageDialog(null, month1 + "\n Day : " + day + " Month : " + month + " Year : " + year);
				}
			}
			break;
		case 8: 
			month1 = "August";
			day = Integer.parseInt(JOptionPane.showInputDialog("Enter the day "));
			if ((day < 1 ) || (day>31)) {
				JOptionPane.showMessageDialog(null, "value " + day + " out of range, try again");
			}	else {
				year = Integer.parseInt(JOptionPane.showInputDialog("Enter the year "));
				if (year != 2023) {
					JOptionPane.showMessageDialog(null, "value " + year + " out of range, try again");
				} else {
					JOptionPane.showMessageDialog(null, month1 + "\n Day : " + day + " Month : " + month + " Year : " + year);
				}
			}
			break;
		case 9: 
			month1 = "September";
			day = Integer.parseInt(JOptionPane.showInputDialog("Enter the day "));
			if ((day < 1 ) || (day>30)) {
				JOptionPane.showMessageDialog(null, "value " + day + " out of range, try again");
			}	else {
				year = Integer.parseInt(JOptionPane.showInputDialog("Enter the year "));
				if (year != 2023) {
					JOptionPane.showMessageDialog(null, "value " + year + " out of range, try again");
				} else {
					JOptionPane.showMessageDialog(null, month1 + "\n Day : " + day + " Month : " + month + " Year : " + year);
				}
			}
			break;
		case 10: 
			month1 = "October";
			day = Integer.parseInt(JOptionPane.showInputDialog("Enter the day "));
			if ((day < 1 ) || (day>31)) {
				JOptionPane.showMessageDialog(null, "value " + day + " out of range, try again");
			}	else {
				year = Integer.parseInt(JOptionPane.showInputDialog("Enter the year "));
				if (year != 2023) {
					JOptionPane.showMessageDialog(null, "value " + year + " out of range, try again");
				} else {
					JOptionPane.showMessageDialog(null, month1 + "\n Day : " + day + " Month : " + month + " Year : " + year);
				}
			}
			break;
		case 11: 
			month1 = "November";
			day = Integer.parseInt(JOptionPane.showInputDialog("Enter the day "));
			if ((day < 1 ) || (day>30)) {
				JOptionPane.showMessageDialog(null, "value " + day + " out of range, try again");
			}	else {
				year = Integer.parseInt(JOptionPane.showInputDialog("Enter the year "));
				if (year != 2023) {
					JOptionPane.showMessageDialog(null, "value " + year + " out of range, try again");
				} else {
					JOptionPane.showMessageDialog(null, month1 + "\n Day : " + day + " Month : " + month + " Year : " + year);
				}
			}
			break;
		case 12: 
			month1 = "December";
			day = Integer.parseInt(JOptionPane.showInputDialog("Enter the day "));
			if ((day < 1 ) || (day>31)) {
				JOptionPane.showMessageDialog(null, "value " + day + " out of range, try again");
			}	else {
				year = Integer.parseInt(JOptionPane.showInputDialog("Enter the year "));
				if (year != 2023) {
					JOptionPane.showMessageDialog(null, "value " + year + " out of range, try again");
				} else {
					JOptionPane.showMessageDialog(null, month1 + "\n Day : " + day + " Month : " + month + " Year : " + year);
				}
			}
			break;
		default:
			JOptionPane.showMessageDialog(null, "value " + month + " out of range, try again");
			break;
		}	
	}
}

