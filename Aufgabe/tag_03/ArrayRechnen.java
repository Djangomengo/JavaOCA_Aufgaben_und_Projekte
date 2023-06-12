package Aufgabe.tag_03;

import java.util.Arrays;

public class ArrayRechnen {
    public static void main(String[] args) {
        int array1[]= new int [5];
        array1[0]=22;
        array1[1]=2;
        array1[2]=21;
        array1[3]=18;
        array1[4]=7;

        //Aufgabe1
        System.out.println("Aufgabe 1");
        for (int i = 0; i<array1.length; i++ ){
            System.out.println("index: " + i +" " + "= " + array1[i]);
        }
        System.out.println("");

        //Aufgabe2
        System.out.println("Aufgabe 2");
        System.out.println(array1[2] * array1[1]);
        System.out.println("");

        //Aufgabe3
        System.out.println("Aufgabe 3");
        System.out.println(array1[0] / array1[3]);
        System.out.println("");

        //Aufgabe4
        System.out.println("Aufgabe 4");

        if(array1[4] % array1[2] == 0 ){
            System.out.println("Elemet 5 der Liste array1 ist ein teil des 3. Elements der Liste array1");
        }else {
            System.out.println("Elemet 5 der Liste array1 ist Kein teil des 3. Elements der Liste array1");
        }
        System.out.println("");

        //Aufgabe5
        System.out.println("Aufgabe 5");
        System.out.println("Ohne Überschreibung");

        int[] arrAufgabe2_1 = Arrays.copyOf(array1, array1.length);
        int[] arrAufgabe3_1 = Arrays.copyOf(array1, array1.length);

        for (int i = 0; i<array1.length; i++ ){
            System.out.println("index: " + i +" " + "= " + array1[i]);
        }

        if(Arrays.equals(arrAufgabe2_1, arrAufgabe3_1)){
            System.out.println("Die werte Haben sich nicht verändert!");
        }else {
            System.out.println("Die werte Haben sich verändert!");
        }
        System.out.println("");

        System.out.println("Mit Überschreibung");

        array1[2] = (array1[2] * array1[1]);
        array1[0] = (array1[0] / array1[3]);

        int[] arrAufgabe2_2 = Arrays.copyOf(array1, array1.length);

        for (int i = 0; i<array1.length; i++ ){
            System.out.println("index: " + i +" " + "= " + array1[i]);
        }

        if(Arrays.equals(arrAufgabe2_2, arrAufgabe2_1)){
            System.out.println("Die werte Haben sich nicht verändert!");
        }else {
            System.out.println("Die werte Haben sich verändert!");
        }

    }
}
