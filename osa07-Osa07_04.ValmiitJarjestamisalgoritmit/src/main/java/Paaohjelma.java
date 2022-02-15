
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Paaohjelma {

    public static void main(String[] args) {
        // tee testikoodia tänne
        int[] taulukko = {3, 1, 5, 99, 3, 12};
    }

    public static void jarjesta(int[] taulukko) {
        
        System.out.println(Arrays.toString(taulukko));
        Arrays.sort(taulukko);
        System.out.println(Arrays.toString(taulukko));

    }

    public static void jarjesta(String[] taulukko) {
        System.out.println(Arrays.toString(taulukko));
        Arrays.sort(taulukko);
        System.out.println(Arrays.toString(taulukko));

    }

    public static void jarjestaLuvut(ArrayList<Integer> luvut) {
        System.out.println(luvut);
        Collections.sort(luvut);
        System.out.println(luvut);
    }

    public static void jarjestaMerkkijonot(ArrayList<String> merkkijonot) {
        System.out.println(merkkijonot);
        Collections.sort(merkkijonot);
        System.out.println(merkkijonot);

    }
}
