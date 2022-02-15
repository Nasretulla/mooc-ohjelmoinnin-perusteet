
import java.util.ArrayList;

public class Huone {

    private ArrayList<Henkilo> henkilot;

    public Huone() {
        this.henkilot = new ArrayList<>();
    }

    public void lisaa(Henkilo henkilo) {
        this.henkilot.add(henkilo);

    }

    public boolean onTyhja() {

        return this.henkilot.isEmpty();
    }

    public ArrayList<Henkilo> getHenkilot() {
        return this.henkilot;

    }

    public Henkilo lyhin() {
        if (this.henkilot.isEmpty()) {
            return null;

        }
        Henkilo lyhyt = this.henkilot.get(0);

        for (Henkilo f : this.henkilot) {

            if (lyhyt.getPituus() > f.getPituus()) {
                lyhyt = f;

            }

        }
        return lyhyt;
    }

    public Henkilo ota() {
        if (this.henkilot.isEmpty()) {
            return null;

        }
        Henkilo lyhyt = this.henkilot.get(0);

        for (Henkilo f : this.henkilot) {

            if (lyhyt.getPituus() > f.getPituus()) {
                lyhyt = f;
                

            }

        }

        
         henkilot.remove(this.lyhin());
            return lyhyt;
    }
    

}
