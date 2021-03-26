package kr.co.bitcamp.wildcard;

public class Course<T>{
    private String name;
    private T[] student;
    
    // 생성자 : 아직 T타입이 결정되지 않았기 때문에 두번째 파라미터는 사이즈로 정의함.
    
    public Course(String name, int size) {
        this.name = name;
        this.student = (T[])new Object[size];
    }
    
    public void add(T t) {
        for(int i=0; i<this.student.length; i++) {
            if(student[i] == null) {
                student[i] = t;
            }
        }
    }

    public String getName() {
        return name;
    }

    public T[] getStudent() {
        return student;
    }

    
}
