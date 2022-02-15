
import java.util.ArrayList;

public class Matkalaukku {

    private int maksimiPaino;
    private int yhteisPaino;

    private ArrayList<Tavara> tavarat;

    public Matkalaukku(int maksimiPaino) {
        this.maksimiPaino = maksimiPaino;
        this.tavarat = new ArrayList<>();

    }

    public void lisaaTavara(Tavara tavara) {
        
        if ((tavara.getPaino() + this.yhteisPaino) <= this.maksimiPaino) {
            this.tavarat.add(tavara);
            this.yhteisPaino = tavara.getPaino() + this.yhteisPaino;
        }
    }    

    public void tulostaTavarat() {

        for (Tavara tavarat : tavarat) {
            System.out.println(tavarat);

        }

    }

    public int yhteispaino() {

        return this.yhteisPaino;

    }

    public Tavara raskainTavara() {
        if (tavarat.isEmpty()) {
            return null;

        }

        Tavara painavin = this.tavarat.get(0);

        for (Tavara f : this.tavarat) {
            if (painavin.getPaino() < f.getPaino()) {
                painavin = f;

            }

        }

        return painavin;
    }

    public String toString() {

        if (tavarat.size() == 0) {
            return "ei tavaroita (0 kg)";

        } else if (tavarat.size() == 1) {
            return tavarat.size() + " tavara" + " (" + this.yhteisPaino + " kg)";

        } else {
            return tavarat.size() + " tavaraa" + " (" + this.yhteisPaino + " kg)";
        }

    }
    
    

}
