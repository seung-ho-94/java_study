package kr.co.bitcamp.overloading;

class A{
    int data1 = 10;
    int data2 = 20;
}



public class AccumulatorTest {
    
    public static void main(String[] args) {
        Accumulator accum = new Accumulator();
        int iResult = accum.add(5, 2);
        System.out.println("iResult : "+ iResult);
        
        
        long lResult = accum.add(100, 7500L);         //접미사 반드시 붙이도록 함.
        System.out.println("lResult : "+ lResult);
        
         
        lResult = accum.add(1000L, 10);
        System.out.println("lResult : "+ lResult);
        
        
        double dResult = accum.add(107.88, 11.55);
        System.out.println("dResult : "+ dResult);

        
        long aResult= accum.add(new int[] {1,2,3,4,5});
        System.out.println("aResult : "+ aResult);

        
        int iResult2 = accum.add(new A());
        System.out.println("iResult : " + iResult2);
    }
}
