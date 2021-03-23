package kr.co.bitcamp.polymorphism05;

import java.util.Scanner;

public class ProductTest {
    
    static int productId = 0;
    static int numberOfProduct = 0;
    static Product[] product = new Product[10];
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int choice = 0;
        
        while(choice != 3) {
            int type = 0;
            System.out.println("-------------상품조회, 추가프로그램-------------");
            System.out.print("1번:상품추가 / 2번:상품조회 / 3번:끝내기  => ");
            choice = scanner.nextInt();
            
            switch(choice) {
            case 1:
                //상품추가
                if(numberOfProduct >= product.length) {
                    System.out.println("더 이상 상품추가 불가");
                    break;
                }
                System.out.print("1번:책 / 2번:음악CD / 3번:회화책  => ");
                type = scanner.nextInt();
                if(type < 1 || type >3) {
                    System.out.println("잘못 입력하셨습니다.");
                    break;
                }
                addProduct(type);
                break;
                
            case 2:
                //상품조회
                for(int i=0; i<numberOfProduct; i++) {
                    product[i].showInfo();
                }
                break;
                
            case 3:
                System.out.println("프로그램 종료");
                break;
                }//switch             
            }//while
        }//main
    
    public static void addProduct(int type) {
        scanner.nextLine();                         //버퍼비우기
        System.out.print("상품설명 => ");
        String desc = scanner.nextLine();
        System.out.print("생산자 => ");
        String maker = scanner.nextLine();
        System.out.print("상품가격 => ");
        int price = scanner.nextInt();
        
        scanner.nextLine();
        switch(type) {
        case 1:
            System.out.print("일반책 제목 => ");
            String title = scanner.nextLine();
            System.out.print("저자 => ");
            String author = scanner.nextLine();
            System.out.print("국제표준도서번호 => ");
            int ISBN = scanner.nextInt();
        
            //필드의 다형성(조상타입의 배열에 자손의 인스턴스를 담고있음)
            product[numberOfProduct] = new Book(productId, desc, maker, price, ISBN, title, author);
            break;
            
        case 2:
            System.out.print("앨범제목 => ");
            String albumTitle = scanner.nextLine();
            System.out.print("가수 => ");
            String artist = scanner.nextLine();
            
            //필드의 다형성(조상타입의 배열에 자손의 인스턴스를 담고있음)
            product[numberOfProduct] = new CompactDisc(productId++, desc, maker, price, albumTitle, artist);
            break;
            
        case 3:
            System.out.print("회화책 제목 => ");
            String title2 = scanner.nextLine();
            System.out.print("저자 => ");
            String author2 = scanner.nextLine();
            System.out.print("언어 => ");
            String language = scanner.nextLine();
            System.out.print("ISBN => ");
            int ISBN2 = scanner.nextInt();
            
            //필드의 다형성(조상타입의 배열에 자손의 인스턴스를 담고있음)
            product[numberOfProduct] = new ConversionBook(productId++, desc, maker, price, ISBN2, title2, author2, language);
            break;
        }
        numberOfProduct++;
    }
        
        
    }












































