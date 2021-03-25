package kr.co.bitcamp.exception01;

import java.util.Arrays;

public class ArrayIndexOfBoundsTest {

    public static void main(String[] args) {
        
        int[] arr = new int[5];
        System.out.println(Arrays.toString(arr));
        
        
        for(int i=0; i<6; i++) {
            arr[i] = 10;                //i가 5일때 예외 바생될꺼라고 예상
            
            System.out.println("arr ["+ (i+1) +"] = " +arr[i]);

        }
        
    }

}
