
public class Paivays {
    private int paiva;
    private int kuukausi;
    private int vuosi;

    public Paivays(int paiva, int kuukausi, int vuosi) {
        this.paiva = paiva;
        this.kuukausi = kuukausi;
        this.vuosi = vuosi;
    }

    public String toString() {
        return this.paiva + "." + this.kuukausi + "." + this.vuosi;
    }

    public boolean aiemmin(Paivays verrattava) {
        // ensin verrataan vuosia
        if (this.vuosi < verrattava.vuosi) {
            return true;
        }

        // jos vuodet ovat samat, verrataan kuukausia
        if (this.vuosi == verrattava.vuosi && this.kuukausi < verrattava.kuukausi) {
            return true;
        }

        // vuodet ja kuukaudet samoja, verrataan päivää
        if (this.vuosi == verrattava.vuosi && this.kuukausi == verrattava.kuukausi &&
            this.paiva < verrattava.paiva) {
            return true;
        }

        return false;
    }
    
    public void etene(){
        this.paiva++;
        if(this.paiva ==31){
            this.paiva =1;
            this.kuukausi++;
            if(this.kuukausi ==13){
            this.vuosi ++;
            this.kuukausi =1;
            }
        }
    }
        public void etene(int montakoPaivaa){
        int i = 0;
        while(i < montakoPaivaa){
            etene();
            i++;
                
        }
        }
    
      public  Paivays paivienPaasta(int paivia){
          Paivays uusiPaivays = new Paivays( this.paiva,this.kuukausi,this.vuosi);
          uusiPaivays.etene(paivia);
          
          return uusiPaivays;
      
      }
    }
