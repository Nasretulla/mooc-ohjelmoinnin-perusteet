
import java.util.Scanner;

public class SummanNeliojuuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int luku = Integer.valueOf(lukija.nextLine());
        int luku2 = Integer.valueOf(lukija.nextLine());
        
        
        double nelio = Math.sqrt(luku+luku2);
        
        System.out.println(nelio);

    }
}
