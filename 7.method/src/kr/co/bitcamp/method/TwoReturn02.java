package kr.co.bitcamp.method;

import java.util.Arrays;

/*
 * 반환값이 2개 있는 메서드를 구현
 * 메서드는 {"software", "HARDWARE"} 입력시 소문자->대문자, 대문자-> 소문자로 출력
 */
public class TwoReturn02 {
    public static void main(String[] args) {
        String[] result = testMethod();
        
        System.out.println(Arrays.toString(result));
        
        
        
    }
    
    public static String[] testMethod() {
        String str1 = "software";
        String str2 = "HARDWARE";
        
        return new String[] {str1.toUpperCase(), str2.toLowerCase()};
    }
}
