package kr.co.bitcamp.overriding01;

public class HddTest {
    public static void main(String[] args) {
        
        HddDisk hddDisk = new HddDisk(500, 7200);
        System.out.println(hddDisk.status());
        
        System.out.println();
        System.out.println("--------------------------");
        System.out.println();
        
        UsbMemory memory = new UsbMemory(200, 800);
        System.out.println(memory.status());
        
        System.out.println();
        System.out.println("--------------------------");
        System.out.println();
        
        System.out.println(memory.status(777));
    }
}
