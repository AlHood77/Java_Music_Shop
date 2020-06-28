package Shop.Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp() {
        guitar = new Guitar("Lucy", "String", 250, 300, "Electric", 6 );
    }

    @Test
    public void hasName(){
        assertEquals("Lucy", guitar.getName());
    }

    @Test
    public void hasType() {
        assertEquals("String", guitar.getType());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(250, guitar.getBuyingPrice());
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(300, guitar.getSellingPrice());
    }

    @Test
    public void hasGuitarType() {
        assertEquals("Electric", guitar.getGuitarType());
    }

    @Test
    public void hasNumberOfStrings() {
        assertEquals(6, guitar.getNumberOfStrings());
    }
}
