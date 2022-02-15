
import java.util.Scanner;

public class EnsimmaisetSanat {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        while (true) {
            String merkijono = lukija.nextLine();
            if (merkijono.equals("")) {
                break;

            }

            String[] palat = merkijono.split(" ");

            System.out.println(palat[0]);

        }

    }
}
