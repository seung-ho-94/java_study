package kr.co.bitcamp.stringbuilder;

public class StringToPrimitive {
    public static void main(String[] args) {
        int value = Integer.parseInt("100");
        double value2 = Double.parseDouble("3.14");
        boolean value3 = Boolean.parseBoolean("true");
        
        System.out.println(value);
        System.out.println(value2);
        System.out.println(value3);

    }
}
