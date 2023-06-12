package Aufgabe.tag_02;

import javax.swing.*;

public class NamenAusgabe {
    public static void main(String[] args) {

        //User Input
        String name = JOptionPane.showInputDialog("bitte geben sie ihren Namen ein");
        int wiederholung = Integer.parseInt(JOptionPane.showInputDialog( "geben sie eine Zahl zwischen 0-30 ein,  für die Anzahl der Ausgaben \n" +
                                                                            "wie oft der Name ausgegeben werden soll"));


        final int OBERE_GRENZE = 30;
        final int UNTERE_GRENZE = 0;

        if ((wiederholung <= OBERE_GRENZE) && (wiederholung >= UNTERE_GRENZE)){
            String ausgabe = "";

            //For Schleife
            for (int i = 1; i <= wiederholung; i++){
                ausgabe += i + ": " + name + "\n";
            }

            //While Schleife
            String ausgabe_2 = "";
            int i = 0;

            while (i <= wiederholung -1 ){
                i++;
                ausgabe_2 += i + ": " + name + "\n";
            }

            //DO-While Schleife
            String ausgabe_3 = "";
            int j = 0;

            do {
                j++;
                ausgabe_3 += j + ": " + name + "\n";
                if (j == wiederholung) break;
            }while (j <= wiederholung);

            //Ausgabe
            JOptionPane.showMessageDialog(null,"For Schleife \n \n"+ ausgabe);
            JOptionPane.showMessageDialog(null,"While Schleife \n \n"+ ausgabe_2);
            JOptionPane.showMessageDialog(null,"DO - While Schleife \n \n"+ ausgabe_3);

        }else {
            JOptionPane.showMessageDialog( null,"Fehlerhafte eingabe, bitte nur zahlen zwischen 0-30");
        }

    }

    public void namenausgabe(String arg) {

    }
}

