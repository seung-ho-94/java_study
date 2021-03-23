package kr.co.bitcamp.overriding01;

public class UsbMemory extends HddDisk {

    UsbMemory() {
        this(0,0);
    }

    UsbMemory(int capacity, int rpm) {
        this.capacity = capacity;
        this.rpm = rpm;
    }

    // 조상클래스의 메서드 오버라이딩
    @Override
    public String status() {
        String str = "USB 디스크 용량 : " + this.capacity + "\nUSB 디스크 속도 : " + this.rpm + "(rpm)";
        return str;
    }
    
    public String status(int i) {
        String str = "USB 디스크 용량2 : " + i + "\nUSB 디스크 속도2 : " + this.rpm + "(rpm)";
        return str;
    }
}