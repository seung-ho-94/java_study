package kr.co.bitcamp.multithread01;

import java.awt.Toolkit;

public class BeepSoundTest03 {
    //main()은 JVM이 실행함
    public static void main(String[] args) {
        
        //직접 스레드를 생성하는 방법 3가지
        //방법3 --> 람다식(함수적 인터페이스) : JDK1.8, 코드절약, 가독성
        Thread thread = new Thread(()-> {
           Toolkit toolkit = Toolkit.getDefaultToolkit();
           
           for (int i = 0; i < 5; i++) {
               System.out.println("비프음을 실행하는 스레드 이름 : " + Thread.currentThread().getName());
               
               toolkit.beep(); // 비프음 출력
               
               try {
                   Thread.sleep(1000); // 0.9s
               } catch (InterruptedException e) {
                   System.out.println(e.getMessage());
               }
           }
           
        });
        thread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("비프음 실행하는 스레드 명 : " + Thread.currentThread().getName());
            System.out.println("삐~~");

            try {
                Thread.sleep(1100);

            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    
        
    }
}
