package kr.co.bitcamp.abstractt2;

public class SmartPhone extends Phone{

    public SmartPhone(int serialNo, String company, String owner) {
        super(serialNo, company, owner);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void turnOn() {
        System.out.println("스마트폰이 켜졌습니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("스마트폰이 꺼졌습니다.");
    }
    
    //자체메서드
    public void internetSearch() {
        System.out.println("구글검색을 시작합니다.");
    }
    

    
    
    
    
}




























