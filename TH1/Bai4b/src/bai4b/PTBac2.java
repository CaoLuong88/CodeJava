/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai4b;
import java.util.Scanner;
/**
 *
 * @author FPT
 */
public class PTBac2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        float a,b,c,x1,x2,delta;
        System.out.println("nhap a=");
        a=sc.nextFloat();
        System.out.println("nhap b=");
        b=sc.nextFloat();
        System.out.println("nhap c=");
        c=sc.nextFloat();
        if(a==0){
            if(b==0){
                if(c==0){
                    System.out.println("pt vo so nghiem");
                }
                if(c!=0){
                    System.out.println("pt vo nghiem");
                }
            }
        }
        else{
            delta=b*b-4*a*c;
            if(delta<0){
                System.out.println("pt vo nghiem");
            }
            if(delta==0){
                x1=-b/(2*a);
                System.out.println("pt co 1 nghiem x1="+x1);
            }
            else{
                x1= (float) ((-b-Math.sqrt(delta))/(2*a));
                x2= (float) (-b+Math.sqrt(delta))/2*a;
                System.out.println("pt co 2 nghiem x1="+x1+" x2="+x2);
            }
        }
    }
    
}
