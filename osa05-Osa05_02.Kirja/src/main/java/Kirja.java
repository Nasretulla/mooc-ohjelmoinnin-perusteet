
public class Kirja {

    private String kirjailija;
    private String kirja;
    private int sivuja;

    public Kirja(String kirjailija, String kirja, int sivuja) {
        this.kirjailija = kirjailija;
        this.kirja = kirja;
        this.sivuja = sivuja;

    }

    public String getKirjailija() {
        return this.kirjailija;
    }

    public String getNimi() {
        return this.kirja;
    }

    public int getSivuja() {
        return this.sivuja;
    }
    
    public String toString(){
    return this.kirjailija +", "+ this.kirja + ", "+ this.sivuja + " sivua";
    }
}
