package kr.co.bitcamp.nested01;

import kr.co.bitcamp.nested01.NestedTest.A;

public class NestedTest {
    
    //인스턴스 멤버클래스
    class A {
        int iv = 100;
        //static int cv =200;         //static멤버변수는 사용불가 NestedTest.A.cv 이렇게 접근이 안됨
        
        public A() {
            System.out.println("A 생성자 호출");
        }
        
        public void method1() {
            System.out.println("A 클래스의 method1() 호출");
        }
          
        //public static void method2() {}     //NestedTest.A.method2() 이렇게 접근안됨  
    }
    
    static class B{
        int iv = 100;
        static int cv = 500;
        
        public B() {
            System.out.println("B 생성자 호출");
        }
        
        public void method1() {
            System.out.println("B 클래스의 method1() 호출");
        }
        public static void method2() {
            System.out.println("B 클래스의 method2() 호출");
        }
    }
    
    public void method1() {
        //로컬클래스 선언과 사용(메서드내에 선언하여,잠깐 사용할 용도)
        class C{
            int iv =200;
            //static int cv = 700;    //static 멤버 선언 불가
            public C() {
                System.out.println("로컬클래스 C 생성자 호출");
            }
            public void lmethod() {
                System.out.println("로컬클래스 C 메서드 호출");
            }
//            public static void lmethod2() {
//                System.out.println("로컬클래스 C 메서드 호출"); //static 멤버 선언 불가
//
//            }
        }
        C c = new C();
        System.out.println(c.iv);
        c.lmethod();
        
    }
    public void method2() {
        //로컬클래스 선언과 사용(메서드내에 선언하여,잠깐 사용할 용도)
        class D{
            int iv =300;
            //static int cv = 700;    //static 멤버 선언 불가
            public D() {
                System.out.println("로컬클래스 D 생성자 호출");
            }
            public void lmethod() {
                System.out.println("로컬클래스 D 메서드 호출");
            }
//            public static void lmethod2() {
//                System.out.println("로컬클래스 C 메서드 호출"); //static 멤버 선언 불가
//
//            }
        }
        D d = new D();
        System.out.println(d.iv);
        d.lmethod();
        
    }
    
    public static void main(String[] args) {
        
        NestedTest nestedTest = new NestedTest();
        NestedTest.A a = nestedTest.new A();  //인스턴스 멤버 클래스는 외부클래스의 인스턴스가 반드시 있어야 생성가능
        
        System.out.println(a.iv);
        a.method1();
        System.out.println("----------------------------------------------W");
        
        //정적클래스의 static멤버호출 --- 외부클래스의 인스턴스가 없이도 접근 가능함
        System.out.println(NestedTest.B.cv);
        NestedTest.B.method2();
        System.out.println("----------------------------------------------W");

        NestedTest.B b = new B();
        System.out.println(b.iv);
        b.method1();
        b.method2();
        NestedTest.B.method2();
        System.out.println("----------------------------------------------W");

        nestedTest.method1();
        
        System.out.println("----------------------------------------------W");

        nestedTest.method2();
        
        /*
         * 멤버클래스와 로컬클래스를 구분짓는 기준
         * = 로컬클래스는 순번이 붙음
         */
        
        
        
    }
}

