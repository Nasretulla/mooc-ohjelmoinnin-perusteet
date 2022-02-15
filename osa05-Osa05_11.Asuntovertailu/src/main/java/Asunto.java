
public class Asunto {

    private int huoneita;
    private int nelioita;
    private int neliohinta;

    public Asunto(int huoneita, int nelioita, int neliohinta) {
        this.huoneita = huoneita;
        this.nelioita = nelioita;
        this.neliohinta = neliohinta;
    }
    //joka palauttaa true jos asunto-olio, jolle metodia kutsutaan, 
    //on pinta-alaltaan suurempi kuin verrattavana oleva asunto-olio.
    public boolean suurempi(Asunto verrattava){
        if(this.nelioita > verrattava.nelioita){
        return true;
        }
        return false;
    }
    
    public int hintaero(Asunto verrattava){
        //joka palauttaa asunto-olion jolle metodia kutsuttiin ja parametrina olevan asunto-olion hintaeron. 
        //Hintaero on asuntojen hintojen erotuksen (hinta lasketaan 
        //kertomalla neliöhinta neliöillä) itseisarvo.
        
        int hinnat = this.nelioita * this.neliohinta;
        int verrattaHinta = verrattava.nelioita * verrattava.neliohinta;
        
        if(hinnat > verrattaHinta){
           return hinnat - verrattaHinta;
        
        }
         
            return verrattaHinta - hinnat;
        
    }
    public boolean kalliimpi(Asunto verrattava){
        if(this.nelioita * this.neliohinta > verrattava.nelioita * verrattava.neliohinta){
        return true;
        }
        return false;
    }

}
