
import java.util.Scanner;

public class LukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        double lukuMaara = 0;
        double summa = 0;
        double avg;

        while (true) {
            System.out.println("Syötä luku");
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == 0) {
                break;

            }
            lukuMaara++;
            summa += luku;

        }
        avg = summa / lukuMaara;
        System.out.println("Lukuja yhteensä " + lukuMaara);
        System.out.println("Lukujen summa " + summa);
        System.out.println("Lukujen keskiarvo " + avg);
    }
}
