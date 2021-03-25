package kr.co.bitcamp.exception02;

import java.util.Arrays;

public class MultiCattest {

    public static void main(String[] args) {
        try {
            int[] arr = new int[3];
            System.out.println(Arrays.toString(arr));
            //arr[3] = 100;             //예외발생
            int result = 10 / 0;        //예외발생
            System.out.println(result);
            
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("배열의 인덱스를 초과하였습니다.");
        }catch(ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }catch(Exception e) {
            System.out.println("예외 발생");
        } finally {
            System.out.println("종료");
        }
        
       
           
            
}
}
