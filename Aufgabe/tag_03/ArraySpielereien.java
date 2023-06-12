package Aufgabe.tag_03;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraySpielereien {
    public static void main(String[] args) {

        //Aufgabe 1
        int[] int_array = new int[5];
        int_array[0] = 1;
        int_array[1] = 5;
        int_array[2] = 4;
        int_array[3] = 3;
        int_array[4] = 2;


        //Aufgabe 2
        System.out.println("Aufgabe 2");

        System.out.println(int_array[3]+ ", " + int_array[4] + "\n");


        //Aufgabe 3
        System.out.println("Aufgabe 3");

        System.out.println("Alter wert des index 3");
        System.out.println(int_array[3]);

        System.out.println("\n" + "Neuer wert des index 3");
        int_array[3]=6;
        System.out.println(int_array[3]);
        System.out.println("\n");


        //Aufgabe 4
        int[] int_array2 = {5, 4, 3, 1, 2};


        //Aufgabe 5
        System.out.println("Aufgabe 5");

        for(int i = 0;i < int_array2.length; i++){
            //normaler print genutzt damit alles in einer Zeile ausgegeben wird
            System.out.print(int_array2[i] + ", ");
        }
        System.out.println("\n");


        //Aufgabe 6
        System.out.println("Aufgabe 6");

        for(int i = 0;i < int_array2.length; i++){
            int_array2[i] = 0;
            System.out.print(int_array2[i] + ", ");
        }
        System.out.println("\n");


        //Aufgabe7
        System.out.println("Aufgabe 7");

        int[] int_array3 = new int[5];
        Arrays.fill(int_array3,3);

        for(int i = 0;i < int_array2.length; i++){
            //normaler print genutzt damit alles in einer Zeile ausgegeben wird
            System.out.print(int_array3[i] + ", ");
        }
        System.out.println("\n");


        //Aufgabe 8
        System.out.println("Aufgabe 8");

        int[] int_array4 = {3, 1, 5, 2, 4};

        System.out.println("Unsortierte liste");
        for(int i = 0;i < int_array2.length; i++){
            System.out.print(int_array4[i] + ", ");
        }
        System.out.println("\n");

        System.out.println("Sortierte liste");
        Arrays.sort(int_array4);
        for(int i = 0;i < int_array2.length; i++){
            System.out.print(int_array4[i] + ", ");
        }
        System.out.println("\n");


        //Aufgabe 9 ??? Diese aufgabe verstehe ich nicht ganz ???
        System.out.println("Aufgabe 9");
        int[] int_array5 = {6, 7, 8, 9, 10};
        Arrays.sort(int_array5);

        if(Arrays.binarySearch(int_array5, 8) != -1) ;{
            System.out.println("I guss gefunden? die gesuchte zahl befindet sich im index: " + Arrays.binarySearch(int_array5, 8));
        }
        System.out.println("\n");


        //Aufgabe 10
        System.out.println("Aufgabe 10");

        int[] int_array6 = {6, 7, 8, 9, 10};

        if(Arrays.equals(int_array5, int_array6)){
            System.out.println("Beide Listen stimmen überein");
        }
        System.out.println("\n");

        //Aufgabe11
        System.out.println("Aufgabe 11");

        System.out.println("Liste 1 Enhanced");
        for(int i : int_array){
            System.out.print(i + ", ");
        }
        System.out.println("\n");

        System.out.println("Liste 5 Enhanced");
        for(int i : int_array5){
            System.out.print(i + ", ");
        }

    }
}
