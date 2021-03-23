package kr.co.bitcamp.interface2;

public class RemoteTest {
    
    public static void main(String[] args) {
        
        //인터페이스도 일종의 조상 => 필드의 다형성이 허용됨
        RemoteControl rControl = new Televition();
        rControl.turnOn();
        rControl.setVolume(15);
        rControl.setVolume(-100);
        rControl.turnOff();
        
        System.out.println("------------------------");
        
        rControl = new Audio();
        rControl.turnOn();
        rControl.setVolume(15);
        rControl.setVolume(7);
        rControl.turnOff();
        
        
    }
}

