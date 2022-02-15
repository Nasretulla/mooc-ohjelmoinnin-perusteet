
import java.util.ArrayList;
import java.util.Scanner;

public class PienimmanLuvunIndeksi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta tänne ohjelma, joka lukee käyttäjältä lukuja
        // kunnes käyttäjä syöttää luvun 9999
        ArrayList<Integer> lista = new ArrayList<Integer>();

        while (true) {
            int luettu = Integer.valueOf(lukija.nextLine());
            if (luettu == 9999) {
                break;
            }
            lista.add(luettu);

        }
        System.out.println("");

        // tämän jälkeen ohjelma tulostaa pienimmän luvun
        // sekä sen indeksin -- pienin luku voi esiintyä
        // useammassa indeksissä
        
        int pienin  = lista.get(0);
        for (int i = 0; i < lista.size(); i++){
            int luku = lista.get(i);
            if( pienin > luku){
                pienin = luku ;            

            
            }
        
        }
        int index = lista.indexOf(pienin);
        System.out.println("pienin luku on " + pienin);
        System.out.println("pienemmän luvun indeksi on " + index);
    }
}
