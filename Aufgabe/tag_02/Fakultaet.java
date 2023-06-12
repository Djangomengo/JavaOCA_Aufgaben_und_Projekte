package Aufgabe.tag_02;

import javax.swing.*;

public class Fakultaet {
    public static void main(String[] args) {

        int zahl = Integer.parseInt(JOptionPane.showInputDialog("Geben sie eine Zahl zwischen 0 und 10 zum berechnen des Fakultäts an"));

        final int OBER_GRENZE = 10;
        final int UNTER_GRENZE = 0;

        if(zahl <= OBER_GRENZE && zahl > UNTER_GRENZE){

            int fakultaet = 1;
            for (int i = 1; i<= zahl; i++){
                fakultaet *= i;
            }

            JOptionPane.showMessageDialog(null,"Das Ergebnis von " + zahl + "! ist: " + fakultaet );
        } else if (zahl == 0) {
            int fakultaet = 1;
            JOptionPane.showMessageDialog(null,"Das Ergebnis von " + zahl + "! ist: " + fakultaet );

        } else {
            JOptionPane.showMessageDialog(null,"Die angegebene Zahl ist zu hoch, bitte geben sie eine Zahl zwischen 0 und 10 ein");
        }
    }
}
