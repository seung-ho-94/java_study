package kr.co.bitcamp.forWhile;
/*
 * 자바의 반복문 종류 -> 크게 봤을 때 4가지
 * 
 * for
 *      for(초기식;조건식;증감식) {
 *      //조건식이 참인동안 실행
 *      }
 * 
 * while
 * do ~ while
 * 향상된 for
 */
// 알파벳 26개 문자를 대문자로 출력
public class ForAlphabetPrint {
    public static void main(String[] args) {
     // A(65) ~ Z(90)
        for(int i=65;i<91;i++) {
            System.out.print((char)i + " ");    
        }
    }
}
