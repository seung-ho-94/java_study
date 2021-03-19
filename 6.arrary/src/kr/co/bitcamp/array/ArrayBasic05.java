package kr.co.bitcamp.array;

import java.util.Arrays;

/*
 * 배열의 값들을 for문과 같은 반복문을 사용하지 않고 한꺼번에 출력하는 코드
 * Arrays.toString(데이터타입 변수[])
 * 반복문을 사용하지 않고 배열의 값들을 출력
 */
public class ArrayBasic05 {
    public static void main(String[] args) {
        int[] arr = {238, 483, 239, 442, 487, 249, 873};
        
        //반복문 사용 o
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        //반복문 사용 X, toString() 메서드사용
        System.out.println(Arrays.toString(arr));
        
        
        
    }
}
