package kr.co.bitcamp.staticvariable;

public class Card {
    //인스턴스 변수 -- 반드시 인스턴스를 생성해야 접근가능
    private String color;    //카드색상
    private String company;  //카드회사
    
    //static 변수(클래스 변수) -- 인스턴스 생성없이도 클래스명.static변수명으로 접근 가능
    static int width = 100;
    static int height = 50;
    
    //getter(), setter() --인스턴스 메서드 
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    //정적변수(static)는 접근방법이 반그시 클래스명.static변수명으로 접근해야 올바른 방법이다.
    
    public String toString() {
        return "카드의 색상 : " + this.getColor() +
                ", 카드의 회사 : " + this.getCompany() +
                ", 크기 : (" + Card.height +
                ", " + Card.width + ")";
    }
    
    
}






















