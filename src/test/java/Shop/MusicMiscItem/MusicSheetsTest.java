package Shop.MusicMiscItem;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicSheetsTest {
    MusicSheets musicSheets;

    @Before
    public void setUp(){
        musicSheets = new MusicSheets("Lorem ipsum", 12, 15, "Into the Unknown");
    }

    @Test
    public void hasDescription(){
        assertEquals("Lorem ipsum", musicSheets.getDescription());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(12, musicSheets.getBuyingPrice());
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(15, musicSheets.getSellingPrice());
    }

    @Test
    public void hasSongName(){
        assertEquals("Into the Unknown", musicSheets.getSongName());
    }
}
