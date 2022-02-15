
import java.util.ArrayList;

public class Pakka {

    private ArrayList<String> Pakka;

    public Pakka() {
        this.Pakka = new ArrayList<>();
    }

    public boolean onTyhja() {
        if (this.Pakka.isEmpty()) {
            return true;

        }
        return false;
    }

    public void lisaa(String arvo) {
        this.Pakka.add(arvo);

    }

    public ArrayList<String> arvot() {
        return this.Pakka;
       
    }

    public String ota() {
        
        return this.Pakka.remove(Pakka.size() - 1);
    }

}
