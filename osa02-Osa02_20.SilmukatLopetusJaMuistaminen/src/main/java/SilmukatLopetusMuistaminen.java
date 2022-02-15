
import java.util.Scanner;

public class SilmukatLopetusMuistaminen {

    public static void main(String[] args) {
        // Kyseessä on yksi iso tehtävä jota koko ajan laajennetaan -- tehtävä
        // on viiden yksittäisen tehtäväpisteen arvoinen

        // Voit halutessasi lähettää osittain tehdyn tehtäväsarjan tarkastettavaksi palvelimelle
        // palvelin valittaa tällöin niistä testeistä joita vastaava koodi ei ole vielä
        // kirjoitettu. Jo tehdyt osat kuitenkin kirjautuvat tehdyiksi.
        Scanner lukija = new Scanner(System.in);
        int summa = 0;
        int maara = 0;
        double avg = 0;
        int pos = 0;
        int neg = 0;
        while (true) {
            System.out.println("Syötä luvut: ");
            Double luvut = Double.valueOf(lukija.nextLine());
            if (luvut == -1) {
                break;

            }
            if (luvut % 2 == 0) {
                pos++;

            } else {
                neg++;
            }

            summa += luvut;
            maara++;
            avg = 1.0* summa / maara;

        }

        System.out.println("Kiitos ja näkemiin!");
        System.out.println("Summa: " + summa);
        System.out.println("Lukuja: " + maara);
        System.out.println("Keskiarvo: " + avg);
        System.out.println("Parillisia: " + pos);
        System.out.println("Parittomia: " + neg);

    }
}
