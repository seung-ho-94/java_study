package kr.co.bitcamp.staticvariable;

public class CardTest {
    public static void main(String[] args) {
        Card card = new Card();
        card.setColor("노랑");
        card.setCompany("국민은행");
        System.out.println(card);
        
        //card.width = 90;
        //card.height 150;
        
        //static변수는 반드시 클래스명.static변수명을 접근하여 함
        
        Card.width = 80;
        Card.height = 150;
        
        Card card2 = new Card();
        card2.setColor("보라");
        card2.setCompany("농협은행");
        System.out.println(card2);
        
    }
}
