package kr.co.bitcamp.equals;

public class ObjectEqualsTest {

    public static void main(String[] args) {
        
        Object object1 = new Object();
        Object object2 = new Object();
        
        boolean result1 = object1.equals(object2);
        boolean result2 = (object1 == object2);
        System.out.println("equals() : " + result1);        //둘다 주소값을 비교하기 때문에 false가 나옴
        System.out.println("==연산자 : " + result2);

        
        System.out.println(object1);
        System.out.println(object2);
        
    }

}
