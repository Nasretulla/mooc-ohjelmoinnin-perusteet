
import java.util.Scanner;

public class Kertoma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int luku = Integer.valueOf(lukija.nextLine());
        int n = 1;
        for (int i = 1; i <= luku; i++) {
            n = n * i;

        }

        System.out.println(n);

    }
}
