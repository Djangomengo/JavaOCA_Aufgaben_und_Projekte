package aufgaben_buch.chapter_05.kreis;

import javax.swing.*;
import java.util.Arrays;

public class Kreistabelle {
    public static void main(String[] args) {
        Kreis k = new Kreis();

        int reihen = 30;
        int spalten = 3;
        Double[][] kreistabelle =  new Double[reihen][spalten];
        String[] tabellenkopf = {"Radius", "Umfang", "Fläche"};

        Double radius = Double.parseDouble(JOptionPane.showInputDialog("Geben sie ein Startwert für den Radius an: "));
        Double radiusErhoehung = Double.parseDouble(JOptionPane.showInputDialog("Geben sie eine Radius erhöhung  an: "));

        k.setRadius(radius);

        for (int i = 0; i < tabellenkopf.length; i++){
            System.out.print("         " + tabellenkopf[i] + "                          ");
        }
        System.out.println();

        for (int i = 0; i < kreistabelle.length; i++){

            for (int j = 0; j < kreistabelle[i].length; j++){
                if (j == 0){
                    kreistabelle[i][j] = radius;

                } else if (j == 1) {
                    kreistabelle[i][j] = k.getUmfang();

                }else {
                    kreistabelle[i][j] = k.getFlaeche();

                }
                System.out.print( "     |         " + kreistabelle[i][j] + "       |       ");
            }
            System.out.println();

            radius += radiusErhoehung;
            k.setRadius(radius);
        }
    }
}
