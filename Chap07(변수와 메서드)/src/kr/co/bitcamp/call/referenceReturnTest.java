package kr.co.bitcamp.call;

import java.util.Arrays;

public class referenceReturnTest {
    public static void main(String[] args) {
        int[] origin = new int[] {10,20,30,40,50}; //원본배열
        int[] cloned = null;
        System.out.println("copy() 호출 전 : " + Arrays.toString(cloned));
        cloned = copy(origin);
        
        System.out.println("copy() 호출 후 : "+ Arrays.toString(origin));
        System.out.println("copy() 호출 후 : "+ Arrays.toString(cloned));

    }
    
    public static int[] copy(int[] arr) {
        int[] temp = new int[5];
        System.arraycopy(arr, 0, temp, 0, arr.length);
//        for(int i=0; i<arr.length; i++) {
//            temp[i] = arr[i];
//        }
        
        return temp;
    }
}
