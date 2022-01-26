import java.util.Scanner;

public class Main {

    private static int[] tablica;

    public static void main(String[] args) {

        /* ćwiczenie 3 switch case */

        /* zad.1 napisać program który przyjmuje jedną liczbę od użytkownika z klawiatury
          i za pomocą switch case default ma określić czy:
          a) ta liczba jest parzysta --> podpowiedz switch(a % 2) {
          b) program który określi czy liczba jest podzielna przez 7
         */
        System.out.println("Zadanie 1: \n");

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int liczba = scan.nextInt();

        switch(liczba%2)
        {
            case 0:
                System.out.println("Liczba jest parzysta");
                break;
            default:
                System.out.println("Liczba jest NIE parzysta");
        }
        switch(liczba%7)
        {
            case 0:
                System.out.println("Liczba jest podzielna przez 7");
                break;
            default:
                System.out.println("Liczba NIE jest podzielna przez 7");
        }

        /* zad.2
           a) napisać program podobny do programu z przykładu, który ma zliczyć iloś liter 'o', 'p', 'x', 'z', 'q' w wyrazie:
            "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo"
           b) oraz ma określić ile jest pozostałych liter, które nie należą do: 'o', 'p', 'x', 'z', 'q'
         */
        System.out.println("\nZadanie 2: \n");

        /* Switch case często używany jest z pętlą, gdzie case-y działają jak else if() */
        String text = "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo";
        int[] tablica = {0, 0, 0, 0, 0, 0};
        /* toCharArray() - metoda zamienia String na tablicę char[] */
        for (char zmiennaChar : text.toCharArray()) {
            switch (zmiennaChar) {
                case 'o':
                    ++tablica[0];
                    break;
                case 'p':
                    ++tablica[1];
                    break;
                case 'x':
                    ++tablica[2];
                    break;
                case 'z':
                    ++tablica[3];
                    break;
                case 'q':
                    ++tablica[4];
                    break;
                default:
                    ++tablica[5];
            }
        }
        System.out.printf("Litera występuje: \n");
        System.out.println("o: " + tablica[0]);
        System.out.println("p: " + tablica[1]);
        System.out.println("x: " + tablica[2]);
        System.out.println("z: " + tablica[3]);
        System.out.println("q: " + tablica[4]);
        System.out.println("suma innych liter: " + tablica[5]);

    }
}


