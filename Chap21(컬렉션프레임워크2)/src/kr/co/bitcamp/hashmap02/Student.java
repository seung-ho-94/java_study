package kr.co.bitcamp.hashmap02;

import java.util.Objects;

public class Student {
    private int sno;         //학번
    private String name;    //이름
    public Student(int sno, String name) {
        super();
        this.sno = sno;
        this.name = name;
    }
    public int getSno() {
        return sno;
    }
    public String getName() {
        return name;
    }
    
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return Objects.hash(this.sno, this.name);
        
    }
    
    @Override
    public boolean equals(Object obj) {
        
        if(obj instanceof Student) {
            Student student = (Student)obj;
            return this.sno == student.sno && this.name.equals(student.name);
        } else {
            return false;
        }
    }
    
    
    
    
    
}
