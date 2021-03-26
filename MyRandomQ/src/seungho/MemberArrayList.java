package seungho;
//Member클래스를 만들고 그 아이디와 이름을 멤버변수로 선언 (tostring)

//Member클래스로 생성된 인스턴스들을 관리하는 클래스를 컬렉션 프레임워크 클래스들을 활용하여 구현한다.
//어레이리스트로 멤버를 순차적으로 관리

import java.util.ArrayList;
import java.util.Scanner;

//<MemberArrayList.java>
//ArrayList에 멤버추가 기능
//멤버삭제하는 기능
//모든 멤버를 보여주는 기능

//<MemberArrayListTest.java>
//MemberArrayList 객체생성

public class MemberArrayList {

    public void addMember(ArrayList<Member> list) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Member를 추가 하시겠습니까?");
            System.out.print("1: YES | 2:NO => ");
            int num = scanner.nextInt();

            if (num == 1) {
                System.out.print("id : ");
                String str1 = scanner.next();
                System.out.print("name : ");
                String str2 = scanner.next();
                list.add(new Member(str1, str2));

            } else {
                break;
            }

        }
    }

    public void delMember(ArrayList<Member> list) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Member를 삭제 하시겠습니까?");
            System.out.print("1: YES | 2:NO => ");
            int num = scanner.nextInt();

            if (num == 1) {
                System.out.print("id : ");
                String str = scanner.next();
                for (int i = 0; i < list.size(); i++) {
                    if (str.equals(list.get(i).getId())) {
                        list.remove(list.get(i));
                    } else {
                        System.out.println("아이디를 확인해주세요");
                    }
                }
            } else {
                break;
            }

        }
    }

//    public static void print(ArrayList<Member> list) {
//        System.out.println("======================================");
//        System.out.println("================멤버 목록================");
//        System.out.println("list : " + list.toString());
//        System.out.println("======================================");
//        System.out.println();
//    }
}




















