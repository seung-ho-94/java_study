package kr.co.bitcamp.staticvariable2;

public class Calculator {

    //인스턴스 메서드
    //특징 : new 연산자로 인스턴스를 생성해야지만, 참조 변수명.인스턴스메서드() 접근가능
    public int add(int x, int y) {
        double dresult = Calculator.devide(10.5, 11.7);
        System.out.println("인스턴스 메서드내에서 static메서드 호출 : " + dresult);
        return x + y;
    }
    
    //인스턴스 메서드
    public int substract(int x, int y) {
        return x - y;
    }
    
    //static(정적) 메서드
    //특징 : 인스턴스 생성없이 클래스명, 정적메서드명으로 바로 접근 가능함.
    //static 메서드는 이미 메모리 상단에 올라가있고 인스턴스 생성없이 접근이 가능해야되는데
    //아래코드는 인스턴스가 생성되어야지만 사용가능한 add()가 호출하기때문에 예외가 발생함
    //즉 인스턴스가 언제 생성될지 아무도 모르기 때문에 static메서드 안에서 인스턴스 메서득가 절대 오면 안됨
    public static long multiply(long x, long y) {
        //this.add(10, 5);
        return x * y;
    }
    
    public static double devide(double x, double y) {
        
        return x / y;
    }
}































