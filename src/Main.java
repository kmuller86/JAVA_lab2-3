import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* cw.4  */

        /* zad.1 napisać 3 pętle for i użyc:
        a) w pierwszej pętli break
        b) w drugiej pętli continue
        c) w trzeciej pętli return
        */


        Scanner scan = new Scanner(System.in);
        //pętla a) break
        for (int i=10; i>0; i--)
        {
            System.out.println("\nIle to jest 2+2? Liczba prób " + i);
            int odp= scan.nextInt();
         if(odp==4){
             System.out.println("Dobra odpowiedź!");
             break;
         }
            System.out.println("Zła odpowiedź");
        }

        //pętla b) continue
        for (int i=3; i>0; i--)
        {
            System.out.println("\nIle to jest 2+ " + i + "?");
            int odp= scan.nextInt();
            if(odp==2+i){
                System.out.println("Dobra odpowiedź!");
                continue;
            }
            System.out.println("Zła odpowiedź");
        }



        //pętla c) return

        System.out.println(metoda());
    }
    public static String metoda()
    {
        Scanner scan = new Scanner(System.in);


        String dobraOdpowiedz ="Dobra odpowiedź! Wygrałeś! :)";
        String przegrana = "Koniec gry. Przegrałeś.";

        for (int i=3; i>=0; i--)
        {
            System.out.println("\nIle to jest 10+5?");
            int answer= scan.nextInt();

            if(answer==15){

                return dobraOdpowiedz;
            }
            else
            {
                System.out.println("Zła odpowiedź. Pozostałych prób: " + i);;}
        }
        return przegrana;
    }  }
