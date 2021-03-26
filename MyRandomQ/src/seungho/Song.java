package seungho;

public class Song {
    String title;
    String artist;
    int year;
    String country;
    
    //기본생성자
    public Song() {
        
    }

    //매개변수가 있는 생성자
    public Song(String title, String artist, int year, String country) {
//        super();
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.country = country;
    }
    
    public String show() {
        return this.year+"년 "+
                this.country+"국적의 "+
                this.artist+"가 부른 "+
                this.title;
    }

    public static void main(String[] args) {
        Song song = new Song("Dancing Qieen", "ABBA", 1978, "스웨덴");
        System.out.println(song.show());
        
    }
  
}


