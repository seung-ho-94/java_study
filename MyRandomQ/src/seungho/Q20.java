package seungho;

import java.util.ArrayList;
import java.util.Scanner;

//컬렉션 프레임워크 어레이리스트 기반으로 2차원 배열을 만들어 요소를 추가하고 출력해 보시오
public class Q20 {
    public static void main(String[] args) {
//        ArrayList<Integer[]> arr = new ArrayList<Integer[]>();
//        
//        arr.add(new Integer[] {11,12,13,14});
//        arr.add(new Integer[] {21,22,23,24});
//        arr.add(new Integer[] {31,32,33,34});
//        
//        for(int i=0; i<arr.size(); i++) {
//            System.out.print(arr.get(i)[0]+" ");
//            System.out.print(arr.get(i)[1]+" ");
//            System.out.print(arr.get(i)[2]+" ");
//            System.out.println();
//
//        }
        
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
       
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(11);
        a1.add(12);
        a1.add(13);
        a1.add(14);
        arr.add(a1);
        
        ArrayList<Integer> a2 = new ArrayList<Integer>();
        a2.add(21);
        a2.add(22);
        a2.add(23);
        a2.add(24);
        arr.add(a2);
        
        ArrayList<Integer> a3 = new ArrayList<Integer>();
        a3.add(31);
        a3.add(32);
        a3.add(33);
        a3.add(34);
        arr.add(a3);
        
        for(int i=0; i<arr.size(); i++) {                   //size() = 3 -> 열
            for(int j=0; j<arr.get(i).size(); j++) {        //get(i).size() = 4 -> 행
                    System.out.print(arr.get(i).get(j) + " "); 
            }
            System.out.println();
        }
        

        
    }
}

















