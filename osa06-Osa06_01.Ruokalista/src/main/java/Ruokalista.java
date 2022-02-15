
import java.util.ArrayList;

public class Ruokalista {

    private ArrayList<String> ateriat;

    public Ruokalista() {
        this.ateriat = new ArrayList<>();
    }

    // toteuta tänne tarvittavat metodit
    
    public void lisaaAteria(String ateria){
        if(this.ateriat.contains(ateria) == false){
            this.ateriat.add(ateria);
        
        }
    
    }
    public void tulostaAteriat(){
        for(String f : this.ateriat){
        System.out.println(f);
    
        }
    }
    public void tyhjennaRuokalista(){
        
        ateriat.removeAll(ateriat);
    
    
    }
}
