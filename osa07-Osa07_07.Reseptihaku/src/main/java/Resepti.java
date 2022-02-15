
import java.util.ArrayList;

public class Resepti {

    private String nimi;
    private int aika;

    private ArrayList<String> raakaAineet;

    public Resepti(String nimi, int aika) {
        this.nimi = nimi;
        this.aika = aika;
        this.raakaAineet = new ArrayList<>();

    }

    public String getNimi() {
        return this.nimi;

    }
    
    public ArrayList<String> getRaakaAineet() {
        return raakaAineet;
    }

    public int getAika() {
       return this.aika;
    }

    public void lisaa(String raakaAine) {
        raakaAineet.add(raakaAine);

    }

    public String toString() {
       // String palautettava = this.nimi;
       // for (String raakaAine : this.raakaAineet) {
          //  palautettava += "\n  " + raakaAine;
      //  }
        return this.nimi + ", keittoaika: " + this.aika;
    }

}
