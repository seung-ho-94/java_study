package kr.co.bitcamp.array;
/*
 * 크기가 5의 정수형과 실수형 배열 생성하고 각각의 주소값을 출력해보시오
 * 주소값 = 참조값
 * 
 * 
 */
public class ArrayBasic04 {
    public static void main(String[] args) {
        //정수형과 실수형 배열 변수 선언
        int[] arr = {3,3,3,3,4};
        double[] arr2 = {9.8, 2.45, 5.98, 5.11, 3.14};
        int[] arr3;
        arr3 = new int[] {3,3,3,3,4};
        
        //배열명 자체를 출력 -> 주소값 -> I:정수형 배열, D:실수형 배열
//        System.out.println(arr);
//        System.out.println(arr2);
//        System.out.println(arr3);
        
        
        //마지막 배열 요소값
        System.out.println(arr[arr.length-1]);
        System.out.println(arr2[arr2.length-1]);
        System.out.println(arr3[arr3.length-1]);
        
        
        
    }
}


























