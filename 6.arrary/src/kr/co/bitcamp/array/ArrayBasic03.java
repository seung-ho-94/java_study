package kr.co.bitcamp.array;
/*
 * 2가지 방식으로 배열 초기화
 */
public class ArrayBasic03 {
    public static void main(String[] args) {
        
        //[1]
        int[] salesTable = new int[] {55,88,60,100,90};
        System.out.println(salesTable[2]);
        
        //[2]배열 선언과 동시에 특정 값으로 초기화
        int[] salesTable2 = {55,88,60,100,90};
        System.out.println(salesTable2[1]);
 
        //[3]
        int[] salesTable3;
        salesTable3 = new int[] {55,88,60,100,90};
        System.out.println(salesTable3[3]);
    }
}
