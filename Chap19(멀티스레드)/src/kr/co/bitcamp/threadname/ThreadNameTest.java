package kr.co.bitcamp.threadname;

public class ThreadNameTest {
    public static void main(String[] args) {
        
        /*스레드 이름을 얻는 방법 
         * 1) 정적 메서드 이용
         * Thread.currentThread().getName()
         * 
         * 2)인스턴스 메서드 이용
         * this.getName()
        */
        
        Thread thread = Thread.currentThread();
        System.out.println("[프로그램 시작 메서드명] : " + thread.getName());
        
        Thread threadBitCamp = new ThreadBitCamp();
        threadBitCamp.start();
        System.out.println("[ThreadBitCamp를 생성한 스레드 이름] : " + Thread.currentThread().getName());
        System.out.println("[main스레드가 ThreadBitCamp의 이름을 가져온 것] : " + threadBitCamp.getName());
        System.out.println();
        
        Thread threadBit = new ThreadBit();
        threadBit.start();
        System.out.println("[ThreadBit를 생성한 스레드 이름] : " + Thread.currentThread().getName());
        System.out.println("[main스레드가 ThreadBit의 이름을 가져온 것] : " + threadBit.getName());
        System.out.println();

        /*
         * 위의 코드들은 메인스레드가 2개의 스레드를 생성해서 start()시켜주는 것임
         * 비로서 threadBirCamp와 threadBit가 독립적으로 실행이 이루어짐
         */
    }
}
