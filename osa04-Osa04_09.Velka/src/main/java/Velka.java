
public class Velka {
    private double saldo;
    private double korkokerroin;
    
    public Velka(double saldoAlussa, double korkokerroinAlussa){
        
        this.saldo = saldoAlussa;
        this.korkokerroin = korkokerroinAlussa;
        
    
    }
    
    public void tulostaSaldo(){
        System.out.println(saldo );
        
    
    }
    
    public void odotaVuosi(){
        this.saldo = saldo * korkokerroin;
    
    }
    
}
