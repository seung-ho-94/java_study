package kr.co.bitcamp.polymorphism04;
//상속하면 빨간줄이 뜨는건 생성자가 없어서이다.
//1) 상속해주는 클래스의 생성자를 호출하거나
//2) 생성자를 만들면 된다.
public class TV extends Product {

    public TV() {           //1)조상클래스의 매개변수가있는 Product(int price) 생성자 호출
        super(300);
    }
    
    @Override
    public String toString() {  //값을 확인하기 위해 오버라이딩      
        return "TV";
    }
}
