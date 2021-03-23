package kr.co.bitcamp.interfacee;

public class Creturetest {
    public static void main(String[] args) {
        
        Member member = new Member();
        member.method();
        member.method1();
        
        //인터페이스도 일종의 조상이다 그래서 다형성 개념이 적용된다.
        Creature creature = new Member();
        creature.method();
        
        //원래타입을 벗어나지 못하므로 Member 클래스의 멤버메서드는 호출불가
//        creature.method1();
        
        Person person = new Person();
        person.method();
        person.method2();
        
        creature = new Person();
        creature.method();
        
        System.out.println(Creature.MAX);
        
        
    }
}
