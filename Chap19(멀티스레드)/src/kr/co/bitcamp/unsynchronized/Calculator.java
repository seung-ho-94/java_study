package kr.co.bitcamp.unsynchronized;

//공유객체
public class Calculator {

    private int memory;
    
    public int getMemory() {
        return this.memory;
    }
    
    //비동기화 메서드 - > 동기화 메서드 : 데이터 신뢰성을 보장하기 위해서는 반드시 동기화 처리가 필수다.
    public synchronized void setMemory(int memory) {
        
        this.memory = memory;
        
        try {
            Thread.sleep(1000);
        }catch(InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(Thread.currentThread().getName() + " : " + this.getMemory());

    }
    
}








































