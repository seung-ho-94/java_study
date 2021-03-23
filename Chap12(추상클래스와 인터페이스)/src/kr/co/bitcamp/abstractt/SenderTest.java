package kr.co.bitcamp.abstractt;

public class SenderTest {
    public static void main(String[] args) {
        //추상클래스이니 절대 인스턴스를 생성할 수 없음
        //ContentSender contentSender = new contentSender("안녕","안녕하세요");
        
        //추상클래스도 조상이니까 필드의 다형성이 적용됨
        ContentSender contentSender = new KakaoSender("카카오톡", "임승호", "안녕 해피바이러스!");
        contentSender.sendMessage("여민구");
        
        System.out.println("--------------------------");
        
        
        ContentSender contentSender2 = new KakaoSender("sms", "박성광", "배부르다!");
        contentSender.sendMessage("여진구");
        
        
        
        
        
        
    }
}
