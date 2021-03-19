package kr.co.bitcamp.environment;

import java.util.Scanner;

public class Test {
    static final int rice_PRICE = 10000;
    
    static final int noodle_PRICE = 4000;
     
    static final int firedFood_PRICE = 3000;
     
    static final int drink_PIRCE = 4000;
     
     public static void main(String[] args) {
     
        Scanner scan = new Scanner(System.in);
     
        int riceCount = 0;
     
        int noodleCount = 0;
     
        int firedFoodCount = 0;
     
        int drinkCount = 0;
        
        int sum =0;
    
    
        while(true) {
         
           System.out.println("안녕하세요 밥집입니다");
           System.out.println("메뉴를 선택해주세요");
           System.out.println("==========================");
           System.out.println("1.밥 2.라면 3.튀김 4.소주");
           System.out.println("==========================");
           System.out.println("주문하실 메뉴의 번호를 선택해주세요 : ");
         
           int foodChoice = scan.nextInt();
         
         
         if(!(foodChoice <1 || foodChoice > 4)) { //1)foodChoice가 0보다 작거나 4보다 큰게 아니면
             System.out.print("원하시는 수량을 입력해주세요 :"); //2-1)정상적으로 수량을 입력받을 수 있다.
             
             int count = scan.nextInt();
             
           switch(foodChoice) {
         
           case 1:
            riceCount += count;
             break;
         
           case 2:
            noodleCount += count;
             break;
         
           case 3:
            firedFoodCount += count;
         
           case 4:
            drinkCount += count;
             break;
             
           }
           sum = riceCount+noodleCount+firedFoodCount+drinkCount;
         }else {
               System.out.println("다시 입력해주세요.");    //2-2)범위가 아니면 에러메세지
           }
         
         System.out.print("1.계속 주문하기 2.결제하기 : ");
         int num2 = scan.nextInt();
         if(num2 == 2) {
             //가격출력
             System.out.println(sum);
             
             break;
         }
         
         
         }//while
         
          
           /*
           int foodChoice1 = scan.nextInt();
        
           
           if(foodChoice1 == 2) {
           
              break;
         
           } else if(foodChoice1 == 1) {
           }
         } else(foodChoice1 < 3) {
             System.out.print("잘못 입력하셨습니다");
         }
     }
        System.out.print("주문하신 음식의 금액은 ");
     
        System.out.print( riceCount * rice_PRICE + noodleCount * noodle_PRICE +
                       firedFoodCount * firedFood_PRICE + drinkCount * drink_PIRCE + "원 입니다");
     */
        }
}




