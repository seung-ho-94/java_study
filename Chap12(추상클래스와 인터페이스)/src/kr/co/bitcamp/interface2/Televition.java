package kr.co.bitcamp.interface2;

public class Televition implements RemoteControl {

    private int volume;

    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
        
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
        
    }

    @Override
    public void setVolume(int volume) {
        if(volume > RemoteControl.MAX_VOLUME) {
            System.out.println("TV 볼륨의 최대치 값은 10입니다.");
            this.volume = RemoteControl.MAX_VOLUME;
        }
        else if(volume < RemoteControl.MIN_VOLUME) {
            System.out.println("TV 볼륨의 최소치 값은 0입니다.");
            this.volume = RemoteControl.MIN_VOLUME;
        }
        else {
            this.volume= volume;
        }
        System.out.println("현재 볼륨 :" + this.volume);
    }        
 }


