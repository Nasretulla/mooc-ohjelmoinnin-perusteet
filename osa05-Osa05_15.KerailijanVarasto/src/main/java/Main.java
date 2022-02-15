
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Esine> esineet = new ArrayList<>();

        while (true) {
            System.out.println("Syötä esineen tunnus, tyhjä lopettaa.");
            String esinenTunnus = lukija.nextLine();
            

            if (esinenTunnus.isEmpty()) {
                break;

            }
            System.out.println("Syötä esineen nimi, tyhjä lopettaa.");
            String esinenNimi = lukija.nextLine();
            if (esinenNimi.isEmpty()) {
                break;
            }
            
            Esine tavarat = new Esine(esinenTunnus, esinenNimi);
            
            if (!esineet.contains(tavarat)) {
                esineet.add(tavarat);
            }

        }

        System.out.println("==Esineet==");

        for (Esine n : esineet) {

            System.out.println(n);

        }

    }
}
