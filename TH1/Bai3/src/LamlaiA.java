/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author FPT
 */
public class LamlaiA {
    public static void main(String[] args) {
        Float a,b,chuVi,dienTich;
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap a=");
        a=sc.nextFloat();
        System.out.println("nhap b=");
        b=sc.nextFloat();
        chuVi=(a+b)*2;
        System.out.println("chu vi la: "+chuVi);
        dienTich=a*b;
        System.out.println("dien tich: "+dienTich);
    }
}
