
import java.util.Scanner;

public class TietoaLuvuista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int luku = Integer.valueOf(lukija.nextLine());
        int luku2 = Integer.valueOf(lukija.nextLine());

        if (luku > luku2) {
            System.out.println(luku + " on suurempi kuin " + luku2);

        } else if (luku < luku2) {
            System.out.println(luku + " on pienempi kuin " + luku2);

        } else {
            System.out.println(luku + " on yhtä suuri kuin " + luku2);
        }

    }
}
