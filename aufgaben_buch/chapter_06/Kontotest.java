package aufgaben_buch.chapter_06;

import javax.swing.*;

public class Kontotest {
    public static void main(String[] args) {

        Konto meinKonto = new Konto("0000000001", 1000);

        JOptionPane.showMessageDialog(null, "Das Konto mit der Kontonummer: " + meinKonto.getKontonummer()
                + "\nhat den aktuellen Kontostand von: " + meinKonto.getKontostand() + "€");

        double einzahlung = Double.parseDouble(JOptionPane.showInputDialog("wie viel wollen sie Einzahlen? ")) ;
        meinKonto.einzahlen(einzahlung);
        JOptionPane.showMessageDialog(null, "Das Konto mit der Kontonummer: " + meinKonto.getKontonummer()
                + "\nhat den aktuellen Kontostand von: " + meinKonto.getKontostand() + "€");

        double auszahlung = Double.parseDouble(JOptionPane.showInputDialog("wie viel wollen sie Auszahlen? ")) ;
        meinKonto.auszahlung(auszahlung);
        JOptionPane.showMessageDialog(null, "Das Konto mit der Kontonummer: " + meinKonto.getKontonummer()
                + "\nhat den aktuellen Kontostand von: " + meinKonto.getKontostand() + "€");

    }
}
