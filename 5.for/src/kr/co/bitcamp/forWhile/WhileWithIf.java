package kr.co.bitcamp.forWhile;
/*
 * 홀수 짝수 구하기
 * 1~30까지 수에서 짝수만 출력
 */
public class WhileWithIf {
    public static void main(String[] args) {
        int number = 1;
        
        while(number <= 30) {
            if(number % 2 ==0) {
                System.out.print(number + " ");
            } 
            number++;
        }
    }
}
