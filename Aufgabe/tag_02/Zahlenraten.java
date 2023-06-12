package Aufgabe.tag_02;

import java.util.Random;
import javax.swing.*;

public class Zahlenraten {

    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber;
        do {
            randomNumber = random.nextInt(31);
        } while (randomNumber % 5 != 0);
        System.out.println(randomNumber);

        JOptionPane.showMessageDialog(null, "Willkommen in meinem kleinen Ratespiel, \n \n" +
                "Die Regeln sind Easy, ich habe eine Zahl im Kopf und du must sie erraten. \n" +
                "Du hast  30 versuche, danach fliegst du :P");

        int versuche  = 1;
        int userInput = 1;

        boolean run;
        final int ANZAHL_TIPP = 10;
        final int ANZAHL_ABBRUCHFRAGE = 20;
        final int ANZHAL_ABBRUCH = 30;
        run = true;

        try {
            String strInput = JOptionPane.showInputDialog("Gib bitte deine Zahl ein ");
            userInput = Integer.parseInt(strInput);

        }catch (NumberFormatException e){
            JOptionPane.showInputDialog("Fehlerhafte eingabe! \nNur Zahlen sind erlaubt \nVersuch Nummer: " + versuche);
        }

        while (run && userInput != randomNumber){
            versuche +=1;

            try {
                userInput = Integer.parseInt(JOptionPane.showInputDialog("Leider Falsch, versuchs gleich noch einmal \n Versuch Nummer: " + versuche));

            } catch (NumberFormatException e){
                    JOptionPane.showInputDialog("Fehlerhafte eingabe! \nNur Zahlen sind erlaubt \nVersuch Nummer: " + versuche);
            }

            if (versuche == ANZHAL_ABBRUCH){
                JOptionPane.showMessageDialog(null,"Leider verloren mehr Glück beim nächsten mal ");
                run = false;
            }

            if (versuche == ANZAHL_ABBRUCHFRAGE){
                String abbruch = JOptionPane.showInputDialog("Uj Uj Uj, 20 Versuche hinter dir, willst du das Spiel Beenden ?").toLowerCase();
                if (abbruch.equals("ja")) {
                    run = false;
                }
            }

            if (versuche == ANZAHL_TIPP){
                JOptionPane.showMessageDialog(null,"Schon 10 Versuche hinter dir, es wird zeit für einen Tipp, die " +
                        "gesuchte zahl befindet sich zwischen 0 und 30");
            }
        }
        if(userInput == randomNumber){
            JOptionPane.showMessageDialog(null,"Glückwunsch, du hast es geschafft \nBenötigte Versuche: " + versuche );
        }
    }
}