package Aufgabe.tag_03;

import javax.swing.*;
import java.util.Arrays;

public class ArrayMinMax {
    public static void main(String[] args) {
        int[] array = {10, 2, 38, 33, 8, 12, 3, 8,};

        String arrayAsString = Arrays.toString(array);
        String userInput = JOptionPane.showInputDialog("Wollen sie vorher die liste: " + arrayAsString + " Sortiren");

        if (userInput.equals("ja")){

            Arrays.sort(array);
            String sortetArrayAsString = Arrays.toString(array);
            JOptionPane.showMessageDialog(null,"Der Such-Array beträgt: " + sortetArrayAsString + "\n \n" +
                    "Die höchste Zahl im Array ist: " + array[0] + "\n" +
                    "Die niedrigste Zahl im Array ist: " + + array[array.length - 1]);
        }else {



/*      !!!!!!!!FUNKTIONIERT NUR SOLANGE DIE HÖCHSTE NUMMER NICHT AM ANFANG STEHT!!!

        while (runde < n){

            if (array[arrayPos1] < array[arrayPos2]) {
                arrayPos1++;

            } else if (array[arrayPos1] == array[arrayPos2]) {
                arrayPos1++;

            }else {
                arrayPos2++;
                hoechsteZahl = array[arrayPos2];
            }
            runde++;
        }
        System.out.println("Die Höchste Zahl im array ist: " + hoechsteZahl);
 */

            int arrayPos1 = 0;
            int arrayPos2 = 1;
            int hoechsteZahl = 0;
            int n = array.length;

            hoechsteZahl = array[arrayPos1];
            int niedrigsteZahl = array[arrayPos1];

            while (arrayPos2 < n) {
                if (array[arrayPos2] > hoechsteZahl) {
                    hoechsteZahl = array[arrayPos2];
                } else if (array[arrayPos2] < niedrigsteZahl) {
                    niedrigsteZahl = array[arrayPos2];
                }

                arrayPos1++;
                arrayPos2++;
            }
            System.out.println("Die höchste Zahl im Array ist: " + hoechsteZahl);
            System.out.println("Die niedrigste Zahl im Array ist: " + niedrigsteZahl);

            JOptionPane.showMessageDialog(null,"Der Such-Array beträgt: " + arrayAsString + "\n \n" +
                    "Die höchste Zahl im Array ist: " + hoechsteZahl + "\n" +
                    "Die niedrigste Zahl im Array ist: " + niedrigsteZahl);
        }
    }
}
