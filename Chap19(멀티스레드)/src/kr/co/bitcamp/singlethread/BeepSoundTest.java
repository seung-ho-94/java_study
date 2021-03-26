package kr.co.bitcamp.singlethread;

import java.awt.Toolkit;

public class BeepSoundTest {
        //싱글스레드를 멀티스레드로 바꿔서 프로그램을 멀티태스크하게 만드는것이 우리가 지향하는 부분
    
    public static void main(String[] args) {
        //현재실행중인 스레드명을 출력함
        System.out.println(Thread.currentThread().getName());
        
        //Toolkit은 추상클래스, GUI관련된 메서드들로 구성
        //getDefaultToolkit()을 통해서 Toolkit클래스의 참조를 얻어냄
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i =0; i<5; i++) {
            System.out.println("for문을 실행하는 스레드 이름 : " + Thread.currentThread().getName());
            toolkit.beep();         //비프음 출력
            
            try {
                Thread.sleep(900);              //스레드
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
    }
}
