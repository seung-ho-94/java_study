package kr.co.bitcamp.equals;

public class StudentTest {
    public static void main(String[] args) {
        
//        Student student1 = new Student(20, "승호");
//        Student student2 = new Student(20, "승호dla");
//        
//        System.out.println(student1.equals(student2));
        
//        Student student3 = new Student(20, "승호");
//        Student student4 = new Student(20, "승호");
//        
//        System.out.println(student3.equals(student4));
        
        Student student3 = new Student(1, "승호", new int[] {1,2,3});
        Student student4 = new Student(1, "승호", new int[] {1,2,3});

        System.out.println(student3.equals(student4));
        
        
        
        
    }
}
