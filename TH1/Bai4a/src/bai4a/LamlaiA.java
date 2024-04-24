/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4a;
import java.util.Scanner;
/**
 *
 * @author FPT
 */
public class LamlaiA {
    public static void main(String[] args) {
        Float a,b,x = null;
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap a=");
       a= sc.nextFloat();
        System.out.println("nhap b=");
        b=sc.nextFloat();
       if(a==0){
           if(b==0){
               System.out.println("pt vo so nghiem");
           }
           else
               System.out.println("pt vo nghiem");
           
       }else 
           x=-b/a;
               System.out.println("pt co nghiem x="+x);
    }
}
