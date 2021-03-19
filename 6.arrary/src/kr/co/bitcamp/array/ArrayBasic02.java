package kr.co.bitcamp.array;
/*
 * 배열변수는 참조형 타입
 * 즉 해당 메모리공간의 주소값을 가진다
 * 공간이 100개 만들어지면 동시에 자동적으로 해당 공간에 접근할 수 있는 인덱스 번호가 자동부여
 */
public class ArrayBasic02 {
    public static void main(String[] args) {
      //배열의 선언 및 크기지정
        int[] score = new int[10];
        int size = score.length;
        System.out.println(size);
        System.out.println(score[0]);
        System.out.println(score[size-1]);
    }
    
}
