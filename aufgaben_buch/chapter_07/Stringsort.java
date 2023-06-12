package aufgaben_buch.chapter_07;

import javax.swing.*;
import java.util.Arrays;

public class Stringsort {
    public static void main(String[] args) {
        String usrImport1 = JOptionPane.showInputDialog("Geben sie den Ersten String ein").toLowerCase();
        String usrImport2 = JOptionPane.showInputDialog("Geben sie den Zweite String ein").toLowerCase();
        String usrImport3 = JOptionPane.showInputDialog("Geben sie den Dritten String ein").toLowerCase();

        String[] arrayString = {usrImport1, usrImport2, usrImport3};
        Arrays.sort(arrayString);

        for (int i = 0; i < arrayString.length; i++){
            System.out.println(arrayString[i]);
        }
    }
}
