package kr.co.bitcamp.callstack;

public class CallstackTest {
    /*
     * 콜스택(Stack, LIFO)은 후입선출,(복사기 4포용지)
     * <---> 큐(Queue, FIFO)는 선입선출,(수도호스, 파이프)
     */
    
    
    public static void main(String[] args) {
        System.out.println("main() 실행됨");
        CallstackTest.first();
        System.out.println("main() 종료됨");
    }
    
    public static void first() {
        System.out.println("first() 실행됨");
        second();
        System.out.println("first() 종료됨");
    }
    public static void second() {
        System.out.println("second() 실행됨");
        CallstackTest.third();
        System.out.println("second() 종료됨");
    }
    public static void third() {
        System.out.println("third() 실행됨");
        System.out.println("third() 종료됨");
    }
}
