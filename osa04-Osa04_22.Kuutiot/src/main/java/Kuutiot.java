
import java.util.Scanner;

public class Kuutiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        while (true) {
            
            String sana = lukija.nextLine();
            if (sana.contains("loppu")) {
                break;

            }
            int luku = Integer.valueOf(sana);
            int summa = luku * luku * luku;
            System.out.println(summa);

        }

    }
}
