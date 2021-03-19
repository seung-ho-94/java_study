package kr.co.bitcamp.method;
//메서드는 "welcome to bitcamp 입력시 대문자로 출력되도록 구현
//입력한 소문자의 대문자 : WELCOME TO BITCAMP
//toUpperCase()
public class Method04 {
    public static void main(String[] args) {
        //4) 반환값--> O         받는 인자값--> O
        
        // stBit 메서드 호출
        String result="";
        System.out.println(stBit(result).toUpperCase());
        
        //capitalMethod 메서드 호출
        String result1;
        result1 = capitalMethod("welcome to bitcamp"); 
        System.out.println(result1);
       
    }
    public static String capitalMethod(String str) {
        String rValue = str.toUpperCase();
        return rValue;
    }
    public static String stBit(String i) {
        String str = "welcome to bitcamp";
        return str;
    }
    
}
