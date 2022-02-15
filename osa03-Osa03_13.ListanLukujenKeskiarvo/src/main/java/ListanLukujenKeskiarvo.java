
import java.util.ArrayList;
import java.util.Scanner;

public class ListanLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        // toteuta tänne ohjelma, joka ensin lukee käyttäjältä
        // lukuja listalle kunnes käyttäjä syöttää luvun -1.
        // ohjelma laskee tämän jälkeen listalla olevien lukujen
        // keskiarvon, ja tulostaa sen käyttäjän näkyville
        while (true) {
            int luettu = Integer.valueOf(lukija.nextLine());
            if (luettu == -1) {
                break;
            }
            lista.add(luettu);

        }
        System.out.println("");
        double summa = 0;
        double ka = 0;
        double krt = 0;
        
        for(int listat : lista){
            summa += listat;
            krt++;
            ka = summa / krt;
        
        }
            System.out.println("Keskiarvo: " + ka);
    }
    

}

