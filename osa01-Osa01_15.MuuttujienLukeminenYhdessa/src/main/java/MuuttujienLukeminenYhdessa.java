
import java.util.Scanner;

public class MuuttujienLukeminenYhdessa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        System.out.println("Syötä merkkijono!");
        String merkkijono = lukija.nextLine();
        
        System.out.println("Syötä kokonaisluku!");
        int kokonaisLuku = Integer.valueOf(lukija.nextLine());
        
        System.out.println("Syötä liukuluku!");
        Double liukuLuku = Double.valueOf(lukija.nextLine());
        
        System.out.println("Syötä totuusarvo!");
        Boolean arvo = Boolean.valueOf(lukija.nextLine());
        
        System.out.println("Syötit merkkijonon " + merkkijono);
        System.out.println("Syötit kokonaisluvun " + kokonaisLuku);
        System.out.println("Syötit liukuluvun " + liukuLuku);
        System.out.println("Syötit totuusarvon " + arvo);
        
        
        
        
        
        
    }
}
