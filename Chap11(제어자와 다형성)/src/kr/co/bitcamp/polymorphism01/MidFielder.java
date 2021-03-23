package kr.co.bitcamp.polymorphism01;

public class MidFielder extends Player {

    private int pass;

    public MidFielder(String name, int age, int backNumber, int speed, int pass) {
        super(name, age, backNumber, speed);         //player 생성자 호출
        this.pass = pass;
        
    }

    public int getPass() {
        return this.pass;
    }
    
    @Override
    public void info() {
        super.info();
        System.out.println("패스 횟수 : " + this.getPass());
    }
        

}
