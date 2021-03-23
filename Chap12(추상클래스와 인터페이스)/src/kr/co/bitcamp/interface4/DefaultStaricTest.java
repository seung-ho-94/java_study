package kr.co.bitcamp.interface4;

public class DefaultStaricTest {

    public static void main(String[] args) {
        
        MyInterface myInterface = new DefaultStaticClass();
        myInterface.dMethod();
        
        //인터페이스의 정적메서드 호출하는 방법 동일함(인터페이스명, 정적 메소드명 호출)
        MyInterface.sMethod();
    }

}
