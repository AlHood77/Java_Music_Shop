package Shop.MusicMiscItem;

public class MusicSheets extends MusicItem {
    private String songName;

    public MusicSheets(String description, int buyingPrice, int sellingPrice, String songName ){
        super(description, buyingPrice, sellingPrice);
        this.songName = songName;
    }

    public String getSongName() {
        return songName;
    }
}
