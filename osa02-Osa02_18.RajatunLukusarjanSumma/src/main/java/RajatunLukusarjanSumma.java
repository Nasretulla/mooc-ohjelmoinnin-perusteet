
import java.util.Scanner;

public class RajatunLukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int tulos = 0;

        System.out.println("Ensimmäinen:");
        int eka = Integer.valueOf(lukija.nextLine());

        System.out.println("Viimeinen: ");
        int viimeinen = Integer.valueOf(lukija.nextLine());

        for (int i = eka; i <= viimeinen; i++) {
            tulos = tulos + i;

        }
        System.out.println("Summa on " + tulos);
    }
}
