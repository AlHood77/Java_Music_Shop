package Shop.Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void setUp(){
        saxophone = new Saxophone("Tenor", "Wind", 350, 400, "Medium");
    }

    @Test
    public void hasName(){
        assertEquals("Tenor", saxophone.getName());
    }

    @Test
    public void hasType(){
        assertEquals("Wind", saxophone.getType());
    }

    @Test
    public void hasbuyingPrice(){
        assertEquals(350, saxophone.getBuyingPrice());
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(400, saxophone.getSellingPrice());
    }

    @Test
    public void hasMouthPieceSize(){
        assertEquals("Medium", saxophone.getMouthPieceSize());
    }

    @Test
    public void canPlaySounds() {
        assertEquals("Saxophone Sounds", saxophone.playsSound());
    }



}
