package kr.co.bitcamp.operator;
/*
 * 수치연산자
 * 수치연산자를 연산에서 소수점 결과가 예상과 다른게 나오는 것에 대해서 설명해보시오
 */
public class ArithmeticOperators {
    public static void main(String[] args) {
        // 수치연산자 : +, -, *, /(몫), %(나머지 연산자)
        
        // 연산의 결과 : 정수끼리 
        int a=60; 
        int b=8;
        int result1;
        double result2, result3, result4;
        
        result1 = a/b;
        System.out.println(result1);
        System.out.println((float)result1);
        
        result2 = (double)a/b;
        System.out.println(result2);
        
        result3 = 100/(double)3;
        System.out.println(result3);
        
        result4 = 250/3.0;
        System.out.println(result4);
        System.out.printf("세 과목의 평균은 %.1f 입니다. %n", result4);
        
        
    }

}
