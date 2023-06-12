package Aufgabe.Extra;

/**
 * Schreibe ein Programm, das die häufigste Zahl in einem Array
 * findet. Wenn es mehrere Zahlen mit der gleichen höchsten
 * Häufigkeit gibt, soll die kleinste dieser Zahlen ausgegeben
 * werden. Verwende das folgende Array: {5, 2, 10, 12, 2, 3, 10, 10}
 */

public class MostFrequentNumberFinder {
    public static void main(String[] args) {
        int[] intArray = {5, 2, 10, 12, 2, 3, 10, 10};

        int mostFrequentNumber = 0;
        int quantity = 1;
        int quantityTemp = 0;


        for (int i = 0; i < intArray.length; i++){
            for(int j = i + 1; j < intArray.length; j++){
                if(intArray [i] == intArray [j]){
                    mostFrequentNumber = intArray[i];
                    quantityTemp ++;
                    if (j == intArray.length){
                        quantity = quantityTemp;
                        quantityTemp = 0;
                    }
                }
            }
            if (quantity == quantityTemp){
                quantityTemp = 0;
            }
        }
        System.out.println("Die Häufigste Zahl ist " + mostFrequentNumber + " und sie kommt " + quantity + " mal vor");
    }
}
