package kr.co.bitcamp.polymorphism02;

public class InstanceOf {
    
    public static void main(String[] args) {
        
      //ctrl + t : 상속계층도를 볼 수 있는 단축키
        SportCar sportCar = new SportCar();
        
        if(sportCar instanceof SportCar) {
            System.out.println("sportcar로 타입변환이 가능합니다.");
        }
        
        if(sportCar instanceof Car) {
            System.out.println("car로 타입변환이 가능합니다.");
        }
        
        if(sportCar instanceof Object) {
            System.out.println("object로 타입변환이 가능합니다.");
        }
        
        
    }
    

}
