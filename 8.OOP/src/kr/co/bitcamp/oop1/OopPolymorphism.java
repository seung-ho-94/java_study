package kr.co.bitcamp.oop1;

/*
 * 다형성(Polymorphism)에 대해서 개념 설명
 * [1] 다형성이란?
 *     다형성이란 다양한 형태 또는 특성 가진다는 의미
 *     부모 클래스 상속받은 자식 클래스으 인스턴스가 부모의 객체로도 사용되고
 *     뿐만 아니라 자식 클래스의 객체로도 사용할 수 있는 다양한 상황을 의미함
 * 
 * [2] 예시
 *     부모 클래스 bird가 있고, 이를 상속받은 자식 클래스 parrot이 있다고 가정한다.
 *     이때, "앵무새가 말을 하네..." 이렇게 말할 수 있다.
 *     앵무새가 새기 때문에 "새가 말을 하네.."
 *     
 * [3] 소결론
 *     하위클래스 인스턴스(객체)는 보다 위인 상위클래스의 인스턴스(객체)로도 사용될 수 있다.
 *     
 */

class Person{}
class Student extends Person{}
class Teacher extends Person{}
class StepPerson extends Person{}

public class OopPolymorphism {
    public static void main(String[] args) {
        //객체 생성
        Student  s1 = new Student();            //지극히 정상적인 객체 생성
        
        //객체 생성 --> 타입은 부모 타입으로 생성
        Person s2 = new Student();              //이것도 정상->자식(하위)클래스 객체를 만들면서 
                                                //타입은 상위(부모)타입을 쓰는 것이 가능-->다형성
        
        Person s3 = new Person();               //지극히 정상적인 객체 생성
        Person s4 = new Teacher();
        
        //상위 클래스로 객체를 생성하면서 타입은 하위타입을 쓰는경우 -> 에러
        //Student s6 = new Person();
        
     }
}
