package Shop.Instruments;

import Behaviours.IPlay;

public class Saxophone extends MusicInstrument implements IPlay {
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
