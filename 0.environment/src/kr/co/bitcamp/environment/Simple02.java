package kr.co.bitcamp.environment;

import java.util.Arrays;

public class Simple02 {
public static void main(String[] args) {
    int[] num = new int[5];
    for(int i=0; i<5; i++) {
        num[i] = (int)(Math.random()*100+1);
    }
    
    for(int i=0; i<num.length; i++) {
        for(int j=0; j<num.length-1; j++) {
            if(num[j] < num[j+1]) {
                int temp = num[j];
                num[j] = num[j+1];
                num[j+1] = temp;
            }
        }
    }
    System.out.println(Arrays.toString(num));
    
    
    
    
}
}
