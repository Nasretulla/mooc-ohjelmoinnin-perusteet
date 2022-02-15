
import java.util.Scanner;

public class PositiivistenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        double summa = 0;
        double lukuMaara = 0;
        double avg = 0;

        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == 0) {
                System.out.println("keskiarvon laskeminen ei ole mahdollista");
                break;

            }
            if (luku > 0) {
                lukuMaara++;
                summa += luku;

            }

        }

        avg = summa / lukuMaara;
        System.out.println(avg);
    }
}
