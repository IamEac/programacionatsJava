package Conditionals;

import javax.swing.JOptionPane;

/* Exercise 7 : Ask for three numbers and show them in order from highest to lowest
 * 
 */

public class Exercise7 {

	public static void main(String[]args) {
		
		int a,b,c;
		
	
		a = Integer.parseInt(JOptionPane.showInputDialog("Introduce a number 1"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Introduce a number 2"));
		c = Integer.parseInt(JOptionPane.showInputDialog("Introduce a number 3"));
		
		
		if((a>b) && (b>c)) {
			JOptionPane.showMessageDialog(null, "order : "+a+" - "+b+" - "+c);       

		}else if ((a>c) && (c>b)) {
			JOptionPane.showMessageDialog(null, "order : "+a+" - "+c+" - "+b);  
			
		}else if ((b>c) && (c>a)) {
			JOptionPane.showMessageDialog(null, "order : "+b+" - "+c+" - "+a);       

		}else if ((b>a) && (a>c)) {
			JOptionPane.showMessageDialog(null, "order : "+b+" - "+a+" - "+c);       
		
		}else if ((c>a) && (a>b)) {
			JOptionPane.showMessageDialog(null, "order : "+c+" - "+a+" - "+b);       
		
		}else if ((c>b) && (b>a)) {
			JOptionPane.showMessageDialog(null, "order : "+c+" - "+b+" - "+a);       
			
		}else if((a==b) && (b==c)) {
			JOptionPane.showMessageDialog(null, "order : "+a+" - "+b+" - "+c);       
	
		
	}
}
}