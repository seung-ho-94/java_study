package kr.co.bitcamp.stringbuilder;

import java.util.List;
import java.util.Vector;



public class AutoBoxingUnboxingTest {
    public static void main(String[] args) {
        Integer obj1 = 100;
        Integer obj2 = 300;
        
        List list = new Vector();
        list.add(obj1);
        list.add(obj2);
        list.add(500);      //list.add(new integer(50))
        System.out.println(list);
        
        //자동 언박싱
        int value1 = (Integer)list.get(0);
        System.out.println(value1);
        
        int value2 = obj2.intValue();       //정상코드
        int value3 = obj2;                  //자동 언박싱
        System.out.println(value2);
        System.out.println(value3);
        
        //객체 + 기본타입은 문법에러지만 포장클래스이기 때문에 컴파일러가 알아서
        //자동 언박싱해서 아래코드가 가능함
        int result = obj1 + 500;            //obj.intValue()가 정상
        System.out.println(result);
        
    }
}
