package Aufgabe.tag_04;

import javax.swing.*;
import java.util.Arrays;

public class ArrayVergroessern_1_0 {
    public static void main(String[] args) {

        final int NEW_LENGTH = Integer.parseInt(JOptionPane.showInputDialog(null, "Geben sie eine Zahl ein um wieviel der Array erweitert werden soll"));
        String[] array = {"Hans", "Lisa", "Christian"};

        String ausgabe = "";

        array = Arrays.copyOf(array, NEW_LENGTH);

        for (int i = 0; i<array.length; i++ ) {
            if (i == array.length -1){
                ausgabe += array[i];
            }else{
                ausgabe += array[i] + ", ";

            }
        }
            JOptionPane.showMessageDialog(null,"New Array: " + ausgabe);
    }
}
