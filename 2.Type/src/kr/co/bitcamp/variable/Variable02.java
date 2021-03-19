package kr.co.bitcamp.variable;

public class Variable02 {
    public static void main(String[] args) {
        System.out.println(Byte.BYTES);       //바이트 계산
        System.out.println(Byte.SIZE);        //비트 계산
        System.out.println(Short.BYTES);      //바이트 계산
        System.out.println(Short.SIZE);       //비트 계산
        System.out.println();
        
        //byte, short, int, long
        System.out.println("byte: "+ Byte.BYTES +"(바이트)"+ " => "+Byte.SIZE+"(비트)  "+Byte.MAX_VALUE+"~"+Byte.MIN_VALUE);
        System.out.println("byte: "+ Byte.BYTES +"(바이트)"+ " => "+Byte.SIZE+"(비트)  "+Byte.MAX_VALUE+"~"+Byte.MIN_VALUE);

    }
}