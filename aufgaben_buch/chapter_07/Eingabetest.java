package aufgaben_buch.chapter_07;

import javax.swing.*;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class Eingabetest {
    public static void main(String[] args) {

        String ergebnis;

        String aufgabe = ("Geben sie Folgenden Text: \n" +
                " \"Fischers Fritz fischt frische Fische\" \n" +
                "so schnell wie möglich ein, Zeit und fehler werden gemessen. \n" +
                "Sobald sie auf Ok Clicken öffnet sich das Eingabefeld und die Uhr Läuft, Viel Glück");
        JOptionPane.showMessageDialog(null, aufgabe);

        Instant stratTime = Instant.now();
        String usrInput = JOptionPane.showInputDialog("\"Fischers Fritz fischt frische Fische\"");
        Instant endTime = Instant.now();

        Duration duration = Duration.between(stratTime, endTime);

        long minuten = duration.toMinutes();
        duration = duration.minusMinutes(minuten);

        long sekunden = duration.toSeconds();
        duration = duration.minusSeconds(sekunden);

        long milisekunden  = duration.toMillis();
        duration = duration.minusMillis(milisekunden);

        if (usrInput.equals("Fischers Fritz fischt frische Fische")){
            ergebnis = "Fehlerfrei! ";
        }else {
            ergebnis = "Ihr Ergebniss war leider nicht Fehlerfrei! ";
        }

        String ausgabe = (ergebnis + "Zeit: " + minuten  +" Minuten, " +
                sekunden + "Sekunden und " +
                milisekunden + "Milisekunden.");

        JOptionPane.showMessageDialog(null, ausgabe);

        System.out.println(stratTime + "\n" + endTime);
    }
}
