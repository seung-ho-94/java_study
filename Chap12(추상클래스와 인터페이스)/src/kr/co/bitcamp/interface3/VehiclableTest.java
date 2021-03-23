package kr.co.bitcamp.interface3;

public class VehiclableTest {
    public static void main(String[] args) {
        Driver driver = new Driver();
        Bus bus = new Bus();
        Taxi taxi = new Taxi();
        
        //bus.setSpeed(-50);
        
        bus.setSpeed(60);
        driver.drive(bus);              //직접적으로 객체를 생성하여 참조변수로 넘김
        driver.stop(bus);
        
        taxi.setSpeed(80);
        driver.drive(taxi);
        driver.stop(taxi);
        
        //직접 객체를 매개변수로 생성하여 넘기는 방법
        //driver.drive((new Taxi());
        //driver.drive(new Bus());
        System.out.println();
        Vehiclable vehiclable = driver.newCarMethod(taxi);
        vehiclable.run();
        vehiclable.stop();
        
        System.out.println();
        vehiclable = driver.newCarMethod(new Bus());
        vehiclable.run();
        vehiclable.stop();
        
    }
}
