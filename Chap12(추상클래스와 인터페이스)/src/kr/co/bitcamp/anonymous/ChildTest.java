package kr.co.bitcamp.anonymous;

public class ChildTest {

    public static void main(String[] args) {
        
        Parent parent = new Parent() {
            
            public void method() {
                int a =10;
                System.out.println("a : "+ a);
                
            }
        };
        parent.method();
//        parent.b;
    }

}
