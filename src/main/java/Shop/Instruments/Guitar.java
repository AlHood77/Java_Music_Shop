package Shop.Instruments;

public class Guitar extends MusicInstrument {
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
}
