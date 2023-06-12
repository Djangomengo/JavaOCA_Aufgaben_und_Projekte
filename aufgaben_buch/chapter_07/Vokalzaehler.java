package aufgaben_buch.chapter_07;

import javax.swing.*;
import java.sql.Array;

public class Vokalzaehler {
    public static void main(String[] args) {

        //Aufgabe 1 und Aufgabe 2

        String userInput = JOptionPane.showInputDialog("Geben sie einen String ein").toLowerCase();


        int vokaleAnzahl = 0;
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;

        for(int j = 0; j < userInput.length(); j++){
            char tempChar = userInput.charAt(j);
            switch (tempChar) {
                case 'a' :  a++;
                    vokaleAnzahl++;
                    break;
                case 'e' : e++;
                    vokaleAnzahl++;
                    break;
                case 'i' : i++;
                    vokaleAnzahl++;
                    break;
                case 'o' : o++;
                    vokaleAnzahl++;
                    break;
                case 'u' : u++;
                    vokaleAnzahl++;
                    break;
            }
        }

        String ausgabe = ("in deinem String sind insgesamt:\n" +
                "Vokale ingsesamt: " + vokaleAnzahl + "\n" +
                "a: " + a + "\n" +
                "e: " + e + "\n" +
                "i: " + i + "\n" +
                "o: " + o + "\n" +
                "u: " + u );

        JOptionPane.showMessageDialog(null, ausgabe);
    }

}

