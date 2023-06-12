package Aufgabe.tag_04;

import javax.swing.*;
import java.util.Arrays;

public class Notendurchschnitt {
    public static void main(String[] args) {

        int n = 1;
        String strNoten = "";

        int anzahNoten = Integer.parseInt(JOptionPane.showInputDialog(null,"Wie viele Noten wollen sie Berechnen"));
        double[] arrayNoten = new double[anzahNoten];

        double noten = 0;
        double notenDurchnschnitt = 0;

        int j = 0;
        while (j < anzahNoten){
            noten = Double.parseDouble(JOptionPane.showInputDialog(null, "Geben sie die " +(n) + ". Note ein"));
            arrayNoten[j] = noten;

            n++;
            j++;

            notenDurchnschnitt += noten;
        }

        for (int i = 0; i < arrayNoten.length ; i++){
            if (i == arrayNoten.length - 1){
                strNoten += (arrayNoten[i] );
            }else{
                strNoten += (arrayNoten[i] + ", ");
            }
        }

        String ausgabe  = String.format("Ihre eingegebenen Noten betragen: " + strNoten + "\n" +
                "Ihr Notendurchschnitt bertägt: %.2f", (notenDurchnschnitt/n));

        JOptionPane.showMessageDialog(null, ausgabe );

    }
}
