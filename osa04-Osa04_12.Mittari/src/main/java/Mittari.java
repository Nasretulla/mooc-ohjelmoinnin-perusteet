
public class Mittari {

    private int mitta;

    public Mittari() {

    }

    public void lisaa() {

        if (this.mitta < 5) {
            this.mitta++;

        }

    }

    public void vahenna() {
        if (this.mitta > 0) {
            this.mitta = this.mitta - 1;

        }
    }

    public int mitta() {
        return this.mitta;

    }

    public boolean taynna() {
        if (this.mitta < 5) {
            return false;

        }
        return true;
    }

}
