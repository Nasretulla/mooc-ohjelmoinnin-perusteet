
import java.util.Scanner;

public class ParametristaYhteen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        tulostaLuvustaYhteen(5);

    }

    public static void tulostaLuvustaYhteen(int luku) {
        for (int i = 0; luku > i; luku--) {
            System.out.println(luku);

        }

    }

}
