package aufgaben_buch.chapter_07;

import javax.swing.*;

import static java.lang.Integer.toBinaryString;

public class Hexumrechner {
    public static void main(String[] args) {
        String userInput = JOptionPane.showInputDialog("Geben sie eine Hexadezimalzahl ein!");

        int userInputDeci = Integer.parseInt(userInput,16);
        String userInputBinary = toBinaryString(userInputDeci);

        System.out.println("Hexadezimal: " + userInputDeci + "\n" +
                "Binär: " + userInputBinary);
    }
}
