package Zadanie2;

import java.util.Scanner;

import static java.lang.Math.sqrt;

/**
 * 2. Napisz program, który po wpisaniu dowolnej liczby całkowitej (int) poda najbliższą
 liczbę pierwszą. W przypadku pojawienia się dwóch o tej samej bliskości, wybierze
 większą. np. 6 -> 7, a nie 5.
 */
public class NajbliższaLiczbaPierwsza {

    public static void main(String[] args) {

        int size = 1000;

        int[] inputArray = new int[size - 1];
        for (int i = 0; i<size - 1; i++)
            inputArray[i] = i+2;
        int[] inputArray2;
        inputArray2 = doEratostenes (inputArray);
        for (int j = 0; j<inputArray2.length; j++) {
            System.out.println (inputArray2[j]);
        }

        Scanner scanner = new Scanner (System.in);
        System.out.println ("Podaj liczbę");
        int liczbaPodana = scanner.nextInt ();
        int indeksWDoł = 1;
        int indeksWGore = 1;
        for (int i = liczbaPodana -1 ; i<inputArray2.length; i++) {
            if (inputArray2[i] == 0) {
                indeksWGore++;
            } else {
                break;
            }
        }
        for (int i = liczbaPodana - 3; i<inputArray2.length; i--) {
            if (inputArray2[i] == 0) {
                indeksWDoł++;
            } else {
                break;
            }
        }
        int miejsceWTablicy;
        if (indeksWDoł<indeksWGore) {
            miejsceWTablicy = liczbaPodana - indeksWDoł-2;
        } else {
            miejsceWTablicy = liczbaPodana + indeksWGore-2;
        }
        System.out.println ("Najbliższa liczba pierwsza to:"+inputArray2[miejsceWTablicy]);
    }


    public static int[] doEratostenes(int[] inputArray) {
        double pierwiastek = (int) sqrt (inputArray.length);
        System.out.println ("Wykona się " + pierwiastek + "razy");

        for (int i = 0; i<inputArray.length - 1; i++) {
            for (int j = i + 1; j<inputArray.length - 1; j++) {
                if (inputArray[i] != 0 && inputArray[j] != 0 && inputArray[j] % inputArray[i] == 0) {
                    inputArray[j] = 0;
                }
            }
            if (inputArray[i]>pierwiastek) {
                break;
            }
        }

        return inputArray;
    }

}
