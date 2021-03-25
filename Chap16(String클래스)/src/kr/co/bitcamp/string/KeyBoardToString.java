package kr.co.bitcamp.string;

import java.io.IOException;

public class KeyBoardToString {
    public static void main(String[] args) {
        
        byte[] bytes = new byte[100];
        System.out.print("입력 : ");
        int readBytesNo = 0;
        
        try {
            //키보드(표준입력)로부터 입력을 받고 그 내용을 bytes에 저장을 하고 입력받아 바이트수를 리턴함
            readBytesNo = System.in.read(bytes);
            
            //문자셋 UTF-8으로 디코딩
            String str = new String(bytes, 0, readBytesNo-2, "UTF-8");
            System.out.println(str);
            
            System.out.println("입력받은 바이트 수 : " + readBytesNo);
            
            //euc-kr : 한글 2byte | utf-8 : 한글 3byte
            byte[] b = str.getBytes("utf-8");
            System.out.println(b.length);
            
            //인코딩과 디코딩의 과정에서 반드시 문자셋은 동일하게 가져가야 글자가
            //깨지거나 하는 오류를 방지할 수 있다
            byte[] b2 = "안녕하세요".getBytes();
            String str1 = new String(b2, 0, b2.length, "UTF-8");
            System.out.println(str1);
            System.out.println(b2.length);
            
            
            
            
        } catch (IOException e) {
            // TODO Auto-generated catch block
           // e.printStackTrace();
        }
        
        
        
        
        
        
    }
}
