
public class Tuote {
    
   private double hinta;
  private  String nimi;
   private int lukumaara;
    
    public Tuote(String nimiAlussa, double hintaAlussa, int maaraAlussa){
        this.hinta = hintaAlussa;
        this.lukumaara = maaraAlussa;
        this.nimi = nimiAlussa;
        
    
    }
    
    public void tulostaTuote(){
        System.out.println(nimi+ " hinta " + hinta+ ", " + lukumaara);
    
    }
    
    
    
}
