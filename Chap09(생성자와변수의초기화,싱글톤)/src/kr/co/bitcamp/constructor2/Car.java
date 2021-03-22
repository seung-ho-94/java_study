package kr.co.bitcamp.constructor2;

public class Car {

    String color;            // 색상
    String gearType;         // 변속기
    int door;
    
    // 기본 생성자
    public Car() {
        // 직접적으로 인스턴스 멤버 변수를 초기화
//        this.color = "노랑";
//        this.gearType = "수동";
//        this.door = 4;
        
        // 같은 클래스내에 있는 매개변수가 3개가 있는 생성자를 호출하는 구문
        this("검정", "수동", 4);
    }
    
    /*
     *  this : 참조변수와 같은 역할,
     *         매개변수와 멤버변수를 구분짓는데 사용(this 사용해서 명확하게 프로그램 실행되도록함
     */
    public Car(String color, String gearType, int door) {
        this.color = color;            // 변수의 모호성 발생, 초기화 안되ㅁ
        this.gearType = gearType;
        this.door = door;
    }
    
    // 인스턴스 복제를 위한 생성자
    public Car(Car car) {
        this.color = car.color;
        this.gearType = car.gearType;
        this.door = car.door;
    }
    
    public Car(String color) {
        this.color = color;
    }
    
    public Car(String color, String gearType) {
        this.color = color;
        this.gearType = gearType;
    }
    
    public Car(int door) {
        this.door = door;
    }
    
    public Car(String color, int door) {
        this.color = color;
        this.door = door;
    }
    
    @Override
    public String toString() {
        return this.color + ", " + this.gearType + ", " + this.door;
    }
    
}



















