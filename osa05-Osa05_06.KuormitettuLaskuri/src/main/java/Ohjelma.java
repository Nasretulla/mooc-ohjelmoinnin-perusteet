
import java.util.Scanner;


public class Ohjelma {

    public static void main(String[] args) {
        // tee tänne testikoodia
        Scanner lukija = new Scanner(System.in);
        
        Laskuri math = new Laskuri(1);
        
        System.out.println(math);
        
        math.lisaa(2);
        System.out.println(math);
    }
}
