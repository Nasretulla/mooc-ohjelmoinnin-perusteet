
import java.util.ArrayList;
import java.util.Scanner;

public class EnsimmainenJaViimeinenArvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<String> lista = new ArrayList<>();
        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                break;
            }

            lista.add(luettu);
        }
        String eka = lista.get(0);
        String vika = lista.get(lista.size()-1);
        
        System.out.println(eka +" "+ vika);

    }
}
