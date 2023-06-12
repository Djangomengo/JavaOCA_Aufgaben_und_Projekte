package aufgaben_buch.chapter_07;

import javax.swing.*;

public class Stringrueckwaerts {
    public static void main(String[] args) {

        String userInput = JOptionPane.showInputDialog("Geben sie einen String ein");
        StringBuilder stringRueckwerts = new StringBuilder();

        for (int i = 1; i <= userInput.length(); i++){
            char tempChar = userInput.charAt(userInput.length()-i);
            stringRueckwerts.append(tempChar);
        }

        JOptionPane.showMessageDialog(null, stringRueckwerts.toString());
    }
}