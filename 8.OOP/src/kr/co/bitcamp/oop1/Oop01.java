package kr.co.bitcamp.oop1;

/*
 * 클래스란 무엇이고 어떤 역할을 하는지 대해서 설명해보시오
 * 
 * [1] 클래스란 무엇인가?
 *  클래스란 객체(또는 인스턴스)를 생성하는 하나의 공장(=틀, 프레임, 판형 등등..)이다.
 *  자동차 클래스(공장), 동물 클래스(공장), AI 로봇(공장) 등등..만들고 싶은거 다 만들 수 있다.
 *  
 * [2] 클래스 공장을 통해서 객체를 어떻게 만들어 내는가?
 *  2개 정도로 압축을 했을 때 "특징"과 "동작"이 된다.
 *  객체의 특징 --> 속성(attribute, field)
 *  객체의 동작 --> 메서드(method), 함수  
 *  
 * [3] 클래스는 왜 나왔을까?
 *  클래스 업이도 객테의 특징들은 변수로 정의할 수 있을것이고, 동작은 함수로 정의할 수 있을것이다.
 *  그러나 프로그램의 규모가 커지고 여러 사람이 협업을 하는 과정에서 좀 더 체계적이고 분업화된 시스템으로 개발하고 
 *  확장해 나갈 필요성이 있다
 *  그런 일련의 과정에서 OOP(객체지향 프로그래밍)가 만들어지고 발전해왔다.
 *  거의 모든 프로그래밍 언어에서 OOP문법을 지원하고 있고 하나의 언어로 OOP문법을 공부하면 다른 언어에서도 거의 동일하다.
 *  즉, 자바로 OOP를 개발하고 python, javascript을 접할때 상당히 용이하다. 
 */
class FarmMachine{
    // [1] 속성(특징)
    int price;     //가격
    int year;      //연식
    String color;  //색상
    
    // [2] 동작/ 기능 / 행동(method) --> 농기계마다 동작이 다양할것으로 공통적인 동작을 샐각
    public void move() {
        System.out.println("FarmMachine is moving");
    }
    public void dig() {
        System.out.println("FarmMachine is digging");
    }
    public void grind() {
        System.out.println("FarmMachine is grinding");
    }
    
}
public class Oop01 {
    public static void main(String[] args) {
        // 객체생성
        FarmMachine fMachine = new FarmMachine();
        System.out.println(fMachine);
        
        fMachine.price = 10000000;
        fMachine.year = 2021;
        fMachine.color = "red";
        
        //객체 속성 값 출력
        System.out.println(String.format("%,d", fMachine.price));
        System.out.println(fMachine.year);
        System.out.println(fMachine.color);
        
        //동작 수행하기
        fMachine.move();
        fMachine.dig();
        fMachine.grind();
    }

}























