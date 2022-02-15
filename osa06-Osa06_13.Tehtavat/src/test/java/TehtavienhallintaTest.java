
import org.junit.Test;
import static org.junit.Assert.assertEquals;




public class TehtavienhallintaTest {
    
    @Test
    public void tehtavalistaAlussaTyhja(){
        Tehtavienhallinta hallinta = new Tehtavienhallinta();
        assertEquals(0,hallinta.tehtavalista().size());
    }
    
    @Test
    public void tehtavanLisaaminenKasvattaaListanKokoaYhdella(){
        Tehtavienhallinta hallinta = new Tehtavienhallinta();
        hallinta.lisaa("Kirjoita testi");
        assertEquals(1,hallinta.tehtavalista().size());
    
    }

}
