package kr.co.bitcamp.polymorphism02;

public class CarTest {
    public static void main(String[] args) {
        
        Car car = null;
        SportCar sportCar = new SportCar();
        PoliceCar policeCar = new PoliceCar();
        
        sportCar.SpeedUp();
        policeCar.siren();
        
        car = sportCar;             //1,업캐스팅(자손->조상) : 조작할 수 있는 멤버가 줄어듦
        
        SportCar sportCar2 = null;
        sportCar2 = (SportCar)car;  //2.다운캐스팅(조상->자손) : 조작할 수 있는 멤버가 늘어남
                                    //다운캐스팅을 할때, 반드시 명시적으로 형변환 코드르 작성해야 함.
        sportCar2.SpeedUp();
        
    }
}
