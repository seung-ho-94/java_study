package kr.co.bitcamp.staticvariable2;

public class CaculatorTest {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        
        //인스턴트 메서드 호출
        int addResult = cal.add(100, 200);
        System.out.println("인스턴스 메서드 add() 호출 결과 : " + addResult); 
        
        int substractResult = cal.substract(400, 200);
        System.out.println("인스턴스 메서드 substract() 호출 결과 : " + substractResult); 
        
        long multiplyResult = cal.multiply(20, 30);
        System.out.println("인스턴스 메서드 multiply() 호출 결과 : " + multiplyResult); 
        
        double devideResult = cal.devide(30, 5);
        System.out.println("인스턴스 메서드 devide() 호출 결과 : " + devideResult); 
        
        Integer.parseInt("100");
        Math.random();
        
    }
}
