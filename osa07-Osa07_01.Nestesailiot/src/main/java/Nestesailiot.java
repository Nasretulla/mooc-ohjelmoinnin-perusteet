
import java.util.Scanner;

public class Nestesailiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int ensimmainen = 0;
        int toinen = 0;

        while (true) {
            System.out.println("Ensimmäinen: " + ensimmainen + "/100");
            System.out.println("Toinen: " + toinen + "/100");
            String luettu = lukija.nextLine();

            if (luettu.equals("lopeta")) {
                break;

            }

            String[] osat = luettu.split(" ");
            String komento = osat[0];
            int maara = Integer.valueOf(osat[1]);

            if (maara < 0) {
                maara = 0;
            }

            if (komento.equals("lisaa")) {
                if (ensimmainen + maara < 100) {
                    ensimmainen += maara;
                } else if (ensimmainen + maara > 100) {
                    ensimmainen = 100;
                }

            }  if (komento.equals("siirra")) {
                if (toinen + maara < 100) {
                    toinen += maara;
                    if (ensimmainen - maara > 0) {
                        ensimmainen -= maara;

                    } else if (ensimmainen - maara < 0) {
                        
                        toinen = ensimmainen;
                    }
                } else if (toinen + maara > 100) {
                     
                    toinen = 100;
                    ensimmainen -= maara;
                    ensimmainen = 0;
                    
              
                }
               
                
            } else if (komento.equals("poista")) {
                if (toinen - maara < 0) {
                    toinen = 0;
                } else if (toinen - maara >= 0) {
                    toinen -= maara;
                }
            }
        }
    }
}
