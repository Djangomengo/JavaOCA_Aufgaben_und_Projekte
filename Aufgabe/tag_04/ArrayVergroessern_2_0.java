package Aufgabe.tag_04;

import javax.swing.*;

public class ArrayVergroessern_2_0 {
    public static void main(String[] args) {

        final int USR_AMOUNT = Integer.parseInt(JOptionPane.showInputDialog(null, "Geben sie eine Zahl ein um wieviel der Array erweitert werden soll"));
        String[] array = {"Hans", "Lisa", "Christian"};
        int arraySize = array.length;

        String ausgabe = "";

        String[] tempArray = new String[USR_AMOUNT + arraySize];

        for (int i = 0; i < arraySize; i++) {
            tempArray[i] = array[i];
        }

        for (int i = 0; i<tempArray.length; i++ ) {
            if (i == tempArray.length -1){
                ausgabe += tempArray[i];
            }else{
                ausgabe += tempArray[i] + ", ";

            }
        }

        JOptionPane.showMessageDialog(null,"New Array: " + ausgabe);
    }
}
