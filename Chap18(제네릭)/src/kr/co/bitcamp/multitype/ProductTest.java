package kr.co.bitcamp.multitype;

import java.util.Set;

public class ProductTest {
    public static void main(String[] args) {
        //멀티 타입 파라ㅣㅁ터
        Product<Tv, String> p1 = new Product<>();
        p1.setT(new Tv(2021, 3));
        p1.setM("LG OLED AI TV");
        
        System.out.println("나의 TV는 "+ p1.getT().getYear()+"년 " +
                            p1.getT().getMonth() +"월 식이며 "+ 
                            p1.getM() + "이다.");
        
        
        System.out.println("\n================================================\n");
        
        Product<Car, String> p2 = new Product<>();
        p2.setT(new Car("현대", 2022, 1));
        //p2.setT(new Car(2022, 1));
        p2.setM("팰리세이드 캘리그래피");
        
        System.out.println("나의 Car는 " + p2.getT().getBrand() +"회사의 " + p2.getT().getYear()+"년 " +
                p2.getT().getMonth() +"월 식이며 "+ 
                p2.getM() + "이다.");
        
        
        
        
    }
}
