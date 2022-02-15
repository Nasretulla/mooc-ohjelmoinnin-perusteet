
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Kirja> books = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);

        while (true) {
            System.out.println("Nimi: ");
            String nimi = lukija.nextLine();
            if (nimi.isEmpty()) {
                break;

            }

            System.out.println("Sivuja: ");
            int sivu = Integer.valueOf(lukija.nextLine());

            System.out.println("Julkaisuvuosi: ");
            int julkaisuvuosi = Integer.valueOf(lukija.nextLine());

            books.add(new Kirja(nimi, sivu, julkaisuvuosi));

        }
        System.out.println("Mitä tulostetaan? ");
        String tulostus = lukija.nextLine();
        if (tulostus.equals("kaikki")) {
            for (Kirja all : books) {
                System.out.println(all);

            }

        }
        if (tulostus.equals("nimi")) {
            for (Kirja booksname : books) {
                System.out.println(booksname.nimeke());
            } 
        }
        

    }
}
