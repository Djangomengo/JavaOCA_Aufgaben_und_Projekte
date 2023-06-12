package aufgaben_buch.chapter_07;

import javax.swing.*;
import java.sql.Array;

public class Vokalloescher {
    public static void main(String[] args) {
        String userInput = JOptionPane.showInputDialog("Geben sie einen String ein").toLowerCase();

        StringBuffer neuAusgabe = new StringBuffer();

        for(int j = 0; j < userInput.length(); j++){
            char tempChar = userInput.charAt(j);
            switch (tempChar) {
                case 'a' :
                    break;
                case 'e' :
                    break;
                case 'i' :
                    break;
                case 'o' :
                    break;
                case 'u' :
                    break;
                default:
                    neuAusgabe.append(tempChar);
            }
        }
        JOptionPane.showMessageDialog(null, neuAusgabe);
    }
}