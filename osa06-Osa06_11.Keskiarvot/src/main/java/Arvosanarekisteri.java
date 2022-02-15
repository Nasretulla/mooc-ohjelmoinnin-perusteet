
import java.util.ArrayList;

public class Arvosanarekisteri {

    private ArrayList<Integer> arvosanat;
    private ArrayList<Integer> lista;

    public Arvosanarekisteri() {
        this.arvosanat = new ArrayList<>();
        this.lista = new ArrayList<>();
    }

    public void lisaaArvosanaPisteidenPerusteella(int pisteet) {
        this.arvosanat.add(pisteetArvosanaksi(pisteet));
        this.lista.add(pisteet);
    }

    public int montakoSaanutArvosanan(int arvosana) {
        int lkm = 0;
        for (int saatu : this.arvosanat) {
            if (saatu == arvosana) {
                lkm++;
            }
        }

        return lkm;
    }

    public static int pisteetArvosanaksi(int pisteet) {

        int arvosana = 0;
        if (pisteet < 50) {
            arvosana = 0;
        } else if (pisteet < 60) {
            arvosana = 1;
        } else if (pisteet < 70) {
            arvosana = 2;
        } else if (pisteet < 80) {
            arvosana = 3;
        } else if (pisteet < 90) {
            arvosana = 4;
        } else {
            arvosana = 5;
        }
        
        return arvosana;
    }

    public double arvosanojenKeskiarvo() {
        int summa = 0;
        int luvut = 0;
        while (luvut < arvosanat.size()) {
            summa += arvosanat.get(luvut);
            luvut++;

        }
        if (arvosanat.isEmpty()) {
            return -1;

        }

        return summa / (double) arvosanat.size();

    }

    public double koepisteidenKeskiarvo() {
        int summa = 0;
        int luvut = 0;
        while (luvut < lista.size()) {
            summa += lista.get(luvut);
            luvut++;

        }
        if (lista.isEmpty()) {
            return -1;

        }
        return summa / (double) lista.size();

    }

}
