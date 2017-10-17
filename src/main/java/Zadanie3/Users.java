package Zadanie3;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

/**
 * 3. Napisz program, który będzie przechowywał kontakty (imię, nazwisko, numer
 telefonu, adres e-mail).
 a. Kontakty mogą być predefiniowane z poziomu kodu.
 b. Kontakty mogą być odczytywane z dysku
 i. Użyj formatu JSON korzystając z biblioteki jackson-mapper-asl
 c. Program pyta o selekcję trybu wyszukiwania (po nazwie, numerze telefonu
 lub adresie e-mail).
 d. Program prosi o wpisanie konkretnej wartości i wypisuje wszystkie powiązane
 z nim informacje w postaci: Imię: imię Nazwisko:nazwisko, tel.: numer
 telefonu, e-mail: adres e-mail
 e. *Dodać możliwość wprowadzania kontaktu i zapisu do pliku
 */

public class Users {
    String name;
    String lastName;
    String phoneNumber;
    String email;

}
