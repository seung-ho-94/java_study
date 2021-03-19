package kr.co.bitcamp.method;

import java.util.Arrays;

/*
 * 2개의 정수형 값을 리턴하는 메서드를 구현하시오
 * 
 */
public class TwoReturn01 {
    public static void main(String[] args) {
        
        int[] result = testMethod();    //배열변수 선언
        
        System.out.println("result[0] : " + result[0]);
        System.out.println("result[1] : " + result[1]);
        System.out.println(result[1] + result[1]);
        
        System.out.println(Arrays.toString(result));       // 반복문 사용 없이 배열의 모든요소 출력
    }
    
    
    public static int[] testMethod() {
        int num1 = 100;
        int num2 = 200;
        int num3 = 300;
        
        return new int[] {num1, num2, num3};
        
        
    }
}
