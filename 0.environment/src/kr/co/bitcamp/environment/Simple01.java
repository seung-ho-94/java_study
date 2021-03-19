package kr.co.bitcamp.environment;

import java.util.Scanner;

public class Simple01 {
    static Scanner scanner = new Scanner(System.in);
    static int sum = 0; 
    static double last = 0;
    static int i = 0;

    public static void main(String[] args) {
        //놀이공원 매표소만들기
        int num = 0;            //사용자 선택
        while(num != 3) {
            System.out.print("1: 인원수와 나이 입력 / 2: 이용금액 / 3:종료 => ");
            num = scanner.nextInt();
            
            switch(num) {
            case 1:
                choice01();  
                break;
            case 2:
                choice02();
                break;
            case 3:
                System.out.println("프로그램 사용이 종료됩니다.");
                break; 
            }//switch
        }//while  
    }//main
    
    private static void choice02() {
        System.out.println("총 금액은 " + sum+ "원 입니다.");
        if(sum > 30000) {
            last = sum - (sum*(0.2));
            System.out.println("할인된 금액 => " + last + "원 입니다.");
        }
        
    }

    private static void choice01() {
      //입력 : 인원수 / 인원별 나이
        System.out.print("이용할 인원 수를 입력하세요 = > ");
        int person = scanner.nextInt();    //인원
                              
        
        for(i=0; i<person; i++) {
            System.out.print((i+1)+"번째 사람의 나이를 입력하세요 = > ");
            int age = scanner.nextInt();       //나이  
            
          //조건 : 이용자의 나이가 0~9세:무료 / 10~15세:7000원 / 15~60세:10000원 / 61세~:무료
            if(age <= 9 || age >= 61) {
                sum += 0;
            } else if(age >= 10 && age <=15){
                sum += 7000;
                
            } else if(age >= 16 && age <= 60){
                sum += 10000;
              
            }//if
        }//for  
    }
}






































