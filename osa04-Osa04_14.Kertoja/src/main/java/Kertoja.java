
public class Kertoja {

    private int luku;

    public Kertoja(int luku) {
        this.luku = luku;

    }

    public int kerro(int luku) {
        int luvut = luku * this.luku;
        return luvut;
    }

}
