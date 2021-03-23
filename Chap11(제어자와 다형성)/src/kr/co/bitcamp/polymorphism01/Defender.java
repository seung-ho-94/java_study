package kr.co.bitcamp.polymorphism01;

public class Defender extends Player {
    private int defence;

    public Defender(String name, int age, int backNumber, int speed, int defence) {
        super(name, age, backNumber, speed);
        this.defence = defence;
    }

    public int getDefence() {
        return this.defence;
    }
    
    @Override
    public void info() {
        super.info();
        System.out.println("방어 횟수 : " + this.getDefence());
        
    }


}
