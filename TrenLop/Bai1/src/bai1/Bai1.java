/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai1;

/**
 *
 * @author FPT
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        double d = 100.04;  
        long l = (long) d;    // chuyển từ kiểu dữ liệu double về kiểu long 
        int i = (int) l;      // chuyển từ kiểu dữ liệu long về kiểu int
        System.out.println("Giá trị biến d = " + d);
        System.out.println("Giá trị biến l = " + l);
        System.out.println("Giá trị kiểu i = " + i);
        int height = 6;
        double mass = 220.23456;
         
        // IMPLICIT CASTING
        double result = height;
        System.out.println("Giá trị của biến result sau khi ép kiểu = " + result);  // 6.0
         
        // EXPLICIT CASTING
        int massVal = (int) mass;
        System.out.println("Giá trị biến massValue sau khi ép kiểu = " + massVal);  // 220
         int localVariable1 = 19;        // đây là biến cục bộ
        float localVariable2 = 5.4f;    // đây là biến cục bộ
        System.out.println("Giá trị của biến localVariable1 = " + localVariable1);
        System.out.println("Giá trị của biến localVariable2 = " + localVariable2);
        Bai1 localVariableError = new Bai1();
        localVariableError.getInput();
        System.out.println("Một ngày có " + HOUR_OF_DAY + " giờ");
        System.out.println(CHUOI);
    }
            public void getInput() {
        String name= "luong";
        System.out.println("Your name is: " + name);
        
    }
            public static final int HOUR_OF_DAY = 24;
    public static final String CHUOI = "Hello Freetuts!";
    
}
