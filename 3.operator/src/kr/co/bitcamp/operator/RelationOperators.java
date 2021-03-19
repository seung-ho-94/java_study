package kr.co.bitcamp.operator;
/*
 * 관계연산자에 대해서 설명해보시오.
 * 
 */
public class RelationOperators {
    public static void main(String[] args) {
        
        int kor = 70, eng = 40, math = 70;
        boolean result1, result2, result3, result4, result5, result6;
        
        result1 = kor == eng;
        result2 = kor != eng;
        result3 = kor > eng;
        result4 = kor >= math;
        result5 = kor < eng;
        result6 = kor <= math;
        
        System.out.println(result1+"\t"+result2+"\t"+result3+"\t"+result4+"\t"+result5+"\t"+result6+"\t");
    }
}
