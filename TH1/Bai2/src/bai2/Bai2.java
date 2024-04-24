/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai2;
import java.util.Scanner;
/**
 *
 * @author FPT
 */
public class Bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String hoTen;
        float diemTB=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap ho ten:");
        hoTen=sc.next();
        System.out.println("nhap diem tb:");
        diemTB=sc.nextFloat();
        System.out.println("thong tin \n"+"ho ten:"+ hoTen +"\n"+"diem tb:"+diemTB);
    }
    
}
