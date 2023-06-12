package aufgaben_buch.chapter_05.kreis;

import javax.swing.*;

public class KreisTest {
    public static void main(String[] args) {
        Kreis k = new Kreis();

        Double userInput = Double.parseDouble(JOptionPane.showInputDialog("geben sie den Radius ihres Kreises den sie berechnen wollen ein"));
        k.setRadius(userInput);

        JOptionPane.showMessageDialog(null,(String.format("Der Umfang des Kreises mit dem Radius: %.2fcm, beträgt %.2fcm \n" +
                                                                       "und seine Fläche beträgt: %.2fcm² ", k.getRadius(), k.getUmfang(), k.getFlaeche())));


    }
}
