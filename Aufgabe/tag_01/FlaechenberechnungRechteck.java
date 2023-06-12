package Aufgabe.tag_01;

import javax.swing.JOptionPane; 

public class FlaechenberechnungRechteck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r_laenge = Double.parseDouble(JOptionPane.showInputDialog("Geben sie die Länge des Rechtecks in cm an: "));
		double r_breite = Double.parseDouble(JOptionPane.showInputDialog("Geben sie die Breite des Rechtecks an: "));
		
		String output_laenge =("Die eingegebene Länge beträgt: " +  r_laenge + "cm \n" );
		String output_breite =("Die eingegebene Breite beträgt: " +  r_breite + "cm \n \n" );
		
		double umfang = 2 * r_laenge + 2 * r_breite;
		double flaeche = r_laenge * r_breite;
		
		String ausgabe_umfang = "Der Umfang beträgt: " + umfang + "cm \n";
		String ausgabe_flaeche = "Der Umfang beträgt: " + flaeche + "cm² \n";
		
		String output = output_laenge + output_breite + ausgabe_umfang + ausgabe_flaeche;
		
		JOptionPane.showMessageDialog(null,output);

	}

}
