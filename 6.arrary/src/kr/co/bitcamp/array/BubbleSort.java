package kr.co.bitcamp.array;

import java.util.Arrays;

/*
 * 버블정렬
 */
public class BubbleSort {
    public static void main(String[] args) {
        
        int[] ball = new int[5];
        
        for(int i=0; i<ball.length; i++) {
            ball[i] = (int)(Math.random()*45)+1;
        }
        System.out.println("정렬전");
        for(int i=0; i<ball.length; i++) {
            System.out.print(ball[i]+" ");
        }
        
        System.out.println();
        
        
        // 버블정렬 
        for(int i=0; i<ball.length; i++) {
            for(int j=0; j<ball.length-1; j++) {
                if(ball[j] > ball[j+1]) {
                    int temp = ball[j];
                    ball[j] =ball[j+1];
                    ball[j+1] = temp;
                }
            }
        }
        
//        Arrays.sort(ball);  //오름차순 정렬
        

        System.out.println("정렬후");
        
        System.out.println(Arrays.toString(ball));
        
        
//        for(int i=0; i<ball.length; i++) {
//            System.out.print(ball[i]+" ");
//        }
        System.out.println();

        
        
        
        
        
        
        
    }
}

























