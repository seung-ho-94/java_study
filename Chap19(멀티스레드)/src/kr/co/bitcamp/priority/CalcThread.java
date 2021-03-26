package kr.co.bitcamp.priority;

public class CalcThread extends Thread {
    
    long sum;
    
    //외부로부터 매개변수를 받아서 Thread명을 설정함
    public CalcThread(String name) {
        this.setName(name);
    }
    
    @Override
    public void run() {
        for(int i=0; i<200000000; i++) {
            sum += i;
        }
        System.out.println("[작업 완료 스레드] : " + this.getName());
        System.out.println("[합계] : "+ this.sum);
    }

}
