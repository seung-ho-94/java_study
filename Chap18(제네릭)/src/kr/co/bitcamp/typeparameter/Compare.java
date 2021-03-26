package kr.co.bitcamp.typeparameter;

public class Compare {
    
    //매개변수 T타입dmf Number(추상클래스)타입이거나 Number클래스를 상속받는 
    //자손 클래스만 T타입으로 들어올 수 있다.(상위타입을 제한함)
    public static<T extends Number> int compare(T t1, T t2) {
        //Number클래스의 DoubleValue()는 원래 추상메서드이지만,
        //자손클래스(Integer, Double등)가 doubleValue()를 오버라이딩했기 때문에 문제가 안됨
        double value1 = t1.doubleValue();
        double value2 = t2.doubleValue();
        
        return Double.compare(value1, value2);
    }
}
