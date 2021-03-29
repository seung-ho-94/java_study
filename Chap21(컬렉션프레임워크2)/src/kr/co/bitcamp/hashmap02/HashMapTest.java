package kr.co.bitcamp.hashmap02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        Map<Student, Integer> map = new HashMap<>();
        
        //키 객체가 동등객체라면 중복 저장하지 않음.
        map.put(new Student(1001, "최지만"), 95);
        map.put(new Student(1001, "최지만"), 90);
        map.put(new Student(2001, "류현진"), 100);
        map.put(new Student(3001, "추신수"), 80);
        
        System.out.println("총 Entry 수 : " + map.size());  //key객체의 중복은 허용하지 않음.
        
        //뒤에 저장된 것으로 대체된다.
        System.out.println("최지만 : "+ map.get(new Student(1001, "최지만")));
        
        //map컬렉션에 있는 key값만 만들어 Set계열로 바꾼다.
        Set<Student> keySet = map.keySet();
        
        Iterator<Student> keyIterator = keySet.iterator();
        
        //반복자 얻기
        while(keyIterator.hasNext()) {
            Student key = keyIterator.next();
          
            System.out.println("학번 : " + key.getSno() +
                                " 이름 : " + key.getName() +
                                " 점수 : " + map.get(new Student(key.getSno(), key.getName())));
        }
        
        
    }
}