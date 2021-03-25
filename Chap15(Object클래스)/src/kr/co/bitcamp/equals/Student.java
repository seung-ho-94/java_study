package kr.co.bitcamp.equals;

import java.util.Arrays;

public class Student {
    int age;
    String name;
    int[] subject;
    
//    public Student(int age) {
//        this.age = age;
//    }
    
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    
    public Student(int age, String name, int[] subject) {
        this.age = age;
        this.name = name;
        this.subject = subject;
    }
    
    @Override
    public boolean equals(Object obj) {
        System.out.println("오버라이드된 eqials() 호출됨.");
        
        //타입변환(다운캐스팅)이 가능한지 여부를 알아보기 위해서 instanceof 연산자 이용
        if (obj instanceof Student) {
            Student student = (Student)obj;     //downcasting
            //논리적 동등을 위해서 조건문을 설정
            //if((this.age == student.age) && (this.name.equals(student.name)) && (this.subject.equals(student.subject))) {
            if((this.age == student.age) && (this.name.equals(student.name)) 
                    && Arrays.equals(this.subject, student.subject)) {
                    return true;      
            }//if
            
        }//if  
        return false;
    }
    
}





















