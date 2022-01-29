import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collections;
import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        /* ćw_6 Listy */

        /* zad.1 a) Napisać program który stworzy listę ArrayList<String> (lista tablicowa),
                Proszę dane wprowadzać z klawiatury (można użyć pętli), lista ma mieć przynajmniej 5
                elementów i elementami mają być nazwy zwierząt.
                b) proszę stworzyć metodę która będzie miała pętle forEach i będzie wyświetlała elementy Listy
                -- podpowiedź: for(String zmienna : List<String>)
                c) proszę usunąć 2 ostatnie elementy listy i dodać do niej 3 inne elementy,
                następnie wyświetlić listę i wielkość listy,
                d) następnie proszę wykonać odwrotne sortowanie i znów użyć metody z punktu b) do wyświetlenia
                elementów listy
          */

        //Nie zrozumiałem czy wartosci z listy maja byc zwierzetami, czy dowolnie wpisanymi przez uzytkownika wartosciami,
        //wiec zrobilem dwie listy.
        
        /* miały być zwierzęta wprowadzane z klawiatury, ale ogolnie jest ok */

        //ZADANIE a)
        Scanner scan = new Scanner(System.in);
        List<String> lista= new ArrayList<>();

        for (int i=0; i<5; i++)
        {
            System.out.println("Wpisz wartosc ktora ma byc w liście: ");
            String wartosc = scan.nextLine();
            lista.add(wartosc);
        }

        List<String> listaZwierzat= new ArrayList<>();
        listaZwierzat.add("Lew");
        listaZwierzat.add("Tygrys");
        listaZwierzat.add("Kot");
        listaZwierzat.add("Puma");
        listaZwierzat.add("Ryś");

        //ZADANIE b)
        wyswietlListe(listaZwierzat);
        //ZADANIE c)
        listaZwierzat.remove((listaZwierzat.get(listaZwierzat.size()-1)));
        listaZwierzat.remove((listaZwierzat.get(listaZwierzat.size()-1)));

        listaZwierzat.add("Gepard");
        listaZwierzat.add("Pantera");
        listaZwierzat.add("Jaguar");

        wyswietlListe(listaZwierzat);
        System.out.println("Wielkość listy: " + listaZwierzat.size());

        //ZADANIE d)
        Collections.reverse(listaZwierzat);
        wyswietlListe(listaZwierzat);

         /* zad.2 Napisać program który stworzy Set<Integer> i wprowadzamy 10 liczb z klawiatury
                niech liczby się powtarzają, proszę posortować a następnie wyświetlić zawartość set-a w konsoli
                 a następnie przeiterować i wyświetlić forEach-em (jak wyżej)
         */
        //ZADANIE 2
        Set<Integer> setIntList = new TreeSet<>();
        System.out.println("Wprowadź 10 liczb z klawiatury.");

        for (int i=1; i<=10;i++)
        {
            System.out.println("Wprowadź liczbę nr " + i+ ":");
            int liczba= scan.nextInt();
            setIntList.add(liczba);
        }

        //Collections.sort(setIntList);

        for(Integer num : setIntList){
            System.out.println(num);
        }

    }
    public static void wyswietlListe(List<String> lista)
    {
        System.out.println("\nZawartosc listy ze zwierzetami: ");
        for (String word:lista) {
            System.out.print(word+ ", ");

        }
    }
}
