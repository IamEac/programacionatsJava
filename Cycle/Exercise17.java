package Cycle;

import javax.swing.JOptionPane;

/* Exercise 17: A company that sells disinfectants needs a program
 * to manage invoices. Each invoice includes: the article code, the quantity sold
 * in liters and the price per liter. 5 invoices entered are requested:
 * Total billing, quantity in liters sold of article 1 and how many invoices were issued for more than $600
 */

public class Exercise17 {

	public static void main(String[]args) {

		int code, liter, literArt1=0, cont600=0;
		float priceLiter, totalBill, pricetotal=0;

		for (int i=1;i<=5;i++) {
			code = Integer.parseInt(JOptionPane .showInputDialog("Article N "+i+"\nEnter the code"));

			liter = Integer.parseInt(JOptionPane .showInputDialog("Article N "+i+"\nEnter the amount of liter"));
			

			priceLiter = Float.parseFloat(JOptionPane .showInputDialog("Article N "+i+"\nEnter the  price"));
		
			totalBill = (float) liter * priceLiter;
			pricetotal += totalBill;
			
			if (code == 1) {
			literArt1 += liter;
		}
			if(totalBill>600) {
				cont600++;
			}
		}
		System.out.println("Sales Sumary : ");
		System.out.println("Total Billed : " + pricetotal);
		System.out.println("Quantity in liters sold of article 1 : "+ literArt1);
		System.out.println("Number of invoices greater than $600 : " + cont600);

	}
}
