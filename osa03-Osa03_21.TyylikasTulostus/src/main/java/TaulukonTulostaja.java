
public class TaulukonTulostaja {

    public static void main(String[] args) {
        // Tässä voit testata metodia
        int[] taulukko = {5, 1, 3, 4, 2};
        tulostaTyylikkaasti(taulukko);
    }

    public static void tulostaTyylikkaasti(int[] taulukko) {
        // Kirjoita koodia tänne
     int index= 0;
     String pilkku = "";
        for (int i : taulukko){
            System.out.print(pilkku + i);
            pilkku = ",";
        
        }

    }
}
