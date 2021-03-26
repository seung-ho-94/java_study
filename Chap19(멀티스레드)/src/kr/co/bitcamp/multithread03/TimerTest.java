package kr.co.bitcamp.multithread03;

import javax.swing.JOptionPane;

public class TimerTest {

    public static void main(String[] args) throws Exception {
        
        System.out.println("10초 안에 말하세여");
        Thread thread = new TimerThread();
        thread.start();
        
        String input = JOptionPane.showInputDialog("10초 안에 값을 입력하시오");
        //System.out.println(input);
        
        if(input != null) {
            System.out.println("입력 값 : " + input);
            System.exit(0);
        }else {
            thread.sleep(10000);        //10초를 대기한다.
            System.out.println("입력하지 못했습니다 펑펑!!");
            System.exit(0);
        }
        
        
        
    }

}
