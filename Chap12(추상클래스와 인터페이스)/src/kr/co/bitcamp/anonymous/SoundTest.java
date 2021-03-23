package kr.co.bitcamp.anonymous;

public class SoundTest {

    public static void main(String[] args) {
        //익명구현객체(이름없음) -- UI이벤트 처리나 스레드 객체 간편하게 생성시 사용 / 잠깐사용할 목적
        Soundable soundable = new Soundable() {         //원래타입이 인터페이스
                                                        //익명구현객체 안에있는 생성자를 호출
            
            //내부적으로 클래스니까 멤버들을 선언할 수 있음 
            //
            @Override
            public void sound() {
                String str = "냄비";
                System.out.println("첫번재 익명구현객체 : + str");
                System.out.println(str+"에 물을 담습니다.");
                System.out.println(str+"에 숟가락을 넣는다");
                
           
            }

         
        };
        soundable.sound();
        
    }

}
