
import java.util.Scanner;

public class Tekstikayttoliittyma {

    private Scanner lukija;
    private Sanakirja sanakirja;

    public Tekstikayttoliittyma(Scanner lukija, Sanakirja sanakirja) {
        this.lukija = lukija;
        this.sanakirja = sanakirja;

    }

    public void kaynnista() {

        while (true) {
            System.out.println("Komento: ");
            String kommento = lukija.nextLine();

            if (kommento.equals("lopeta")) {
                System.out.println("hei! hei!");
                break;

            }
            if (kommento.equals("lisaa")) {
                System.out.println("sana: ");
                String sana = lukija.nextLine();

                System.out.println("Käännös: ");
                String kaannos = lukija.nextLine();

                sanakirja.lisaa(sana, kaannos);

            } else if (kommento.equals("hae")) {

                System.out.println("haettava:");
                String haettava = lukija.nextLine();
                if (this.sanakirja.kaanna(haettava) == null) {
                    System.out.println("Sanaa " + haettava+ " ei löydy");

                } else {
                    System.out.println(this.sanakirja.kaanna(haettava));

                }

            } else {
                System.out.println("tuntematon komento");
            }

        }

    }

}
