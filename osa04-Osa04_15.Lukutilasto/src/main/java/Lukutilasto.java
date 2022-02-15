
public class Lukutilasto {

    private int lukujenMaara;
    private int summa;
    
    
    

    public Lukutilasto() {
        // alusta tässä muuttuja lukujenMaara
        this.lukujenMaara = this.lukujenMaara;
        this.summa = 0;
        
        
    }

    public void lisaaLuku(int luku) {
        this.lukujenMaara++;
        this.summa += luku;
       
    }

    public int haeLukujenMaara() {
        // kirjoita koodia tähän

        return this.lukujenMaara;
    }

    public int summa() {
        // kirjoita koodia tähän
        
        return this.summa;
    }

    public double keskiarvo() {
        // kirjoita koodia tähän
       
        if(summa == 0) {
            return 0;
        } 
        return (double) this.summa / this.haeLukujenMaara();
    }

}
