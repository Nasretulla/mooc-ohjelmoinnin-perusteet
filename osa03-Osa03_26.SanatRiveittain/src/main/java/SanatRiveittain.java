
import java.util.Scanner;

public class SanatRiveittain {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        while (true) {
            String merkijono = lukija.nextLine();
            
            if (merkijono.equals("")) {
                break;

            }
            
            String[] palat = merkijono.split(" ");

            for (String palat1 : palat) {
                System.out.println(palat1);
            }

        }

    }
}
