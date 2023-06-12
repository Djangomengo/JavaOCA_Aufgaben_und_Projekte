package aufgaben_buch.chapter_05.kreis;


import aufgaben_buch.chapter_05.rechteck.Rechteck;

import javax.swing.*;

public class FlaechengleicherKreis {
    public static void main(String[] args) {
        Rechteck rechteck = new Rechteck();
        Kreis kreis = new Kreis();

        double usrBreiteInput = Double.parseDouble(JOptionPane.showInputDialog("Geben sie Breite ihres Rechtecks an: "));
        double usrlaengeInput = Double.parseDouble(JOptionPane.showInputDialog("Geben sie Länge ihres Rechtecks an: "));
        rechteck.setSeiten(usrBreiteInput, usrlaengeInput);

        kreis.setFlaeche(rechteck.getFLaeche());

        String ausgabe  = String.format("Rechtecklänge: %.2f \n"
                                          + "Rechteckbreite: %.2f \n"
                                          + "Rechteckfläche: %.2f \n \n"
                                          + "Kreisradius: %f \n"
                                          + "Kreisfläche: %.2f", rechteck.getLaenge(), rechteck.getBreite(), rechteck.getFLaeche(),
                                          kreis.getRadius(), kreis.getFlaeche());

        System.out.println(ausgabe);
    }
}
