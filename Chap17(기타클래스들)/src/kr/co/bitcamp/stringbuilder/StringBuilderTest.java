package kr.co.bitcamp.stringbuilder;

public class StringBuilderTest {

    public static void main(String[] args) {
        
        //StringBuilder, StringBuffer 클래스는 버퍼(임시저장메모리)를 이용하기 때문에.
        //새로운 인스턴스가 생성되는 것이 아니라, 하나의 인스턴스를 가지고 문자열을 조작할 수 있다.
        StringBuilder sBuilder = new StringBuilder("JAVA");
        System.out.println(sBuilder);
        System.out.println(sBuilder.hashCode());
        
        System.out.println("\n=================================\n");
        
        sBuilder.append("Program");
        System.out.println(sBuilder);
        System.out.println(sBuilder.hashCode());
        
        System.out.println("\n=================================\n");

        sBuilder.insert(1, "나");
        System.out.println(sBuilder);
        System.out.println(sBuilder.hashCode());
        
        System.out.println("\n=================================\n");
        
        sBuilder.insert(1, 100);
        System.out.println(sBuilder);
        System.out.println(sBuilder.hashCode());
        
        System.out.println("\n=================================\n");
        
        sBuilder.setCharAt(0, 'R');
        System.out.println(sBuilder);
        System.out.println(sBuilder.hashCode());
        
        System.out.println("\n=================================\n");
        
        sBuilder.reverse();
        System.out.println(sBuilder);
        System.out.println(sBuilder.hashCode());
        
        System.out.println("\n=================================\n");
        
        sBuilder.delete(0, 3);
        System.out.println(sBuilder);
        System.out.println(sBuilder.hashCode());
        
        System.out.println("\n=================================\n");
        
        int length = sBuilder.length();
        System.out.println("총 방문자 수  : " + length);
    }
    
    

}






















