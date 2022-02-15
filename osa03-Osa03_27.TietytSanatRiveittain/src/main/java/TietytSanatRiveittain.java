
import java.util.Scanner;

public class TietytSanatRiveittain {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        while (true) {
            String merkijono = lukija.nextLine();
            if (merkijono.equals("")) {
              break;

            }

            String[] palat = merkijono.split(" ");
            for (String i : palat) {
                if (i.contains("av")) {
                    System.out.println(i);

                }

            }

        }

    }

}
