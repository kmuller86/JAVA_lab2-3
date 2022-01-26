import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* ćwiczenie 5 Metody */

        /* zad.1
        a) stworzyć tablicę typu int[20],
        b) napisać metodę która będzie uzupełniała tablicę wartościami od 40 do 21,
        c) napisać metodę, która wypisze otrzymane wartości,
        d) wstawić wywołanie metody do metody main
        */

        int[] tab= new int [20];
        uzupelnijTablice(tab);


        /* zad.2
        a) stworzyc tablicę typu String[6],
        b) napisać metodę która uzupełni tablicę wartościami podawanymi z klawiatury
            (użyć do tego pętli i klasy Scanner),
        c) napisać metodę która wyświetli elementy tablicy od ostatniego elementu do elementu o indeksie 0,
        */

        String[] tabString = new String[6];

        uzupelnijWartosciamiZKlawiatury(tabString);

        wyswietlTablice(tabString);


        /* zad.3
        a) napisać metodę która przyjmuje 1 parametr typu String, metoda nic nie zwraca, tylko
            wyświetla w konsoli string który ma być waszym imieniem,
        b) napisać metodę o tej samej nazwie jak w punkcie a) z 2-oma parametrami typu String, która wyświetli
            wasze imie i nazwisko,
        c) napisać metodę o tej samej nazwie jak w punkcie a) i b) która przyjmuje wasze imie,
            nazwisko i wiek (int), a następnie wszystko wyświetli,
        */
        przedstawSie("Mikołaj");
        przedstawSie("Mikołaj", "Sykucki");
        przedstawSie("Mikołaj", "Sykucki", 26);


        /* zad.4
        a) napisać metodę która przyjmuje 2 parametry typu int i zwraca ich sumę, którą przypiszemy do zmiennej,
            coś takiego:                                    zmiennaA = metoda(1, 2); <-- wywołanie metody
        b) napisać metodę (nazwa ta sama co w punkcie a) która przyjmuje 3 parametry typu int i zwraca ich sumę,
            którą przypiszemy do zmiennej, coś takiego:     zmiennaB = metoda(7, 8, 9); <-- wywołanie metody
        c) wyświetlić sumę wywołań obu metod ---> print("wynik: " + (metoda(8, 9) + metoda(2, 3, 4));
        */
        int suma = dodawanie(1,2);

        int sumaZTrzech = dodawanie(1, 2, 3);

        System.out.println("wynik: " + (dodawanie(1,2) + dodawanie(1, 2, 3)));
    }
 public static void uzupelnijTablice(int tab[])
 {
   for (int i=0;i< tab.length;i++)
   {
    tab[i]=40-i;

   }

 }
 public static void uzupelnijWartosciamiZKlawiatury(String tabString[])
 {
     Scanner scan = new Scanner(System.in);

     for (int i=0;i< tabString.length;i++)
     {
         System.out.println("Podaj słowo:");
          tabString[i]= scan.nextLine();
     }
 }
public static void wyswietlTablice(String tabString[])
{
    for (int i=(tabString.length-1);i>=0;i--)
    {
        System.out.print(tabString[i] + " ");
    }
    System.out.println();
}
public static void przedstawSie(String imie)
{
    System.out.println(imie);
}
    public static void przedstawSie(String imie, String nazwisko)
    {
        System.out.println(imie + " " + nazwisko);
    }
    public static void przedstawSie(String imie, String nazwisko, int wiek)
    {
        System.out.println(imie + " " + nazwisko + " " + wiek);
    }
public static int dodawanie(int x, int y)
{
    return x+y;
}
    public static int dodawanie(int x, int y, int z)
    {
        return x+y+z;
    }
}
