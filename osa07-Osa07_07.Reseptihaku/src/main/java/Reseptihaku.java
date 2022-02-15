
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Reseptihaku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Resepti> reseptit = new ArrayList<>();

        System.out.println("Mistä luetaan?");
        String tiedosto = lukija.nextLine();
        System.out.println("");//tyhjä

        System.out.println("listaa - listaa reseptit ");
        System.out.println("lopeta - lopettaa ohjelman");
        System.out.println("hae nimi - hakee reseptiä nimen perusteella");
        System.out.println("hae keittoaika - hakee reseptiä keittoajan perusteella");
        System.out.println("hae aine - hakee reseptiä raaka-aineen perusteella");

        try (Scanner tiedostoLukija = new Scanner(Paths.get(tiedosto))) {
            while (tiedostoLukija.hasNextLine()) {
                String reseptinNimi = tiedostoLukija.nextLine();
                String keittoAika = tiedostoLukija.nextLine();
                int keittoAikaLuku = Integer.parseInt(keittoAika);
                Resepti resept = new Resepti(reseptinNimi, keittoAikaLuku);
                reseptit.add(resept);

                while (tiedostoLukija.hasNextLine()) {
                    String raakaAine = tiedostoLukija.nextLine();
                    resept.lisaa(raakaAine);
                    if (raakaAine.isEmpty()) {
                        break;
                    }
                }

            }

        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }

        while (true) {
            System.out.println("");
            System.out.print("Syötä komento: ");
            String komento = lukija.nextLine();
            System.out.println("");

            if (komento.equals("lopeta")) {
                break;

            }
            if (komento.equals("listaa")) {
                System.out.println("Reseptit: ");
                for (Resepti f : reseptit) {
                    System.out.println(f);

                }

            }
            if (komento.contains("hae nimi")) {
                System.out.println("Mitä haetaan: ");
                String nimenHaku = lukija.nextLine();
                 for(Resepti nimi : reseptit){
                     if (nimi.getNimi().contains(nimenHaku)){
                         System.out.println(nimi);
                     }
                 
                 
                 }

            }
            if(komento.equals("hae keittoaika")){
                System.out.println("Keittoaika korkeintaan: ");
                int keittoaika = Integer.parseInt(lukija.nextLine());
                for (Resepti aika : reseptit){
                    if(aika.getAika() <= keittoaika){
                        System.out.println(aika);
                    }
                
                }
            
            }
            if (komento.equals("hae aine")){
                System.out.println("Mitä raaka-ainetta haetaan:");
                String raaka = lukija.nextLine();
                for (Resepti aine : reseptit){
                    if(aine.getRaakaAineet().contains(raaka)){
                        System.out.println(aine);
                    
                    }
                
                }
            
            
            }

        }

    }

}
