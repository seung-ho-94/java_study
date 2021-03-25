package kr.co.bitcamp.exception04;
//입금하고 잔액이 부족하면 예외처리시키기
public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposite(50000);
        System.out.println("현재 잔액 : "+ account.getBalance());
        
        try {
            /*
             * withdrow()에서 예외를 던지고 있으니 이를 호출하는 곳에서는 
             * 예외처리코드가 반드시 들어가야함
             */
           
            account.withdraw(51000);            //10000원 입금
            System.out.println("현재 잔액 : " + account.getBalance());      //현재금액
        } catch (BalanceException e) {
            
            System.out.println("예외 원인 : " + e.getMessage());    //입금한 금액이 현재금액보다 클경우
                                                                 //메세지 출력   
            //e.printStackTrace();
        } finally {
            System.out.println("정상 종료");
        }
        
        
    }
}
