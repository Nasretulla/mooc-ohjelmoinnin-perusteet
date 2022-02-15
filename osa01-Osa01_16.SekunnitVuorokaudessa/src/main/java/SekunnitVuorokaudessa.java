
import java.util.Scanner;

public class SekunnitVuorokaudessa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        int paiva = 24;
        int tunnit = 3600;
        System.out.println("Kuinka monen vuorokauden sekunnit tulostetaan?");
        int luku = Integer.valueOf(lukija.nextLine());
        luku = paiva*tunnit*luku;
        
        System.out.println(luku);
        

    }
}
