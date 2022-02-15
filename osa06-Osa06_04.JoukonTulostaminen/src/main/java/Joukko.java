
import java.util.ArrayList;

public class Joukko {

    private String nimi;
    private ArrayList<String> alkiot;

    public Joukko(String nimi) {
        this.nimi = nimi;
        this.alkiot = new ArrayList<>();
    }

    public void lisaa(String alkio) {
        this.alkiot.add(alkio);
    }

    public ArrayList<String> getAlkiot() {
        return this.alkiot;
    }

    public String toString() {

        if (alkiot.isEmpty()) {
            return "Joukko " + this.nimi + " on tyhjä.";

        }

        String tulos = "";
        
        for(String f : alkiot){
            tulos += "\n" + f;
          
        }
        if (alkiot.size() > 1) {
            return "Joukossa " + this.nimi + " on " + alkiot.size() + " alkiota:" + "\n" + tulos;
        }
        return "Joukossa " + this.nimi + " on " + alkiot.size() + " alkio:" + "\n" + alkiot.get(0);
    }
}
