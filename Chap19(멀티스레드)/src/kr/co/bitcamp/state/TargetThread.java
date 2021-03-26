package kr.co.bitcamp.state;

//스레드의 상태
public class TargetThread extends Thread {
    
    @Override
    public void run() {
        
        //20억번 루핌, 실행->실행대기->실행
        for(long i=0; i< 2000000000; i++ ) {
        }
            //일시정지(TIMED_WAIITING)
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
               System.out.println(e.getMessage());
            }
              
            
        //20억번 루핌, 실행->실행대기->실행
        for(long i=0; i< 2000000000; i++ ) {
                
        }
        
        
    }
    
    
}
