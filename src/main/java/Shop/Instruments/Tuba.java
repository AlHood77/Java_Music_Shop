package Shop.Instruments;



public class Tuba extends MusicInstrument {
    private int size;

    public Tuba(String name, String type, int buyingPrice, int sellingPrice, int size ){
        super(name, type, buyingPrice, sellingPrice);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String playsSound() {
        return "Tuba Sounds";
    }
}
