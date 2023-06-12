package aufgaben_buch.chapter_07;

import javax.swing.*;
import java.awt.*;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.ZonedDateTime;

public class StrtingruckwertsRennen {
    public static void main(String[] args) {

        String userInput = JOptionPane.showInputDialog("Geben sie einen String ein");

        Instant start1 = Instant.now();

        //StringBuilder
        StringBuilder stringRueckwerts = new StringBuilder();

        for (int i = 1; i <= userInput.length(); i++){
            char tempChar = userInput.charAt(userInput.length()-i);
            System.out.print(tempChar);

            stringRueckwerts.append(tempChar);
        }

        Instant ende1 = Instant.now();

        JOptionPane.showMessageDialog(null, stringRueckwerts.toString());


        //StringBuffer

        userInput = JOptionPane.showInputDialog("Geben sie einen String ein");

        Instant start2 = Instant.now();

        StringBuffer stringRueckwerts2 = new StringBuffer();

        for (int i = 1; i <= userInput.length(); i++){
            char tempChar = userInput.charAt(userInput.length()-i);
            System.out.print(tempChar);

            stringRueckwerts2.append(tempChar);
        }

        Instant ende2 = Instant.now();

        JOptionPane.showMessageDialog(null, stringRueckwerts2.toString());

        Duration durationStringBuilder = Duration.between(start1, ende1);
        Duration durationStringBuffer = Duration.between(start2, ende2);

        String ausgabe = ("String Builder Daurte: " + durationStringBuilder.toNanos() / 1000000 + " ms\n"
            + "String Buffer Daurte: " + durationStringBuffer.toNanos() / 1000000 + " ms");

        JOptionPane.showMessageDialog(null, ausgabe);


    }


}
