package kr.co.bitcamp.finalconstant;
/*
 * final 초기화방법
 * 1) 선언과 동시에 초기화
 * 2) 생성자에서 단한번 초기화
 */
public class Person {
    
    final String nation = "KOREA";         //상수선언
    final int age;
    static final int MAX_NUMBER = 1000;    //불변의 정적상수
    
    public Person(int age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "nation : " + this.nation +
                ", age : " + this.age;
    }
}
