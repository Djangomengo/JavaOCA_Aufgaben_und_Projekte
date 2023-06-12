package aufgaben_buch.chapter_07;

import javax.swing.*;

import static java.lang.Integer.*;

public class Zahlensystem {

        public static void main(String[] args) {
                int userInput = Integer.parseInt(JOptionPane.showInputDialog("geben sie eine Zahl ein"));

                String userInputBinary = toBinaryString(userInput);
                String userInputHex = toHexString(userInput).toUpperCase();

                String ausgabe = ("Ihre zahl in \n" +
                        "Dezimal: " + userInput + "\n" +
                        "Binär: " + userInputBinary + "\n" +
                        "Hexadezimal: " + userInputHex + "\n");

                JOptionPane.showMessageDialog(null, ausgabe);
        }
}
