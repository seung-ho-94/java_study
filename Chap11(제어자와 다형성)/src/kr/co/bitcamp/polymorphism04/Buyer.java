package kr.co.bitcamp.polymorphism04;

//상속관계는 아니지만 product 대상을 통해 행동을함
public class Buyer {
    int money = 1000;           //소유금액
    int bonusPoint = 0;         //보너스 점수
 
    //다형성 적용
//    public void buy(TV tv) {
//        if(this.money < tv.price) {
//            System.out.println("잔액이 부족하여 물건 구입이 안됩니다!");
//            return;
//        } else {
//            this.money -= tv.price;
//            this.bonusPoint += tv.bonusPoint;
//        }
//       
//    }
//    
//    //다형성 적용
//    public void buy(Audio audio) {
//        if(this.money < audio.price) {
//            System.out.println("잔액이 부족하여 물건 구입이 안됩니다!");
//            return;
//        } else {
//            this.money -= audio.price;
//            this.bonusPoint += audio.bonusPoint;
//        }
//       
//    }
//    
//    //다형성 적용
//    public void buy(Computer computer) {
//        if(this.money < computer.price) {
//            System.out.println("잔액이 부족하여 물건 구입이 안됩니다!");
//            return;
//        } else {
//            this.money -= computer.price;
//            this.bonusPoint += computer.bonusPoint;
//        }
//       
//    }

    //product이거나 product의 자손들은 다 올수 있다는 것을 의미함 (매개변수의 다형성)
    //부모객체를 통해서 이 부모객체를 상속받는 자식객체를 전부 불러올 수 있음
    public void buy(Product product) {
        if(this.money < product.price) {
            System.out.println("잔액이 부족하여 물건 구입이 안됩니다!");
            return;
        } else {
            this.money -= product.price;
            this.bonusPoint += product.bonusPoint;
        }
       
    }
    
    
}





















