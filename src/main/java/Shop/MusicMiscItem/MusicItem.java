package Shop.MusicMiscItem;

import Behaviours.ISell;

public abstract class MusicItem implements ISell {
    private String description;
    private int buyingPrice;
    private int sellingPrice;

    public MusicItem(String description, int buyingPrice, int sellingPrice){
        this.description = description;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getDescription() {
        return description;
    }

    public int getBuyingPrice() {
        return buyingPrice;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    public int calculateMarkUp(){
        return getSellingPrice() - getBuyingPrice();
    }
}
