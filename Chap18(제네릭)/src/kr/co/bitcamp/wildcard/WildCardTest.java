package kr.co.bitcamp.wildcard;

import java.util.Arrays;


public class WildCardTest {

    //정적메서드 -- ?는 어떠한 객체도 다 받겠다.
    public static void registerCourse(Course<?> course) {
        System.out.println(course.getName() +" 수강생 : "+
                            Arrays.toString(course.getStudent()));
    }
    
    //하위타입
    //Student이거나 Student를 상속 받는 클래스 (상위타입 제한)
    public static void registerCourseStudent(Course<? extends Student> course) {
        System.out.println(course.getName() +" 수강생 : "+
                Arrays.toString(course.getStudent()));
    }
    
    //상위타입
    //Worker클래스이거나 그 상위클래스들만 들어올 수 있다.(하위타입 제한)
    public static void registerCouseWorker(Course<? super Worker> course) {
        System.out.println(course.getName() +" 수강생 : "+
                Arrays.toString(course.getStudent()));
    }
    
    
    
    public static void main(String[] args) {
        registerCourse(new Course<Person>("일반인 과정", 5));
        registerCourse(new Course<Student>("학생 과정", 10));
        registerCourse(new Course<Worker>("직장인 과정", 8));
        registerCourse(new Course<HighStudent>("고등학생 과정", 7));
        //registerCourse(new Object());    //Course타입만 가능함.
        System.out.println();
        
        //Student를 상속받은 하위타입만 가능
        //registerCourseStudent(new Course<Person>("일반인과정", 5));     //에러,부모타입이라 안됨
        registerCourseStudent(new Course<Student>("학생 과정", 10));
        //registerCourseStudent(new Course<Worker>("직장인과정", 8));     //에러
        registerCourseStudent(new Course<HighStudent>("고등학생 과정", 7));
        System.out.println();
        
        //상위타입만 가능
        registerCouseWorker(new Course<Person>("일반인 과정", 5) );
        //registerCouseWorker(new Course<Student>("학생 과정", 10) );     //에러
        registerCouseWorker(new Course<Worker>("직장인 과정", 8) );
        //registerCouseWorker(new Course<HighStudent>("고등학생과정", 7));  //에러
        System.out.println("\n---------------------------------------\n");
        
        //직접 Course를 생성해서 확인
        Course<Person> pCourse = new Course<Person>("일반인 과정", 3);
        pCourse.add(new Person("일반인"));
        pCourse.add(new Person("직장인"));
        pCourse.add(new Person("학생"));
        pCourse.add(new Person("고등학생"));      
        
        registerCourse(pCourse);
        registerCouseWorker(pCourse);
        //registerCourseStudent(pCourse);      //Student를 상속받는 클래스만 올 수 있는데, 조상타입이므로 에러남.
        System.out.println("\n---------------------------------------\n");        
        
        Course<Worker> wCourse = new Course<Worker>("직장인 과정", 3);
        wCourse.add(new Worker("김대리"));
        wCourse.add(new Worker("박과장"));
        wCourse.add(new Worker("김차장"));
        
        registerCourse(wCourse);
        registerCouseWorker(wCourse);
        //registerCourseStudent(wCourse);    //Student 상속받는 클래스만 올 수 있는데, worker는 아무런 관계가 없는 클래스이므로 에러남.
        System.out.println("\n---------------------------------------\n");
        
        Course<Student> sCourse = new Course<>("학생 과정", 3);
        sCourse.add(new Student("이순신"));
        sCourse.add(new Student("이방원"));
        sCourse.add(new Student("이도"));
        
        registerCourse(sCourse);
        registerCourseStudent(sCourse);
    }
}



























