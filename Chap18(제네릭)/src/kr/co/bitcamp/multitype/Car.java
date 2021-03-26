package kr.co.bitcamp.multitype;

public class Car {
    
    private String brand;
    private int year;
    private int month;
    
    public Car() {
        
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public Car(String brand, int year, int month) {
        super();
        this.brand = brand;
        this.year = year;
        this.month = month;
    }
    
    
    
    
}
