package kr.co.bitcamp.superr;

public class Child extends Parent {
    int x = 20;
    
    public Child() {
        //조상클래스의 기본생성자를 호출, 기본생성자에 한해서만 생략하더라도 컴파일러가 알아서 추가함
        super(200);          //조상클래스의 매개변수가 있는 생성자를 호출(조상클래스가 먼저 만들어져야하기 때문), 절대 생략하면 안됨
        
    }
    
    
    public void show() {
        System.out.println("현재 인스턴스 의 x = " + x);
        System.out.println("자손클래스의 this.x = " + this.x);
        System.out.println("조상클래스의 super.x = " + super.x);

    }
}
