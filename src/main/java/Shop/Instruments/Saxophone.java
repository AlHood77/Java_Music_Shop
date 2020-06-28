package Shop.Instruments;



public class Saxophone extends MusicInstrument {
    private String mouthPieceSize;

    public Saxophone(String name, String type, int buyingPrice, int sellingPrice, String mouthPieceSize ){
        super(name, type, buyingPrice, sellingPrice);
        this.mouthPieceSize = mouthPieceSize;
    }

    public String getMouthPieceSize() {
        return mouthPieceSize;
    }

    public String playsSound() {
        return "Saxophone Sounds";
    }
}
