package kr.co.bitcamp.method;
/*
 * 메서드로 인자 전달시 정수 100을 보냈을 때 코드의 결과를 알아보시오 (call by value)
 */
public class MethodCall01 {
    public static void main(String[] args) {
        int a = 100;
        sum(a);
        System.out.println("main()의 a : " + a);
    }
    
    public static void sum(int a) {   //call by value -> 값에 의한 호출
                                      //메서드 인자값을 넘길 때 복사하여 넘기는 방식
                                      //-> 따라서 sum() 메서드 내부에서는복사된 값으로 처리를 한다.
                   
        a += 400;                     // 500
        System.out.println("sum()의 a : " + a);
        
    }
}
