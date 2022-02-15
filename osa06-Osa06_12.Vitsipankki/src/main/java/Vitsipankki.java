
import java.util.ArrayList;
import java.util.Random;

public class Vitsipankki {

    private ArrayList<String> vitsit;

    public Vitsipankki() {
        this.vitsit = new ArrayList<>();

    }

    public void lisaaVitsi(String vitsi) {
        vitsit.add(vitsi);

    }

    public String arvoVitsi() {
        System.out.println("Arvotaan vitsi.");
        if (vitsit.isEmpty()) {
            return "Vitsit vähissä.";
        }
        Random arpa = new Random();
        int indeksi = arpa.nextInt(vitsit.size());
        String arvottuVitsi = vitsit.get(indeksi);
        return arvottuVitsi;

    }

    public void tulostaVitsit() {
        System.out.println("Tulostetaan vitsit.");
        for (String vitsi : vitsit) {
            System.out.println(vitsi);
        }
    }
}
