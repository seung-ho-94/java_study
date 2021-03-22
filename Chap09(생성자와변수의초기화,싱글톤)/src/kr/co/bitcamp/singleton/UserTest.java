package kr.co.bitcamp.singleton;

import java.util.Calendar;
import java.util.Date;

public class UserTest {

    public static void main(String[] args) {
        
        // User user = new user(); // 만들 수 없음
        User user1 = User.getInstance();
        User user2 = User.getInstance();
        
        System.out.println("user1의 주소 : " + user1);
        System.out.println("user2의 주소 : " + user2);
        
        // Object 클래스의 equals() : 주소 비교
        if(user1.equals(user2)) {
            System.out.println("같은 객체입니다.");
        } else {
            System.out.println("다른 객체입니다.");
        }
        
        // 객체의 == 연산자 : 주소 비교 연산
        if(user1 == user2) {
            System.out.println("같은 객체입니다.");
        } else {
            System.out.println("다른 객체입니다.");
        }
        
        /*
         *  싱글톤 패턴 사용하는 이유
         *  : 단 하나의 인스턴스를 생성을 해서 서로 공유를 원하고자 할 때 사용
         *  ex) 커넥션풀, 스레드풀, OS의 시간이나 날짜 등
         */
        // 싱글톤 패턴을 사용하는 예
        // Calendar calendar = new Calendar(); // 만들 수 없음
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        System.out.println(date);
        
    }

}



















