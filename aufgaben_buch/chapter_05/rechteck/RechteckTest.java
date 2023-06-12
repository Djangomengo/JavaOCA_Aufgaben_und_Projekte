package aufgaben_buch.chapter_05.rechteck;

import javax.swing.*;

public class RechteckTest {
    public static void main(String[] args) {

        Rechteck rechteck = new Rechteck();

        double usrBreiteInput = Double.parseDouble(JOptionPane.showInputDialog("Geben sie Breite ihres Rechtecks an: "));
        double usrlaengeInput = Double.parseDouble(JOptionPane.showInputDialog("Geben sie Länge ihres Rechtecks an: "));
        rechteck.setSeiten(usrBreiteInput, usrlaengeInput);

        String userAuswahl = JOptionPane.showInputDialog("Wollen sie die Größe des Rechtecks verändern? ").toLowerCase();

        if (userAuswahl.equals("ja")){
            String userAuswahlVerkleinern = JOptionPane.showInputDialog("Wollen Sie die Dimension des Rechtecks verkleinern ?").toLowerCase();

            if (userAuswahlVerkleinern.equals("ja")){
                double breitedown = Double.parseDouble(JOptionPane.showInputDialog("Um wie viel cm Soll die Breite des Rechtecks Verkleinern werden"));
                rechteck.breiteVerkleinern(breitedown);

                double laengedown = Double.parseDouble(JOptionPane.showInputDialog("Um wie viel cm Soll die Länge des Rechtecks Verkleinern werden"));
                rechteck.langeVerkleinern(laengedown);

            } else if (userAuswahlVerkleinern.equals("nein")) {
                String userAuswahlVergroessern = JOptionPane.showInputDialog("Wollen Sie die Dimension des Rechtecks vergrößern ?").toLowerCase();

                if (userAuswahlVergroessern.equals("ja")){
                    double breiteup = Double.parseDouble(JOptionPane.showInputDialog("Um wie viel cm Soll die Breite des Rechtecks Vergrößert werden"));
                    rechteck.breiteVergrossern(breiteup);

                    double laengeup = Double.parseDouble(JOptionPane.showInputDialog("Um wie viel cm Soll die Länge des Rechtecks Vergrößert werden"));
                    rechteck.langeVergrossern(laengeup);
                }
            }
        }
        double breite = rechteck.getBreite();
        double laenge = rechteck.getLaenge();


            String ausgab = String.format("Vielen Dank für die Eingaben, hier haben sie die Information zu ihrem Rechteck,\n \n" +
                    "Lange Seite: %.2fcm\n" +
                    "Kurze Seite: %.2fcm\n" +
                    "Diagonale: %.2fcm \n" +
                    "Fläche: %.2f \n" +
                    "Umfang: %.2f", rechteck.getLangeSeite(), rechteck.getKurtzeSeite(), rechteck.getDiagonale(), rechteck.getFLaeche(), rechteck.getUmfang());

        JOptionPane.showMessageDialog(null,ausgab);

    }
}
