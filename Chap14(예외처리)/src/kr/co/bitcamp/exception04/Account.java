package kr.co.bitcamp.exception04;

public class Account {
    
    private long balance;
    
    public Account() {
        
    }
    
    //현재잔액 가져오기
    public long getBalance() {
        return this.balance;
    }
    
    //입금하기
    public void deposite(int money) {
        this.balance += money;
    }
    
    //출금하기 + 예외처리까지
    public void withdraw(int money) throws BalanceException {
        if(this.balance < money) {  //내가 가진 잔액보다 입금할 금액이 크면 안되기 때문에
            throw new BalanceException("잔액부족");     //예외를 발생시킨다.
        }
        this.balance -= money;
    }
}
