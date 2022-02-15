
public class Kirja {

    private String nimeke;
    private int sivuja;
    private int julkaisuvuosi;

    public Kirja(String nimeke, int sivuja, int julkaisuvuosi) {
        this.nimeke = nimeke;
        this.sivuja = sivuja;
        this.julkaisuvuosi = julkaisuvuosi;

    }

    public String nimeke() {
        return this.nimeke;
    }

    public int sivuja() {
        return this.sivuja;
    }
    
    public int julkaisuvuosi(){
        return this.julkaisuvuosi;
    }
    
    public String toString(){
    return "" + nimeke + ", " + sivuja +  " sivua" +  ", " +julkaisuvuosi;
    }
}
