package kr.co.bitcamp.staticvariable2;

public class MemberTest {
    
    public void study() {
        System.out.println("자바 개발자가 필요합니다.");
    }
    
    public void MemberMethod() {
        System.out.println("인스턴스 메서드");
    }
    
    
    public static void main(String[] args) {
        //static 멤버들이므로 인스턴스 생성없이 얼마든지 클래스명, 정적멤버명으로 접근이 가능하다
        Member.sMethod();
        Member.cv = 500;
        Member.sMethod();
        
        //
        Member member = new Member();
        member.imethod();
        member.iv = 999;
        member.imethod();
        
        MemberTest mem = new MemberTest();
        mem.MemberMethod();
        mem.study();
        
        
    }
}
