
import java.util.ArrayList;

public class Lastiruuma {

    private int maksimiPaino;
    private int kokoPaino;
    private ArrayList<Matkalaukku> laukkut;

    public Lastiruuma(int maksimiPaino) {
        this.maksimiPaino = maksimiPaino;
        this.laukkut = new ArrayList<>();

    }

    public void lisaaMatkalaukku(Matkalaukku laukku) {
        if (laukku.yhteispaino() + this.kokoPaino <= this.maksimiPaino) {
            this.laukkut.add(laukku);
            this.kokoPaino = laukku.yhteispaino() + this.kokoPaino;
        }

    }
    public void tulostaTavarat(){
        for (Matkalaukku f : laukkut){
            f.tulostaTavarat();
        
        }
    
    }

    public String toString() {
        return laukkut.size() + " matkalaukkua ("+ this.kokoPaino +" kg)";
    }
}
