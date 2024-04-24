/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5a;
import java.util.Scanner;
/**
 *
 * @author FPT
 */
public class LamlaiA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] daySo  =new int [100];
        int n,i;
        do{ 
            System.out.println("nhap n=");
            n=sc.nextInt();
        }while(n<0 || n>100);
        int j=1;
        for(i=0;i<n;i++){
        System.out.println("nhap phan tu thu "+ i +" =");
//         j++;
        daySo[i]=sc.nextInt();
        }   
        System.out.print("day vua nhap:" );
        for( i=0;i<n;i++){
            System.out.print(+daySo[i] +" ");
        }
        int t;
        for(i=0;i<n-1;i++){
            for(int k=i;k<n;k++){
                if(daySo[i]>daySo[k]){
                    t=daySo[i];
                    daySo[i]=daySo[k];
                    daySo[k]=t;
                }
            }
        }
        System.out.print("day sx la: ");
        for(i=0;i<n;i++){
            System.out.print(" "+daySo[i]);
        }
    }
}
