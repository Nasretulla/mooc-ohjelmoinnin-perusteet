
import java.util.ArrayList;
import java.util.Scanner;

public class VanhimmanNimi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<String> nimiLista = new ArrayList<>();

        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                break;

            }

            
            String[] palat = luettu.split(",");
            nimiLista.add(palat[0] + "," + palat[1]); 
            

        }
        
        String [] ekaNimi = nimiLista.get(0).split(",");
        int suurin = Integer.valueOf(ekaNimi[1]);  //34
        String vanhinNimi = ekaNimi[0]; //nimi
        
        for(String mjono : nimiLista){
            String [] mjonopalat = mjono.split(","); // nimi,34
            
            if(suurin < Integer.valueOf(mjonopalat[1])){
                 suurin = Integer.valueOf(mjonopalat[1]); //55
                 vanhinNimi = mjonopalat[0];
            
            
            }
        
        }
        System.out.println("vanhimman nimi on " + vanhinNimi);

    }

}

