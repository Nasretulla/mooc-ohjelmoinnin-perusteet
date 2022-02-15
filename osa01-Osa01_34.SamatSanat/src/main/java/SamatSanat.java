
import java.util.Scanner;

public class SamatSanat {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Toteuta ohjelmasi tähän. 
        System.out.println("Syötä ensimmäinen merkkijono: ");
        String ekaSana = lukija.nextLine();

        System.out.println("Syötä toinen merkkijono: ");
        String toinenSana = lukija.nextLine();

        if (ekaSana.equals(toinenSana)) {
            System.out.println("Samat sanat");

        } else {
            System.out.println("Ei sitten");

        }

    }
}
