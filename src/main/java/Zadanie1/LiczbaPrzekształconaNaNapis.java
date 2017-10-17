package Zadanie1;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 1. Napisz program, który umożliwi użytkownikowi wpisanie dowolnej liczby całkowitej z
 zakresu [1-99], po czym wyświetli ją w konsoli w postaci słownej. Np. 23 ->
 dwadzieścia trzy
 */
public class LiczbaPrzekształconaNaNapis {
    public static void main(String[] args) {


        HashMap<Character, String> jednostki = new HashMap<>();
        jednostki.put('0', "");
        jednostki.put('1', "jeden");
        jednostki.put('2', "dwa");
        jednostki.put('3', "trzy");
        jednostki.put('4', "cztery");
        jednostki.put('5', "pięć");
        jednostki.put('6', "sześć");
        jednostki.put('7', "siedem");
        jednostki.put('8', "osiem");
        jednostki.put('9', "dziewięć");

        HashMap<Character, String> dziesiatki = new HashMap<>();
        dziesiatki.put('0', "dzieścia");
        dziesiatki.put('1', "naście");
        dziesiatki.put('2', "dwadzieścia");
        dziesiatki.put('3', "trzydzieści");
        dziesiatki.put('4', "czterdzieści");
        dziesiatki.put('5', "pięćdziesiąt");
        dziesiatki.put('6', "sześćdziesiąt");
        dziesiatki.put('7', "siedemdziesiąt");
        dziesiatki.put('8', "osiemdziesiąt");
        dziesiatki.put('9', "dziewięćdziesiąt");



        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą od 1 do 99");
        int podanaLiczba = scanner.nextInt();

        String liczbaWStringu = String.valueOf(podanaLiczba);
        Character digital1 = null;
        Character digital2 = null;


        if (liczbaWStringu.length() == 2) {
            digital1 = liczbaWStringu.charAt(0);
            digital2 = liczbaWStringu.charAt(1);
        } else if (liczbaWStringu.length() == 1) {
            digital2 = liczbaWStringu.charAt(0);
        } else
            System.out.println("Podana liczba nie mieści się w przedziale");

        if (podanaLiczba < 0) {
            System.out.println("Podana liczba nie mieści się w przediale");
        } else if (podanaLiczba < 10) {

            System.out.println(jednostki.get(digital2));
        } else if (podanaLiczba < 20) {


            System.out.println("" + jednostki.get(digital2) + dziesiatki.get(digital1));
        } else if (podanaLiczba == 15) {
            System.out.println("pietnaście");
        } else {

            System.out.println("" + dziesiatki.get(digital1) + jednostki.get(digital2));
        }
    }
}
