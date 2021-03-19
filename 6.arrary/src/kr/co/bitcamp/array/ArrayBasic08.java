package kr.co.bitcamp.array;

import java.util.Arrays;

/*
 * 1, 2차원 배열의 생성 및 출력을 다양하게 구현해 보세요
 */
public class ArrayBasic08 {
    public static void main(String[] args) {
        String[] province = new String[3];
        
        System.out.println(Arrays.toString(province)); //null로 출력
        System.out.println();
        
        String[] nation = new String[] {"한국", "미국", "중국"};
        System.out.println(nation[0]);
        
        String[] flower = {"무궁화", "해바라기", "개나리"};
        System.out.println(flower[1]);
        System.out.println();
        
        for(int i=0; i<flower.length; i++) {
            System.out.print(flower[i]+ " ");
        }
        System.out.println();
        
        //향상된 for문으로 배열 요소 출력
        for(String iFlower : flower) {
            System.out.print(iFlower + " ");
        }
        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println();
        
        //String 2차원 배열 만들기 -> 2*3
        //아시아 -> 동북아시아(한국, 중국, 일본), 동남아시아(태국, 베트남, 필리핀)
        String[][] asia = {{"한국","중국","일본"}, {"태국","베트남","필리핀"}};
        
        System.out.println(asia[0]); //동북아시아 국가를 저장하고 있는 1차원 배열의 주소
        System.out.println(asia[1]); 
        System.out.println();
        
        System.out.println(asia[0][0]); //실제 요소의 값 출력
        
        System.out.println(Arrays.toString(asia[0]));
        System.out.println(Arrays.toString(asia[1]));
        
        System.out.println(asia.length);
        System.out.println(asia[0].length);
        System.out.println(asia[1].length);
        
        for(int i=0; i<asia.length; i++) {
            for(int j=0; j<asia[i].length; j++) {
                System.out.print(asia[i][j]+" ");
            }
            System.out.println();
        }
        
        
        //charAt(int index) 메서드 사용 -> 해당 인덱스에 있는 값을 반환 -> 단어를 char 배열에 한글자씩 저장할 수 있음 
        String[] strArr = {"hong", "kim", "park"};
        System.out.println(strArr[0]);
        System.out.println(strArr[0].charAt(0));
        System.out.println(strArr[1].charAt(0));
        System.out.println(strArr[2].charAt(0));
        
        System.out.println(strArr.length);
        System.out.println(strArr[0].length());
        System.out.println("------------------------------------");
        
        //charAt()메서드 사용해서 이차원배열 출력
        for(int i=0; i<strArr.length; i++)
            for(int j=0; j<strArr[i].length(); j++)
                System.out.print(strArr[i].charAt(j));
        
        System.out.println();
        System.out.println("-------------------------------------");
        
        //length VS length()
        int[] test = new int[10];
        System.out.println(test.length);
        
        String test2 = "Welcome to Bitcamp";
        System.out.println(test2.length()); //문자열의 갯수
        System.out.println("-------------------------------------");

        
  }
}

























