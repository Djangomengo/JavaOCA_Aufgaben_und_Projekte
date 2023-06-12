package Aufgabe.tag_04;

import javax.swing.*;

public class Personen {

    public static void main(String[] args) {
    String ausgabe = "";

        String[][] persons = {
                {"Hans", null, "48", "ledig", "Handwerker"},
                {"Christian", "Herrero", "30", "verheiratet", "Bankkaufmann"},
                {null, null, null, null, null},
                {"Elif", "Yamaz", "8", "ledig", "Schülerin"}
        };

        String[] categories = {"Vorname", "Nachname", "Alter", "Familienstand", "Beruf" };

        for (int i = 0; i < persons.length; i++){
            for (int j = 0; j < persons[i].length; j++){
                if (persons[i][j] == (null)){

                    String info = JOptionPane.showInputDialog(null,"Bitte geben sie ihren " + categories[j] + " ein: ");
                    persons[i][j] = info;

                }
                 ausgabe += (persons[i][j] + " ");
            }
            ausgabe += " \n";
        }

        JOptionPane.showMessageDialog(null, ausgabe);

    }
}
