package Aufgabe.tag_01;

import javax.swing.JOptionPane; 

public class Niederschlag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n_april = Double.parseDouble(JOptionPane.showInputDialog("geben sie die Niederschlagsmenge für April an" ));
		double n_mai = Double.parseDouble(JOptionPane.showInputDialog("geben sie die Niederschlagsmenge für Mai an"));
		double n_juni = Double.parseDouble(JOptionPane.showInputDialog("geben sie die Niederschlagsmenge für Juni an"));
		
		double n_durchschnitt = (n_april + n_mai + n_juni) / 3;
		
		 
		
		JOptionPane.showMessageDialog(null, "Die Niederschlagsmenge für April ist: " + n_april + " l/gm" + "\n"
											+ "Die Niederschlagsmenge für Mai ist: " + n_mai + " l/gm" + "\n" 
											+ "Die Niederschlagsmenge für Mai ist: " + n_juni + " l/gm" + "\n" + "\n" 
											+ "Die durschnittliche Niederschlagsmenge beträgt: " + n_durchschnitt + " l/gm");
		
		
	}
	

}
