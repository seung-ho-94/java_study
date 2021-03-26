package seungho;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "";
        
        ArrayList<String> arr1 = new ArrayList<String>();
        ArrayList<String> arr2 = new ArrayList<String>();
        
        System.out.print("출력할 단어 수 : ");
        int num = scanner.nextInt();
        
        //문자입력
        for(int i=0; i<num; i++) {
            System.out.print(i+"번째 = ");
            str = scanner.next();
            arr1.add(str);
        }
        
        //중복제거
        for(int i=0; i<arr1.size(); i++) {
         if(!arr2.contains(arr1.get(i))) {
             arr2.add(arr1.get(i));
             i = -1;
         }
        }
        
        //사전정렬
       Collections.sort(arr2);
        
        //문자열수 정렬
      for(int i=0; i<arr2.size()-1; i++) {
          if(arr2.get(i).length() > arr2.get(i+1).length()) {
              Collections.swap(arr2, i, i+1);
              i = -1;
          }
      }
       
        //출력
        for(String s : arr2) {
            System.out.println(s);
        }
    }
}















