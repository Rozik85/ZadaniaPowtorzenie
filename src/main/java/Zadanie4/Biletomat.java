package Zadanie4;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * e. *Dodać możliwość wprowadzania kontaktu i zapisu do pliku
 4. Napisz program, który będzie symulować pracę biletomatu.
 a. Użytkownik podaje ilość biletów (zakładamy, że każdy kosztuje 4 PLN).
 b. Program prosi o dokonanie zapłaty.
 c. Użytkownik wpisuje kwotę do konsoli.
 d. Program wypisuje należną resztę w postaci:
 Suma reszty: (a+b+c+d+e) PLN
 a = 200*A
 b = 100*B
 c = 50*C
 d = 20*D
 e = 10*E
 f = 5*F
 g = 2*G
 h = 1*H
 Gdzie A-H to ilość wydanych banknotów/monet, z których składa się reszta.
 e. Zakładamy, że biletomat posiada nieograniczoną liczbę zasobów banknotów
 oraz monet, a także priorytetyzuje wypłatę możliwie największych nominałów.
 */
public class Biletomat {

    public static final int PRICE_OF_ONE_TICKET = 4;

    public static void main(String[] args) {
        System.out.println ("Podaj ilość biletów");
        Scanner scanner = new Scanner (System.in);
        int numberOfTicket = scanner.nextInt ();
        int priceOfAllTicket = PRICE_OF_ONE_TICKET * numberOfTicket;
        System.out.println ("Zapląć za bilety: " + priceOfAllTicket + " złotych");
        System.out.println ("Wrzuć pieniądze ");
        int thrownBills = scanner.nextInt ();
        int rest = thrownBills - priceOfAllTicket;
        System.out.println ("Reszta to:" + rest+" złotych");
        int bill200 = 200;
        int bill100 = 100;
        int bill50 = 50;
        int bill20 = 20;
        int bill10 = 10;
        int bill5 = 5;
        int bill2 = 2;
        int bill1 = 1;

        int restQuantity200 = 0;
        int restQuantity100 = 0;
        int restQuantity50 = 0;
        int restQuantity20 = 0;
        int restQuantity10 = 0;
        int restQuantity5 = 0;
        int restQuantity2 = 0;
        int restQuantity1 = 0;
        int restToRelease;
        do {
            if (rest>bill200) {
                restQuantity200 = rest / bill200;
                restToRelease = rest % bill200;
                rest = restToRelease;
            } else if (rest>bill100) {
                restQuantity100 = rest / bill100;
                restToRelease = rest % bill100;
                rest = restToRelease;
            } else if (rest>bill50) {
                restQuantity50 = rest / bill50;
                restToRelease = rest % bill50;
                rest = restToRelease;
            } else if (rest>bill20) {
                restQuantity20 = rest / bill20;
                restToRelease = rest % bill20;
                rest = restToRelease;
            } else if (rest>bill10) {
                restQuantity10 = rest / bill10;
                restToRelease = rest % bill10;
                rest = restToRelease;
            } else if (rest>bill5) {
                restQuantity5 = rest / bill5;
                restToRelease = rest % bill5;
                rest = restToRelease;
            } else if (rest>bill2) {
                restQuantity2 = rest / bill2;
                restToRelease = rest % bill2;
                rest = restToRelease;
            } else {
                restQuantity1 = rest / bill1;
                restToRelease = rest % bill1;
                rest = restToRelease;

            }
        }
        while (rest != 0);


        System.out.println ("Twoja reszta:\n"+bill200+"*"+restQuantity200+", "+bill100+"*"+
                restQuantity100+", "+bill50+"*"+restQuantity50+", "+bill20+"*"+restQuantity20+", "+
                bill10+"*"+restQuantity10+", "+bill5+"*"+restQuantity5+", "+bill2+"*"+restQuantity2+", "+bill1+"*"+restQuantity1);
    }
}
