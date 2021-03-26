package seungho;

public class Member {
    String id;
    String name;
    
    public Member(String id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "id : " + this.id + ", name : " + this.name;
    }
    
    
}
