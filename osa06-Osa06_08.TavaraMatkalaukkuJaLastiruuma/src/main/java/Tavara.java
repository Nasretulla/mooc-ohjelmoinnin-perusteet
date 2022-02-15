
public class Tavara {

    private String nimi;
    private int paino;

    public Tavara(String tavaranNimi, int tavaranPaino) {
        this.nimi = tavaranNimi;
        this.paino = tavaranPaino;

    }

    public String getNimi() {
        return this.nimi;

    }

    public int getPaino() {
        return this.paino;
    }

    public String toString() {
        return this.nimi + "(" + this.paino + "kg)";

    }
}
