package kr.co.bitcamp.interface4;

public class DefaultStaticClass implements MyInterface{

    @Override
    public void method() {
        System.out.println(DefaultStaticClass.MAX_NUM);
        System.out.println("Myinterface의 추상 메서드를 재정의한 메서드 호출");
    }
    /* 
     * 구현클래스들에게 전혀 영향을 끼치지 않고 디폴트메서드가 필요한 구현클래스에서만
     * 오버라이딩을 해서 사용하면 된다.
     */
    @Override
    public void dMethod() {
        System.out.println("Myinterface의 디폴드 메서드 오버라이딩한 메서드 호출");
    }

}
