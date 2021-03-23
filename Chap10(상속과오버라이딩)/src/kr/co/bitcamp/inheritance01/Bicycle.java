package kr.co.bitcamp.inheritance01;

/*
 * [1]상속(inheritance)이란?
 *    : 부모 클래스가 가지고 있는 속성(변수)들과 기능(메서드)들을 그대로 물려받아
 *      새로운 클래스를 만드는 것.
 *      이때 물려받게 된느 원본 클래스를 부모클래스(Parent class), 슈퍼클래스(Super class)라고 부른다
 *                              기초/기반클래스(Base class)
 *      
 *      상속받아 새롭게 만들어진 클래스를 자식클래스(Child class), 서브/하위클래스(sub class)라고 부른다.
 *                              파생클래스(Derived class)
 *                              
 * [2]상속의 장점
 *    : 가장 큰 장점 --> 재활용성 
 *      부모에 정의되어져 있는 멤버필드(변수)나 메서드들을 그대로 상속받아 사용하면 된다.                           
 *      상속받은 메서드라 해도 필요에 의해 자식 클래스에서 용도를 변경해서 사용하는 것도 가능하다.
 *      
 * [3]상속의 사용
 *    : 생성자는 상속이 안됨.
 *      부모 클래스는 접근제한자 private인 경우에 아무리 자식 클래스가 상속을 받았다 하더라도 접근 불가능
 *      
 */

//조상클래스
public class Bicycle {
    
    int id;
    String brand;
    String owner;
    
    
}
