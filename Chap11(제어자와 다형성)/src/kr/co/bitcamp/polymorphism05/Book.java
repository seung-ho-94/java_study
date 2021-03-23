package kr.co.bitcamp.polymorphism05;

public class Book extends Product{
    
    private int ISBN;
    private String title;
    private String author;
    
    public Book(int productID, String description, String maker, int price, int iSBN, String title, String author) {
        super(productID, description, maker, price);
        ISBN = iSBN;
        this.title = title;
        this.author = author;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    
    @Override
    public void showInfo() {
        super.showInfo();               //조상클래스의 메서드를 명시적으로 호출
        System.out.println("국제표준도서번호 >> " + this.getISBN());
        System.out.println("도서제목 >> " +this.getTitle());
        System.out.println("저자 >> " + this.getAuthor());
    }
    
    
    
    
    
    
    
    
    
    
}























