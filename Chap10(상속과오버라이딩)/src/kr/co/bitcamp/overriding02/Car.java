package kr.co.bitcamp.overriding02;

public class Car {
    int speed;
    
    public Car() {
    }
    
    public Car(int speed) {
        this.speed = speed;
    }
    
    /*
     * 메서드 앞에 final이 붙으면 자손에서 오버라이딩을 할 수 없음
     */
    public final void speedUp() {
        this.speed += 10;
        System.out.println("차가 " + this.speed + "속도로 달립니다.");
    }
    
    public void speedDown() {
        this.speed -= 10;
        System.out.println("차가 " + this.speed + "속도로 달립니다.");
    }
    
    public void stop() {
        System.out.println("차가 멈춥니다.");
    }
}
