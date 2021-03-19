package kr.co.bitcamp.array;

import java.util.Arrays;

public class StringArray {
    public static void main(String[] args) {
        String str = new String("자바");
        System.out.println(str);

        System.out.println(str.toString());
        System.out.println("-------------------------------");
        
        // 객체배열 => 2차원 배열
        String[] str2 = new String[] {
                "안녕", "이순신", "류성룡"             // 1차원 배열임
        };
        
        for(int i=0; i<str2.length; i++) {
            System.out.print(str2[i]+" ");
        }
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println();
        
        
        // 주소가 나옴
        System.out.println("String 배열의 주소 : "+ str2);
        System.out.println("String 배열의 주소 : "+ str2.toString());
        //맨위의 toString은 값이 나왔지만 바로위에 toString은 주소값이 나왔다 왜일까?
        //맨위의 toString은 String이고 바로위에 toString은 Object의 toString이다
        //Object 클래스는 모든 클래스의 최고 조상이다
        //String 클래스는 Object 클래스의 toString을 오버라이딩(재정의)했기때문에 값이 출력됨
        
        System.out.println("String 배열의 주소 : "+str2[1].toString());
        
        str2[0] = "정찰";
        System.out.println(Arrays.toString(str2));
        System.out.println();
        
        //향상된 for
        
        for(String str0 : str2) {
            System.out.print(str0);
        }
    }
}

























