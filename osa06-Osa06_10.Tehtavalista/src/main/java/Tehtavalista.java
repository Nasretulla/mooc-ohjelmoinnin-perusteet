
import java.util.ArrayList;

public class Tehtavalista {

    private ArrayList<String> lista;

    public Tehtavalista() {
        this.lista = new ArrayList<>();

    }

    public void lisaa(String tehtava) {
        this.lista.add(tehtava);

    }

    public void tulosta() {

        for (int i = 0; i < this.lista.size(); i++) {
            int o;
            o = i + 1;
            System.out.println(o + ": " + this.lista.get(i));

        }

    }

    public void poista(int numero) {
        this.lista.remove(numero - 1);

    }

}
