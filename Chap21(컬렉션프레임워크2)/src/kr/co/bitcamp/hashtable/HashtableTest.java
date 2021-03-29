package kr.co.bitcamp.hashtable;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableTest {
    public static void main(String[] args) {
        /*
         * HashMap : 신버전
         * HashTable : 구버전
         * 기능은 동일
         */
        
        Map<String, String> map = new Hashtable<>();
        //객체추가
        map.put("Spring", "5.3.5");
        map.put("SpringBoot", "2.4.4");
        map.put("SpringTools", "4.10.0");
        map.put("Spring2", "5.3.1");
        System.out.println("총 Entry 수 : " + map.size());
        
        int count = 0; //비밀번호 틀린횟수
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            System.out.println("아이디와 비밀번호를 입력하세요");
            System.out.print("아이디 : ");
            String id = scanner.nextLine();
            
            System.out.print("비밀번호 : ");
            String password = scanner.nextLine();
            System.out.println();
            
            //저장되어 있는 객체를 검색하여(일종의 DB라고 생각)
            //아이디와 비밀번호가 일치하여 로그인 성공
            
            if(map.containsKey(id)) {
                //id 즉, 키를 주고 얻어오는 값은 password
                //같다면 로그인 성공, 아니면 비밀번호가 불일치된다
                //단, 틀린횟수 1증가됨
                if(map.get(id).equals(password)) {
                    System.out.println(id+"님이 로그인 되었습니다.");
                    break;
                    
                } else {
                    count++;
                    System.out.println("비밀번호가 " + count + "회 틀렸습니다.");
                    if(count == 3) {
                        System.out.println("지점 방문 부탁드립니다.");
                        break;
                    }
                }
                
            } else {
                System.out.println("아이디가 존재하지 않습니다.");
            }
            
            
        }
 
        scanner.close();
        
    }
}
