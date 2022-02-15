
import java.nio.file.Paths;
import java.util.Scanner;

public class MittauksetTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Tiedosto? ");
        String tiedosto = lukija.nextLine();
        System.out.print("Alaraja? ");
        int alaraja = Integer.parseInt(lukija.nextLine());
        System.out.print("Yläraja? ");
        int ylaraja = Integer.parseInt(lukija.nextLine());

        try (Scanner tiedostonLukija = new Scanner(Paths.get(tiedosto))) {
            int luku = 0;
            while (tiedostonLukija.hasNextLine()) {
                String merkiJono = tiedostonLukija.nextLine();
                int luvut = Integer.valueOf(merkiJono);

                if (luvut >= alaraja && luvut <= ylaraja) {
                    luku++;
                }

            }

            System.out.println("Lukuja:" + luku);
        } catch (Exception ex) {
            System.out.println("Virhe tiedoston " + tiedosto + " lukemisessa.");

        }
    }

}
