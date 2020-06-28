package Shop.Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TubaTest {

    Tuba tuba;

    @Before
    public void setUp(){
        tuba = new Tuba("Saxhorn", "Brass", 500, 600, 3);
    }

    @Test
    public void hasName(){
        assertEquals("Saxhorn", tuba.getName());
    }

    @Test
    public void hasType(){
        assertEquals("Brass", tuba.getType());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(500, tuba.getBuyingPrice());
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(600, tuba.getSellingPrice());
    }

    @Test
    public void hasSize(){
        assertEquals(3, tuba.getSize());
    }

    @Test
    public void canPlaySounds(){
        assertEquals("Tuba Sounds", tuba.playsSound());
    }

    @Test
    public void canGetMarkUp(){
        assertEquals(100, tuba.calculateMarkUp());
    }
}
