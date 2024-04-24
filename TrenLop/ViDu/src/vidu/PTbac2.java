/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vidu;

import java.util.Scanner;

/**
 *
 * @author FPT
 */
public class PTbac2 {
    public static void Giai_HPTB2(){
        System.out.println("Ham giai HPT Bac 2");
    }
     public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("1. He PT Bac 2 \n2. PT Bac 2 \n3. Thoat");
        System.out.println("Xin moi ban chon:");
        byte a;
        Scanner s = new Scanner(System.in);
        do{
            a = s.nextByte();
            switch(a){
                case 1: Giai_HPTB2();break;
                case 2: System.out.println("Ban da chon menu 2");break;
                case 3: System.out.println("Ban da chon menu 3");break;
                default: System.out.println("Lua chon khong hop le");
            }
            
        }while((a>=1) || (a<=3));
           s.close();
    }
}
