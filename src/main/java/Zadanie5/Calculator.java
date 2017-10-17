package Zadanie5;


import java.util.Scanner;

/**
 * 5. Napisz program, który będzie obliczał wynik podanego przez użytkownika wyrażenia
 * matematycznego.
 * a. Użytkownik podaje wyrażenie w postaci “2+3”. Program zwraca wynik 5
 * b. Przygotuj klasę o nazwie Calculator wykonującą wszystkie obliczenia
 * i. dodawanie
 * ii. odejmowanie
 * iii. mnożenie
 * iv. dzielenie
 * v. potęgowanie
 * c. Przygotuj testy jednostkowe do klasy Calculator
 * d. Dodaj mechanizm logowania każdej operacji korzystając z LOG4J
 */
public class Calculator {

    public void oblicz() {
        String wynik1[];
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Podaj zadanie");
        String zadanie = scanner.nextLine ();
        if (zadanie.contains ("+")) {
            wynik1 = zadanie.split ("\\+");
            System.out.println (Integer.parseInt (wynik1[0]) + Integer.parseInt (wynik1[1]));
        } else if (zadanie.contains ("-")) {
            wynik1 = zadanie.split ("-");
            System.out.println (Integer.parseInt (wynik1[0]) - Integer.parseInt (wynik1[1]));
        } else if (zadanie.contains ("*")) {
            wynik1 = zadanie.split ("\\*");
            System.out.println (Integer.parseInt (wynik1[0]) * Integer.parseInt (wynik1[1]));
        } else if (zadanie.contains ("/")) {
            wynik1 = zadanie.split ("/");
            System.out.println (Integer.parseInt (wynik1[0]) / Integer.parseInt (wynik1[1]));
        } else if (zadanie.contains ("^")) {
            wynik1 = zadanie.split ("\\^");
            System.out.println ((int)Math.pow (Integer.parseInt (wynik1[0]), Integer.parseInt (wynik1[1])));
        } else {
            System.out.println ("Podałeś zły znak");
        }
    }
}

