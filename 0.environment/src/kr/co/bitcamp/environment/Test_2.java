package kr.co.bitcamp.environment;

import java.util.Arrays;
import java.util.Scanner;

public class Test_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자입력 : ");
        int num = scanner.nextInt();
        int[] arrNum = new int[num];

        for(int i=0; i<arrNum.length; i++) {
            System.out.print(i+"번째값 입력 = ");
            arrNum[i] = scanner.nextInt();
        }
        
        
        for(int i=arrNum.length-1; i>=0; i--) {
            System.out.print(arrNum[i] +" ");
        }
       
        
        
        
        
    }
}
