package Basic;

import javax.swing.JOptionPane;

public class DataEntryJOptionPane {

	public static void main(String[]args) { 
			
		String Chain;
		int Integerr;
		char Letter;
		double Decimal;
		
		Chain = JOptionPane.showInputDialog("Type a string: ");
		Integerr = Integer.parseInt(JOptionPane.showInputDialog("Type a integer: "));
		Letter = JOptionPane.showInputDialog("Type a letter: ").charAt(0);
		Decimal = Double.parseDouble(JOptionPane.showInputDialog("Type a decimal: "));
		
		JOptionPane.showMessageDialog(null, "The String is :" + Chain);
		JOptionPane.showMessageDialog(null, "The Integer is :" + Integerr);
		JOptionPane.showMessageDialog(null, "The Letter is :" + Letter);
		JOptionPane.showMessageDialog(null, "The Decimal is :" + Decimal);
	}
}
