
import java.util.Scanner;
import java.util.ArrayList;

public class VanhimmanIka {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Integer> ika = new ArrayList<>();
       ArrayList<String> nimi = new ArrayList<>();

        while (true) {
            String merkijono = lukija.nextLine();
            if (merkijono.equals("")) {
                break;

            }
            
            nimi.add(merkijono);
            String [] palat = merkijono.split(",");
            ika.add(Integer.valueOf(palat[1]));

        }
        int vanhin = ika.get(1);
        for(int i = 0;i < ika.size();i++){
            int luku = ika.get(i);
            if( vanhin < luku){
                vanhin = luku;
                
                System.out.println("Vanhimman ikä on " + vanhin);
            
            }
            
        
        
        }

    }
}
