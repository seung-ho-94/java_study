package kr.co.bitcamp.nongeneric;

public class Person {
    
    private Object object;
    
    public Person() {
        
    }
    
    //리턴타입 Object
    public Object getObject() {
        return object;
    }
    
    //매개변수가 Object이다.
    public void setObject(Object object) {//모든 클래스를 다 매개변수,리턴타입으로 하겠다(다형성)
        this.object = object;
    }
    
    
}
