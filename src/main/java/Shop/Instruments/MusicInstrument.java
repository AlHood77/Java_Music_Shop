package Shop.Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;


public abstract class MusicInstrument implements IPlay, ISell {
    private String name;
    private String type;
    private int buyingPrice;
    private int sellingPrice;

    public MusicInstrument(String name, String type, int buyingPrice, int sellingPrice){
        this.name = name;
        this.type = type;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
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
