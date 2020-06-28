package Shop;


import Shop.Instruments.Guitar;
import Shop.MusicMiscItem.MusicSheets;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    MusicSheets musicSheets;

    @Before
    public void setUp(){
        shop = new Shop("Music Shop");
        guitar = new Guitar("Lucy", "String", 200, 250, "Acoustic", 5 );
        musicSheets = new MusicSheets("Lorem ipsum", 25, 30, "song name");
    }

    @Test
    public void shopHasName(){
        assertEquals("Music Shop", shop.getName());
    }

    @Test
    public void shopStockStartsEmpty(){
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void canAddToStock(){
        shop.addToStock(guitar);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void canRemoveFromStock(){
        shop.addToStock(guitar);
        shop.addToStock(musicSheets);
        shop.removeFromStock(guitar);
        assertEquals(1, shop.getStock().size());
    }
}
