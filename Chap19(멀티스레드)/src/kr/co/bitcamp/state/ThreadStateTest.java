package kr.co.bitcamp.state;

public class ThreadStateTest {
    public static void main(String[] args) {
        
        //스레드의 라이프사이클을 알아본는 내용
        Thread thread = new StatePrintThread(new TargetThread());
        thread.start();
        
        
    }
}
