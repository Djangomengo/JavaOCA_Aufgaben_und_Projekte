package aufgaben_buch.chapter_08.extraaufgaben;

import javax.swing.*;

public class Main {

    private static boolean pay;
    private static double money;
    private static final double[] EURO_AND_Pound_COIN_VALUES = {2.00, 1.00, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01};
    private static final double[] DOLLAR_COIN_VALUES = {1.00, 0.50, 0.25, 0.10, 0.05, 0.01};
    private static String waehrung = "Euro";


    public static void main(String[] args) {
        Main mymain = new Main();

        int auswahl = Integer.parseInt(JOptionPane.showInputDialog(null,"Welche währung wollen sie nutzen ? \nnutzen sie" +
                "\nfür Euro die 1 " +
                "\nfür Dollar die 2 " +
                "\nfür Pfund die 3"));


        double amount = Double.parseDouble(JOptionPane.showInputDialog(null,"Wie hoch ist der zu zahlende Betrag? "));

        switch (auswahl){
            case 1:
                waehrung = "Euro";
                mymain.zaehlen(EURO_AND_Pound_COIN_VALUES, amount);
                break;
            case 2:
                waehrung = "Dollar";
                mymain.zaehlen(DOLLAR_COIN_VALUES, amount);
                break;
            case 3:
                waehrung = "Pfund";
                mymain.zaehlen(EURO_AND_Pound_COIN_VALUES, amount);
                break;
        }

    }

    private void zaehlen(double[] array,double amount){
        int[] coinsArr = new int[array.length];
        double money = 0;

        for (int i = 0; i < array.length; i++){
            int tempInt = Integer.parseInt(JOptionPane.showInputDialog("es wir zeit dein geld zu zaehlen.\n" +
                    "wie viele " + waehrung + " " + array[i] + "Stuecke hast du"));

            coinsArr[i] = tempInt;
            money = calcValue(i, array, coinsArr);
        }
        JOptionPane.showMessageDialog(null,payable(money, amount));
    }

    public String payable(double amount, double money ){
        String ausgabe = "";
        if (money >= amount){
            ausgabe = String.format("Du hast leider nur %.2f " + waehrung + " \nes  fehlen dir noch: " +  ( amount - money )  + " " + waehrung, amount);
        }else {
            ausgabe = "Du hast genug geld";
        }
        return ausgabe;
    }

    public double calcValue(int i, double[] coinArr,int [] amountCoinArray){
            money += coinArr[i] * amountCoinArray[i];
            return money;
    }
}

