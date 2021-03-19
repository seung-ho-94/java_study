package kr.co.bitcamp.environment;

import java.util.Scanner;

public class FruitsTest {
    
    static Scanner scanner = new Scanner(System.in);
    static int whatNum  = 0;
    private static String[] fruits;
    private static int[] money;
    
    
    public static void main(String[] args) {
        int num =0;
        
        while( num != 4) {
            System.out.println("-----------------------------------------------------");
            System.out.println("1. 과일 수 입력 | 2. 이름 및 가격 입력 | 3. 가격 리스트 | 4. 종료");
            System.out.println("-----------------------------------------------------");
            System.out.print("선택 > ");
            num = scanner.nextInt(); 
            switch(num) {
            case 1: 
                System.out.print("과일 종류 개수는? ");
                whatNum = scanner.nextInt();
                break;
            case 2: 
                choice1();
                break;
            case 3: 
                choice2();
                break;
            case 4: 
                System.out.println("끝");
                break; 
                
            }//switch 
        }//while
    }//main

    private static void choice2() {
        for(int i=0; i<whatNum;i++) {
            System.out.println(fruits[i] + " 가격 : " + money[i]);
            }
    }

    private static void choice1() {
        fruits = new String[whatNum];
        money = new int[whatNum];
        
        for(int i=0; i<whatNum; i++) {
            System.out.print((i+1) + "번째 과일 이름은? ");
            fruits[i] = scanner.next();
            System.out.print(fruits[i] +" 가격은? ");
            money[i] = scanner.nextInt();
        }        
       
        
    }
    
}


















