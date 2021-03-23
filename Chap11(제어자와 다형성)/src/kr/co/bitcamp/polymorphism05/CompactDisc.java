package kr.co.bitcamp.polymorphism05;

public class CompactDisc extends Product{
    
    private String album;
    private String artist;
    
    public CompactDisc(int productID, String description, String maker, int price, String album, String artist) {
        super(productID, description, maker, price);
        this.album = album;
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }
    public String getArtist() {
        return artist;
    }
    
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("앨범제목 >> " + this.getAlbum());
        System.out.println("가수 >> " + this.getArtist());
    }
    

}
