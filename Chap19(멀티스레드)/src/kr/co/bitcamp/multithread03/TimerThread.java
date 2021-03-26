package kr.co.bitcamp.multithread03;

public class TimerThread extends Thread {
    
    @Override
    public void run() {
        
        for(int i=10; i>0; i--) {
            System.out.println("남은시간 : " + i);
            
            
            try {
                Thread.sleep(1000);
            } catch(Exception e) {
                
                System.out.println(e.getMessage());
            }
        }
    }
}
