
import java.util.Arrays;

public class Paaohjelma {

    public static void main(String[] args) {
        // tee testikoodia tänne
        int[] taulukko = {6, 5, 8, 7, 11};
        System.out.println("Pienin: " + Paaohjelma.pienin(taulukko));
        System.out.println("Pienin indeksi : " + Paaohjelma.pienimmanIndeksi(taulukko));

        // indeksit:    0  1  2  3   4
        //int[] luvut = {-1, 6, 9, 8, 12};
        // System.out.println(Paaohjelma.pienimmanIndeksiAlkaen(luvut, 0));
        // System.out.println(Paaohjelma.pienimmanIndeksiAlkaen(luvut, 1));
        // System.out.println(Paaohjelma.pienimmanIndeksiAlkaen(luvut, 2));
       // int[] luvut = {3, 2, 5, 4, 8};

       // System.out.println(Arrays.toString(luvut));

      //  Paaohjelma.vaihda(luvut, 1, 0);
       // System.out.println(Arrays.toString(luvut));

       // Paaohjelma.vaihda(luvut, 0, 3);
      //  System.out.println(Arrays.toString(luvut));
        int[] luvut = {8, 3, 7, 9, 1, 2, 4};
            Paaohjelma.jarjesta(luvut);
    }

    public static int pienimmanIndeksi(int[] taulukko) {
        int index = 0;
        int mini = taulukko[0];
        for (int i = 0; i < taulukko.length; i++) {
            if (mini > taulukko[i]) {
                mini = taulukko[i];
                index = i;
            }
        }
        return index;
    }

    public static int pienin(int[] taulukko) {
        // kirjoita koodia tähän
        int mini = taulukko[0];
        for (int i = 0; i < taulukko.length; i++) {
            if (mini > taulukko[i]) {
                mini = taulukko[i];
            }
        }
        return mini;
    }

    public static int pienimmanIndeksiAlkaen(int[] taulukko, int aloitusIndeksi) {
        int pieninLuku = taulukko[aloitusIndeksi];
        int pieninIndeksi = aloitusIndeksi;
        for (int i = aloitusIndeksi; i < taulukko.length; i++) {
            if (pieninLuku > taulukko[i]) {
                pieninLuku = taulukko[i];
                pieninIndeksi = i;

            }

        }
        return pieninIndeksi;
    }

    public static void vaihda(int[] taulukko, int indeksi1, int indeksi2) {
        int luku1 = taulukko[indeksi1];
        int luku2 = taulukko[indeksi2];

        taulukko[indeksi1] = luku2;
        taulukko[indeksi2] = luku1;
    }

    public static void jarjesta(int[] taulukko) {

        for (int i = 0; i < taulukko.length; i++) {
            tulostaTaulukko(taulukko);
            int pieninIndeksi = pienimmanIndeksiAlkaen(taulukko, i);
            vaihda(taulukko, i, pieninIndeksi);
            tulostaTaulukko(taulukko);
        }

    }

    public static void tulostaTaulukko(int[] taulukko) {
        System.out.print("[");
        for (int i = 0; i < taulukko.length; i++) {
            if (i == taulukko.length - 1) {
                System.out.print(taulukko[i]);
            } else {
                System.out.print(taulukko[i] + ", ");
            }
        }
        System.out.print("]\n");
    }

}

