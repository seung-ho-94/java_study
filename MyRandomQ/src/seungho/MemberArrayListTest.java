package seungho;

import java.util.ArrayList;

public class MemberArrayListTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayList<Member> list = new ArrayList<Member>();
        MemberArrayList arrayList = new MemberArrayList();
        
        arrayList.addMember(list);
        System.out.println(list.toString());
        arrayList.delMember(list);
        System.out.println(list.toString());


        
    }

}
