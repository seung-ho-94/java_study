package kr.co.bitcamp.threadname;

public class ThreadBitCamp extends Thread{
        
    public ThreadBitCamp() {
        this.setName("Bitcamp");
    }
    
    @Override
    public void run() {
        System.out.println("[현재 실행중인 스레드] : "+this.getName());
        for(int i=0; i<5; i++) {
            System.out.println(this.getName() + "가 출력한 내용"+i);
        }
        
        
    }
    
    
}
