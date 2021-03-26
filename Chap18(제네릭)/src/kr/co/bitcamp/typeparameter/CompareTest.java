package kr.co.bitcamp.typeparameter;

public class CompareTest {
    public static void main(String[] args) {
        int result = Compare.compare(300, 200);
        System.out.println(result);
        
        //String 클래스는 Number클래스와 아무런 관계가 없
        //int result2 = Compare.compare("이순신");
        
        //Number클래스는 Object클래스의 자손이기 때문에 매개변수 타입으로 적합하지 않
        //Compare.compare(new Object(), new Object());
        
        result = Compare.compare(new Integer(100), new Double(75.11));
        System.out.println(result);
        
        //Number는 
        //Compare.compare(new Number(), new Number());
        
    }
    
}
