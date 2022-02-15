
public class Tulostelua {

    public static void main(String[] args) {

        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.
        // HUOM: jos testit eivät meinaa mennä läpi, kokeile pääohjelmaa ajamalla,
        // että metodit toimivat niinkuin niiden on tarkoitus toimia!
        tulostaTahtia(3);
        System.out.println("\n---");  // tulostetaan kuvioiden välille ---
        tulostaNelio(5);
        System.out.println("\n---");
        tulostaSuorakulmio(4, 2);
        System.out.println("\n---");
        tulostaKolmio(3);
        System.out.println("\n---");
    }

    public static void tulostaTahtia(int maara) {
        // tehtävän ensimmäinen osa
        int luku = 1;
        while (luku <= maara) {
            luku++;
            System.out.print("*");

        }
        System.out.println("");

    }

    public static void tulostaNelio(int sivunpituus) {
        // tehtävän toinen osa

        for (int rivi = 0; rivi < sivunpituus; rivi++) {
            //System.out.print("*");

            for (int pituus = 0; pituus < sivunpituus; pituus++) {
                System.out.print("*");

            }
            System.out.println("");

        }
    }

    public static void tulostaSuorakulmio(int leveys, int korkeus) {
        // tehtävän kolmas osa
        for (int rivi = 1; rivi <= korkeus; rivi++) {

            for (int korko = 1; korko <= leveys; korko++) {
                System.out.print("*");

            }
            System.out.println("");

        }

    }

    public static void tulostaKolmio(int koko) {
        // tehtävän neljäs osa
        for (int rivi = 0; rivi <= koko; rivi++) {

            for (int pituus = 0; pituus < rivi; pituus++) {
                System.out.print("*");

            }
            System.out.println("");
        }

    }
}
