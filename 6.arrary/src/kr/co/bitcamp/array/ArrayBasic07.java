package kr.co.bitcamp.array;

import java.util.Arrays;

/*
 * 배열을 복사하는 메서드 
 * arraycopy() 메서드 사용
 * System.arraycopy(원본 배열명, srcPos, 복사배열명, destPos, 길이);
 * 
 */
public class ArrayBasic07 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
        
        // 배열복사
        System.arraycopy(arr1, 2, arr2, 4, 3);
        //               arr1의 (2)세번째부터 복사를해서 arr2의 (4)다섯번째부터 덮어쓴다 3개만
        //               1, 2, 3, 4, 5
        //               1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        //               1, 2, 3, 4, 3, 4, 5, 8, 9, 10
        
        System.out.println(Arrays.toString(arr2));
        
    }
    
}
