package kr.co.bitcamp.inheritance02;

//독립클래스
public class Point {

    int x;
    int y;

    
    //기본생성자
    public Point() {
        this(0,0);          //생성자에서 또 다른 생성자 호출
    }

    public Point(int i, int j) {
        System.out.println("point클래스의 매개변수가 있는 생성자 호출");
        this.x = i;
        this.y = j;
      
    }
    
}
