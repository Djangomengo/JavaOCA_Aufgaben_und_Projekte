package Aufgabe.tag_04;

import javax.swing.*;
import java.util.Arrays;
import java.util.Comparator;

public class KalorienZaehler {
    public static void main(String[] args) {
        int[][] essen = {
                {1000, 2000, 3000 },
                {4000},
                {5000, 6000},
                {7000, 8000, 9000},
                {1000}
        };

        int tmpKalorie = 0;
        int max_Kalorie = 0;
        int personMeisteKalorie = 0;


        for (int i = 0; i < essen.length; i++ ){
            for (int j = 0; j < essen[i].length; j++){
                tmpKalorie += essen[i][j];
            }

            if (tmpKalorie > max_Kalorie){
                max_Kalorie = tmpKalorie;
                personMeisteKalorie = i;
            }
            tmpKalorie = 0;
        }


        JOptionPane.showMessageDialog(null, "Der Forscher " + (personMeisteKalorie + 1)
                                                        +" hat mit " + max_Kalorie + "kcal die meisten Kalorien.");

        /*
        int[] tmpArray = new int[essen.length];

        for (int i = 0; i < essen.length; i++){
            tmpArray[i]  = essen[i][i];
            System.out.println(essen[i]);
        }

         */

    }
}
