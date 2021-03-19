package kr.co.bitcamp.ifSwirch;

import java.util.Scanner;

/*
 * switch 조건문의 사용법을 설명해보시오
 * 
 * 사용자가 자신의 연령대를 입력하면 해당 연령대에 맞는 책을 추천
 */
public class SwirchBasic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("나이를 입력해주세요 : ");
        int inputAge = scanner.nextInt();
        System.out.print("추처하는 책 : ");
        if(inputAge > 0 && inputAge < 70) {
        switch(inputAge / 10) {
        case 0: System.out.println("동화"); break;
        case 1: System.out.println("삼국지"); break;
        case 2: System.out.println("주식으로 부자되기"); break;
        case 3: System.out.println("내집마련 가능한가?"); break;
        case 4: System.out.println("아이교육"); break;
        case 5: System.out.println("사춘기 어떻게 교육할까?"); break;
        case 6: System.out.println("노후 추천 여행지"); break;
        }
        } else {
            System.out.println("잘못입력하셨습니다.");
        }
    
    }
}
