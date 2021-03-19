package kr.co.bitcamp.method;

public class Method03 {
    public static void main(String[] args) {
        int result = returnMethod();
               // 3) 반환값--> O         받는 인자값--> X
        System.out.println("메서드 호출에 따른 리턴된 값: " + result);
        
    }
    
    public static int returnMethod() {
        int rValue = 100;
        rValue *= 100;
        
        return rValue;
    }
}
