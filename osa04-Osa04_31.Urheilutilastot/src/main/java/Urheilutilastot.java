

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


public class Urheilutilastot {
 
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
 
        System.out.println("Minkä niminen tiedosto luetaan?");
        String tiedosto = lukija.nextLine();
 
        ArrayList<Ottelu> ottelut = lueOttelut(tiedosto);
        System.out.println("Minkä nimisen joukkueen tilastot tulostetaan?");
        String joukkue = lukija.nextLine();
 
        // rajataan tarkasteltavat ottelut joukkueen otteluihin
        ArrayList<Ottelu> joukkueenOttelut = new ArrayList<>();
        for (Ottelu ottelu : ottelut) {
            if (joukkue.equals(ottelu.getKotijoukkue()) || joukkue.equals(ottelu.getVastustaja())) {
                joukkueenOttelut.add(ottelu);
            }
        }
 
        // tulostetaan otteluiden lukumäärä
        System.out.println("Otteluita: " + joukkueenOttelut.size());
 
        // lasketaan voittojen lukumäärä
        int voitot = 0;
        for (Ottelu ottelu : joukkueenOttelut) {
            if (ottelu.voittajaOn(joukkue)) {
                voitot++;
            }
        }
        System.out.println("Voittoja: " + voitot);
        System.out.println("Tappioita: " + (joukkueenOttelut.size() - voitot));
 
    }
 
    public static ArrayList<Ottelu> lueOttelut(String tiedosto) {
        ArrayList<Ottelu> ottelut = new ArrayList<>();
 
        try (Scanner tiedostonLukija = new Scanner(Paths.get(tiedosto))) {
            while (tiedostonLukija.hasNextLine()) {
                String rivi = tiedostonLukija.nextLine();
                if (rivi.isEmpty()) {
                    continue;
                }
 
                String[] osat = rivi.split(",");
 
                String kotijoukkue = osat[0];
                String vierasjoukkue = osat[1];
 
                int kotipisteet = Integer.valueOf(osat[2]);
                int vieraspisteet = Integer.valueOf(osat[3]);
 
                ottelut.add(new Ottelu(kotijoukkue, vierasjoukkue, kotipisteet, vieraspisteet));
            }
        } catch (Exception e) {
            System.out.println("Tiedoston lukeminen epäonnistui.");
        }
 
        return ottelut;
 
    }
}
 