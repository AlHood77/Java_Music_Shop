package Shop.Instruments;

import Behaviours.IPlay;

public class Guitar extends MusicInstrument implements IPlay {
    private String guitarType;
    private int numberOfStrings;

    public Guitar(String name, String type, int buyingPrice, int sellingPrice, String guitarType, int numberOfStrings ){
        super(name, type, buyingPrice, sellingPrice);
        this.guitarType = guitarType;
        this.numberOfStrings = numberOfStrings;
    }

    public String getGuitarType() {
        return guitarType;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String playsSound() {
        return "Guitar Sounds";
    }
}
