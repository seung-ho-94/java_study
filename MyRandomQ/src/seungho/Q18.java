package seungho;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q18 {

        // 1. A, B 두 수의 최소공배수 LCM = A * B / GCD(최대공약수)
        // 2. 두 수의 GCD를 구하는 메소드를 만든다
        // 3. 두 수의 LCM을 구하는 메소드를 만든다
        // 4. 배열의 두 원소의 LCM을 반복적으로 구하여, 배열 전체의 LCM을 구한다
        
        
        // 2.두 수의 GCD 구하는 메소드
        public static int gcd(int a, int b) {
            int gcd = 1;
            int small;

            if (a >= b) {
                small = b;
            } else {
                small = a;
            }

            for (int i = 1; i <= small; i++) {
                if (a % i == 0 && b % i == 0) {
                    gcd = i;
                }
            }
            return gcd;
        }

        
        // 3. 두 수의 LCM 구하는 메소드-GCD활용
        public static int lcm(int a, int b) {
            int lcm = a * b / gcd(a, b);
            return lcm;
        }

        
        // 4. 배열의 LCM 구하는 메소드 
        // 배열의 원소 두 개씩 lcm 메소드 적용
        public static int arrLcm(int[] intArr) {
            int i;
            for (i = 0; i < intArr.length - 1; i++) {
                intArr[i + 1] = lcm(intArr[i], intArr[i + 1]);
            }
            return intArr[i];
        }
                       
        
        // 출력해보기
        public static void main(String[] args) {
            int[] intArr1 = new int[] { 2, 6, 8, 14 }; // 168
            int[] intArr2 = new int[] { 1, 2, 3 };  // 6
            int[] intArr3 = new int[] { 5, 8, 9, 10, 11, 12, 13 }; // 51480

            System.out.println(arrLcm(intArr1));
            System.out.println(arrLcm(intArr2));
            System.out.println(arrLcm(intArr3));

        }

}











