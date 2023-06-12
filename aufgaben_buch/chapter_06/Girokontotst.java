package aufgaben_buch.chapter_06;

import javax.swing.*;

public class Girokontotst {
    public static void main(String[] args) {


        Girokonto meinGKonto = new Girokonto("0000000001", 10000, 1000);


        double kontstand = meinGKonto.getKontostand();
        String kontonummer = meinGKonto.getKontonummer();
        double limit = -(meinGKonto.getLimit());

        JOptionPane.showMessageDialog(null, "Das Konto mit der Kontonummer: " + meinGKonto.getKontonummer()
                + "\nhat den aktuellen Kontostand von: " + meinGKonto.getKontostand() + "€");

            double auszahlung = Double.parseDouble(JOptionPane.showInputDialog("wie viel wollen sie Auszahlen? ")) ;
            meinGKonto.auszahlung(auszahlung);

            double tempKontstand = meinGKonto.getKontostand();


        if (tempKontstand < limit){
            JOptionPane.showMessageDialog(null, "Leider Überschreitet dies ihr Limit von " + limit + " Bitte versuchen sie eine Kleinere Summe Abzuheben");

        }else {
            kontstand = meinGKonto.getKontostand();
        }
            JOptionPane.showMessageDialog(null, "Das Konto mit der Kontonummer: " + kontonummer
                    + "\nhat den aktuellen Kontostand von: " + kontstand + "€");

    }
}
