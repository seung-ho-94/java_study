package kr.co.bitcamp.exception01;

public class NullPointerTest {

    public static void main(String[] args) {
        
        String str = null;
        
        //객체(인스턴스)가 없는데 인스턴스에 있는 toString()을 어떻게 호출하냐?
        //System.out.println(str.toString());
        
        try{ //try 안의 코드에서 문제가 생기면
            System.out.println(str.toString());
            
        }catch(Exception e) { // catch의 코드를 실행
            System.out.println(e.getMessage()); //예외에 대한 메세지를 출력해준다.
        }
        
        
        
    }

}
