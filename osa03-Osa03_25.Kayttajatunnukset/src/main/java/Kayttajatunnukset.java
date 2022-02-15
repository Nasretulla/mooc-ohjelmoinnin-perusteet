
import java.util.Scanner;

public class Kayttajatunnukset {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        String [] nimi = {"aleksi", "elina"};
        String [] salasana = {"tappara", "kissa"};
        
        System.out.println("Anna tunnus: ");
        String tunnus = lukija.nextLine();
        
        System.out.println("Anna salasana: ");
        String password = lukija.nextLine();
        
        if(tunnus.equals(nimi[1]) && password.equals(salasana[1]) || tunnus.equals(nimi[0]) && password.equals(salasana[0])){
            System.out.println("Olet kirjautunut järjestelmään");
        
        }
        else{
            System.out.println("Virheellinen tunnus tai salasana!");
        
        }
       

    }
}
