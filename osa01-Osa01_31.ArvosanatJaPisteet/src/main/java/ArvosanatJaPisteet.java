
import java.util.Scanner;

public class ArvosanatJaPisteet {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna pisteet [0-100]");
        int pisteet = Integer.parseInt(lukija.nextLine());

        if (pisteet < 0) {
            System.out.println("mahdotonta!");
        } else if (pisteet <= 49) {
            System.out.println("Hylätty!");
        } else if (pisteet >= 50 && pisteet <= 59) {
            System.out.println("arvosana: 1");
        } else if (pisteet >= 60 && pisteet <= 69) {
            System.out.println("Arvosana: 2");
        } else if (pisteet >= 70 && pisteet <= 79) {
            System.out.println("Arvosana: 3");
        } else if (pisteet >= 80 && pisteet <= 89) {
            System.out.println("Arvosana: 4");

        } else if (pisteet >= 90 && pisteet <= 100) {
            System.out.println("Arvosana: 5");
        } else if (pisteet >= 100) {
            System.out.println("uskomatonta!");
        }

    }
}
