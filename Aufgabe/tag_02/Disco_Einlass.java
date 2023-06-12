package Aufgabe.tag_02;

import javax.swing.*;
import java.util.Locale;

public class Disco_Einlass {
    public static void main(String[] args) {
        int alter = Integer.parseInt(JOptionPane.showInputDialog("Geben sie ihr Alter an"));



        while (alter < 18){
            JOptionPane.showMessageDialog(null, "Du Kommst hier net Rein Kleiner, sieh zu das du Land gewinnst");
            alter = Integer.parseInt(JOptionPane.showInputDialog("Geben sie ihr Alter an"));
        }

        if(alter >= 18){
            String vip_abfrage = JOptionPane.showInputDialog("Sind sie VIP").toLowerCase(Locale.ROOT);

            if (vip_abfrage.equals("ja")){
                String geschlaecht = JOptionPane.showInputDialog("Geben sie ihr geschlecht an ").toLowerCase(Locale.ROOT);

                if (geschlaecht.equals("frau")){
                    JOptionPane.showMessageDialog(null, "Willkommen im Smoking Monky, wir wünschen dir viel spaß \n\n" +
                            "Da sie zu den VIP Gesten gehören geniessen sie unser Special Angebot\n" +
                            "ach ja, bevor ich es vergessen, da Heute Ladies-Night ist, bekommst du noch satte 15% auf alle getränke");

                }else {
                    JOptionPane.showMessageDialog(null, "Willkommen im Smoking Monky, wir wünschen ihnen viel spaß \n\n" +
                            "Da sie zu den VIP Gesten gehören geniessen sie unser Special Angebot");
                }

            }else {
                String geschlaecht = JOptionPane.showInputDialog("Geben sie ihr geschlecht an ").toLowerCase(Locale.ROOT);
                if (geschlaecht.equals("frau")){

                    JOptionPane.showMessageDialog(null, "Willkommen im Smoking Monky, wir wünschen dir viel spaß \n\n"  +
                            "ach ja, bevor ich es vergessen, da Heute Ladies-Night ist, bekommst du noch satte 15% auf alle getränke");

                }else {
                    JOptionPane.showMessageDialog(null, "Willkommen im Smoking Monky, wir wünschen ihnen viel spaß");
                }

            }
            //JOptionPane.showMessageDialog(null, "Willkommen im Smoking Monky, wir wünschen ihnen viel spaß");
        }
    }
}
