
import java.util.Random;
import java.util.Scanner;

public class Kayttoliittyma {

    private Vitsipankki vitsi;
    private Scanner lukija;

    public Kayttoliittyma(Vitsipankki vitsi, Scanner lukija) {
        this.vitsi = vitsi;
        this.lukija = lukija;

    }

    public void kaynnista() {
        
        while (true) {
            System.out.println("Komennot:");
            System.out.println(" 1 - lisää vitsi");
            System.out.println(" 2 - arvo vitsi");
            System.out.println(" 3 - listaa vitsit");
            System.out.println(" X - lopeta");
            String komento = lukija.nextLine();
            if (komento.equals("X")) {
                break;
            }
            if (komento.equals("1")) {
                System.out.println("Kirjoita lisättävä vitsi:");
                String vitsii = lukija.nextLine();
                vitsi.lisaaVitsi(vitsii);
                continue;
            } else if (komento.equals("2")) {
                System.out.println("Arvotaan vitsi.");
                System.out.println(vitsi.arvoVitsi());

            } else if (komento.equals("3")) {

               this.vitsi.tulostaVitsit();
            }
        }
    }
}
