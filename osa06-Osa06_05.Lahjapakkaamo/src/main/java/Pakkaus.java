
import java.util.ArrayList;

public class Pakkaus {

    private ArrayList<Lahja> lahjat;

    public Pakkaus() {
        this.lahjat = new ArrayList<>();

    }

    public void lisaaLahja(Lahja lahja) {
        lahjat.add(lahja);

    }

    public int yhteispaino() {
        int vazn = 0;
        for (Lahja i : lahjat){
            vazn += i.getPaino();
        
        }
        return vazn;
    }

}
