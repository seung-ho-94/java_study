package kr.co.bitcamp.interfacee;

public class Person implements Creature {

    @Override
    public void method() {
        System.out.println("인터페이스 creature를 구현한 person내의 method호출");

    }

    public void method2() {
        System.out.println("person 클래스에 있는 멤버 메서드입니다.");

    }
}
