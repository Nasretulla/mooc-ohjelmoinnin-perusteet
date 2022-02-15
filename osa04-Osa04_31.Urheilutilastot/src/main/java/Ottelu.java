public class Ottelu {
 
    private String kotijoukkue;
    private String vierasjoukkue;
    private int pisteetKoti;
    private int pisteetVieras;
 
    public Ottelu(String kotijoukkue, String vastustaja, int pisteetKoti, int pisteetVastustaja) {
        this.kotijoukkue = kotijoukkue;
        this.vierasjoukkue = vastustaja;
        this.pisteetKoti = pisteetKoti;
        this.pisteetVieras = pisteetVastustaja;
    }
 
    public String getKotijoukkue() {
        return kotijoukkue;
    }
 
    public String getVastustaja() {
        return vierasjoukkue;
    }
 
    public boolean voittajaOn(String joukkue) {
        if (joukkue.equals(kotijoukkue) && pisteetKoti > pisteetVieras) {
            return true;
        }
 
        if (joukkue.equals(vierasjoukkue) && pisteetVieras > pisteetKoti) {
            return true;
        }
 
        return false;
    }
}
