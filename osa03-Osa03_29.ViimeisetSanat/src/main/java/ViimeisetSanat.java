
import java.util.Scanner;

public class ViimeisetSanat {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        while(true){
            String merkijono = lukija.nextLine();
            if(merkijono.equals("")){
                break;
            
            }
            String [] palat = merkijono.split(" ");
            String viimeinen = palat[palat.length-1];
            System.out.println(viimeinen);
            
        
        }


    }
}
