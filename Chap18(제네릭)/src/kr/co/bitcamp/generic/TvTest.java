package kr.co.bitcamp.generic;

public class TvTest {
   public static void main(String[] args) {
       Tv<String> tv = new Tv<>();
       tv.setE("LG OLED TV");
       String tvName = tv.getE();
       System.out.println("나의 TV는 " + tvName + "입니다.");
}
    
}
