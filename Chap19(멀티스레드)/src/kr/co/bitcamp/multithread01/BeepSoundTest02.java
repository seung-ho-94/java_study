package kr.co.bitcamp.multithread01;

import java.awt.Toolkit;

public class BeepSoundTest02 {

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for (int i = 0; i < 5; i++) {
                    System.out.println("비프음을 실행하는 스레드 이름 : " + Thread.currentThread().getName());
                    toolkit.beep(); // 비프음 출력
                    try {
                        Thread.sleep(900); // 0.9s
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

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