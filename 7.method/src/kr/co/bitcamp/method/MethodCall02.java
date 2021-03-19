package kr.co.bitcamp.method;
/*
 * 메인 메서드에서 100을 보냈을 때 값이 수정되게끔 call by reference 방식으로 호출
 */
public class MethodCall02 {
    public static void main(String[] args) {
        MethodCall02 ac = new MethodCall02();
        // 클래스 타입으로 변수 a를 선언하고, new로 객체를 생성하여 해당 주소번지를 메서드로 보냄
        sum(ac);
        System.out.println("sum 메서드에서 a값 출력 : "+ ac);
        
        //배열 타입으로 변수 b를 선언하고 new로 객체를 생성하여 해당 주소번지를 메서드로 보낸다
        int [] b = new int[5];
        sum2(b);
        System.out.println("sum 메서드에서 b값 출력 : "+ b);
        
        double[] c = new double[5]; 
        sum3(c);
        System.out.println("sum 메서드에서 c값 출력 : "+ c);
        
        Integer d = new Integer(100);  //Wrapper 클래스의 integer 클래스 타입으로 변수 d를 선언하고
        sum4(d);                       //new로 객체를 생성해서 해당 주소값을메서드로 보낸다.
        System.out.println("sum 메서드에서 d값 출력 : "+ d); //주소 값이 찍히는게 아니라 100이라는 값이 찍힘
        
    }
    
    public static void sum(MethodCall02 a) {
        System.out.println("sum 메서드에서 a값 출력 : "+ a);
    }
    
    public static void sum2(int[] b) {
        System.out.println("sum 메서드에서 b값 출력 : "+ b);
    }
    
    public static void sum3(double[] c) {
        System.out.println("sum 메서드에서 c값 출력 : "+ c);
    }
    
    public static void sum4(Integer d) {
        System.out.println("sum 메서드에서 d값 출력 : "+ d); //주소값이 찍히는게 아니라 100이라는 값이 찍힘
        
    }
    
    
    
}
