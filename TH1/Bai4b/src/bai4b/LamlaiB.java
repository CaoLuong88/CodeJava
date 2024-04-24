/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4b;
import java.util.Scanner;
/**
 *
 * @author FPT
 */
public class LamlaiB {
    public static void main(String[] args) {
        float a,b,c,denta,x1,x2;
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap a=");
        a=sc.nextFloat();
        System.out.println("nhap b=");
        b=sc.nextFloat();
        System.out.println("nhap c= ");
        c=sc.nextFloat();
        if(a==0){
            if(b==0){
                if(c==0){
                    System.out.println("pt vo so nghiem");
                }else
                    System.out.println("pt vo nghiem");
            }else{
                x1=-c/b;
            System.out.println("nghiem pt"+x1);
            }
        }else{
           denta=b*b-4*a*c;
           if(denta<0) System.out.println("pt vo nghiem");
           if(denta==0){
               x1=-b/2*a;
               System.out.println("pt co nghiem kep"+x1);}
           if(denta>0){
        x1=(float) (-b - Math.sqrt(denta))/2*a;
                x2=(float)(-b + Math.sqrt(denta))/2*a;
        System.out.println("nghiem pt x1= "+x1+"x2= " +x2);
           }
        }
    }
}
