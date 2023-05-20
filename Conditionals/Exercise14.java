package Conditionals;

/* Exercise 14: Make a program that converts from Kg to another unit of measurement of mass, show
 * on screen a menu with the possible options
 */

import javax.swing.JOptionPane;

public class Exercise14 {

	public static void main(String[]args){

		float Hectogram, Decagram, Gram, Decigram, Centigram, Milligram;
		int option, amountKilos;


		option = Integer.parseInt(JOptionPane.showInputDialog("Convert Kg to another unit of mass\n"
				+ "1. Kg a Hectograms\n"
				+ "2. Kg a Decagrams\n"
				+ "3. Kg a Grams\n"
				+ "4. Kg a Decigrams\n"
				+ "5. Kg a Centigrams\n"
				+ "6. Kg a Milligrams\n"
				+ "7. Exit"));

		switch(option){

		case 1: amountKilos = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of Kg you want to convert"));
		Hectogram = (amountKilos * 10);
		JOptionPane.showMessageDialog(null, "Your conversion is "+Hectogram+"hg");
		break;

		case 2: amountKilos = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of Kg you want to convert"));
		Decagram = (amountKilos * 100);
		JOptionPane.showMessageDialog(null, "Your conversion is  "+Decagram+"Dg");
		break;

		case 3: amountKilos = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of Kg you want to convert"));
		Gram = (amountKilos * 1000);
		JOptionPane.showMessageDialog(null, "Your conversion is  "+Gram+"Dg");
		break;

		case 4: amountKilos = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of Kg you want to convert"));
		Decigram = (amountKilos * 10000);
		JOptionPane.showMessageDialog(null, "Your conversion is  "+Decigram+"Dg");
		break;

		case 5: amountKilos = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of Kg you want to convert"));
		Centigram = (amountKilos / 100000);
		JOptionPane.showMessageDialog(null, "Your conversion is  "+Centigram+"Dg");;
		break;

		case 6: amountKilos = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of Kg you want to convert"));
		Milligram = (amountKilos * 1000000);
		JOptionPane.showMessageDialog(null, "Your conversion is  "+Milligram+"Dg");
		break;

		case 7: break;
		default: JOptionPane.showInputDialog("The option you entered does not exist, please verify"); 


		}


	}

}
