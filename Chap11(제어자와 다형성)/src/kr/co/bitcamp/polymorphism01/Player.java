package kr.co.bitcamp.polymorphism01;

//조상클라스 
public class Player {
    //멤버 변수
    private String name;
    private int age;
    private int backNumber;
    private int speed;
    
    //생성자
    public Player(String name, int age, int backNumber, int speed) {
        super();
        this.name = name;
        this.age = age;
        this.backNumber = backNumber;
        this.speed = speed;
    }
    
    //getter() 메서드 제공
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getBackNumber() {
        return backNumber;
    }
    public int getSpeed() {
        return speed;
    }
    
    public void info() {
        System.out.println("이름 : " + this.getName());
        System.out.println("나이 : " + this.getAge());
        System.out.println("등번호 : " + this.getBackNumber());
        System.out.println("속도 : " + this.getSpeed());
    }
    
    
    
}
















