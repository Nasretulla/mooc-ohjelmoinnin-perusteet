
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Lukutilasto tilasto = new Lukutilasto();
        Lukutilasto parilliset = new Lukutilasto();
        Lukutilasto pariton = new Lukutilasto();

        while (true) {
            System.out.println("Anna lukuja: ");

            int luettu = Integer.valueOf(lukija.nextLine());

            if (luettu < 0) {
                break;

            }
            tilasto.lisaaLuku(luettu);
            
            if (luettu % 2 == 0) {
                parilliset.lisaaLuku(luettu);
            } else {
                pariton.lisaaLuku(luettu);
            }

        }
        System.out.println("Summa: " + tilasto.summa());
        System.out.println("Parillisten summa: " + parilliset.summa());
        System.out.println("Parittomien summa: " + pariton.summa());
        //System.out.println("Keskiarvo: " + tilasto.keskiarvo());

        
    }
}
