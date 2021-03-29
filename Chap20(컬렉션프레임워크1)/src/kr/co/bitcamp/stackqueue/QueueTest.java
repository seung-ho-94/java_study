package kr.co.bitcamp.stackqueue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

    public static void main(String[] args) {

        Queue<Message> queue = new LinkedList<>();
        queue.offer(new Message("sendMail", "최지만"));
        queue.offer(new Message("sendSMS", "류현진"));
        queue.offer(new Message("sendKakaotalk", "추신수"));
        queue.offer(new Message("sendFaceBook", "박찬호"));
        
        System.out.println("======꺼내기======");
        while(!queue.isEmpty()) {
            Message message = queue.poll();
            System.out.println(queue.size());
            
            
            switch(message.getCommend()) {
            case "sendMail":
                System.out.println(message.getTo() + "에게 메일을 보냅니다.");
                break;
            case "sendSMS":
                System.out.println(message.getTo() + "에게 SMS을 보냅니다.");
                break;
            case "sendKakaotalk":
                System.out.println(message.getTo() + "에게 카카오톡을 보냅니다.");
                break;
            case "sendFaceBook":
                System.out.println(message.getTo() + "에게 페이스북 메시지을 보냅니다.");
                break;
                
            }
            
            
            
        }
        
    }

}
