
import java.util.ArrayList;
import java.util.Scanner;

public class Henkilotiedot {

    public static void main(String[] args) {
        // toteuta luokkaa Henkilotieto käyttävä ohjelmasi tänne

        ArrayList<Henkilotieto> henkilotiedot = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);

        while (true) {
            System.out.println("Etunimi: ");
            String etunimi = lukija.nextLine();
            if (etunimi.isEmpty()) {
                break;
            }

            System.out.print("Sukunimi: ");
            String sukunimi = lukija.nextLine();

            System.out.print("Henkilotunnus: ");
            String hetu = lukija.nextLine();

            henkilotiedot.add(new Henkilotieto(etunimi, sukunimi,hetu));

        }

        System.out.println("");

        for (Henkilotieto henkilo: henkilotiedot) {
                System.out.println(henkilo.getEtunimi() + " " + henkilo.getSukunimi());
}

    }
}
