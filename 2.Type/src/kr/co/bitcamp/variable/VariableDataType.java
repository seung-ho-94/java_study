package kr.co.bitcamp.variable;
/*
 * 출력시 많이 사용하는 print(), println(), printf()
 */
public class VariableDataType {
    public static void main(String[] args) {
        int a;
        int b =33; int c= 90;
        double d;
        char e;
        
        a = 10;
        d = 3.14;
        e ='A';
        
        System.out.println(b);
        
        String str1, str2, str3;
        str1 = str2 = str3 = "korea";
        System.out.print("여러 문자열 변수 한거번에 초기화 : "+str1+", "+str2+", "+str3);
        System.out.println();
        int i,j,k;
        i=j=k=100;
        System.out.print("여러 정수형 변수 한거번에 초기화 : "+i+", "+j+", "+k);
        
        float f = 9.81F;
        double dd = 3.1415;
        boolean bl = true;
        byte by = 10;
        
        
        System.out.println();
        System.out.printf("10의 8진수: %o, 16진수: %x", by, by);
        
    }
}
