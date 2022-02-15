
import java.util.ArrayList;

public class PoistaViimeinen {

    public static void main(String[] args) {
        // kokeile toteuttamasi metodin toimintaa täällä
        ArrayList<String> merkijono = new ArrayList<String>();

        merkijono.add("eka");
        merkijono.add("toka");
        merkijono.add("kolmas");
        System.out.println(merkijono);

        poistaViimeinen(merkijono);
        poistaViimeinen(merkijono);

        System.out.println(merkijono);

    }

    public static void poistaViimeinen(ArrayList<String> mjonot) {

        if (mjonot.isEmpty()) {
            return;

        }
        mjonot.remove(mjonot.size()-1);
    }

}
