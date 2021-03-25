package kr.co.bitcamp.string02;

import kr.co.bitcamp.string.CharAtTest;

public class ReversTest {
    public static void main(String[] args) {
        String str = "안녕하세요";
        String reverse = "";
        int count = 0;
        
        count = str.length();
        System.out.println("문자열 길이 : " + count);
        
        //for(int i =str1.length()-1; i>=0; i--) {
       //     System.out.print(str1.charAt(i));
        //}
        
        for(int i=0; i<count; i++) {
            reverse += str.charAt(count-(i+1));
            System.out.println(reverse);
            System.out.println(reverse.hashCode());
        }
        
        String rev = reverseString(str);
        System.out.println("reverseString() 호출 후 : " + rev);
    }
    
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    
}
