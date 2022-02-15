
import java.util.ArrayList;

public class Viestipalvelu {

    private ArrayList<Viesti> palvelu;

    public Viestipalvelu() {
        this.palvelu = new ArrayList<>();

    }

    public void lisaa(Viesti viesti) {

        String pituus = viesti.getSisalto();
        if (pituus.length() <= 280) {
            palvelu.add(viesti);

        }

    }

    public ArrayList<Viesti> getViestit() {
        return palvelu;
    }
}
