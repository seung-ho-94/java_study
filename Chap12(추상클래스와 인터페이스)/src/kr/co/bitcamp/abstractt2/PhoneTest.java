package kr.co.bitcamp.abstractt2;

public class PhoneTest {

    public static void main(String[] args) {
        
        //추상클래스는 인스턴스르 생성할 수 없다.
//        Phone phone = new Phone(111, "ads", "qeqe");
        
        SmartPhone smartPhone = new SmartPhone(100, "갤럭시", "이순신");
        smartPhone.showInfo();
        smartPhone.turnOn();
        smartPhone.turnOff();
        smartPhone.internetSearch();
        
        System.out.println("-----------------------------");
        
        TripleCameraPhone tPhone = new TripleCameraPhone(200, "아이폰", "임승호");
        tPhone.showInfo();
        tPhone.turnOn();
        tPhone.turnOff();
        tPhone.cameraOn();
        tPhone.cameraOff();
        
        System.out.println("-----------------------------");

        Phone[] phone = new Phone[10];
        phone[0] = new SmartPhone(300, "샤오미", "이성계");
        phone[1] = new TripleCameraPhone(400, "LG", "이봉원");

        phone[0].turnOn();
        phone[0].turnOff();
        phone[1].turnOff();
        phone[1].showInfo();
        
    }

}
