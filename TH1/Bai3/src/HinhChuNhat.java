/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author FPT
 */
public class HinhChuNhat {
    public static void main(String[] args){
        Float dai,rong,chuvi,dientich,canh;
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap chiu dai:");
        dai=sc.nextFloat();
        System.out.println("nhap chiu rong:");
        rong=sc.nextFloat();
        chuvi=(dai+rong)*2;
        dientich=dai*rong;
        System.out.println("chu vi:"+chuvi);
        System.out.println("dien tich:"+dientich);
        System.out.println("nhap canh hinh vuong");
        canh=sc.nextFloat();
        chuvi= 4*canh;
        System.out.println("chu vi hinh vuong:"+chuvi);
        dientich=canh*canh;
        System.out.println("dien tich:"+dientich);
        
    }
    
}
