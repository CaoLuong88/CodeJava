/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai5a;
import java.util.Scanner;
/**
 *
 * @author FPT
 */
public class Mang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n;
        int [] dayso=new int[100];
        do{
            System.out.print("nhap n (0<n<100):n=");
            n=sc.nextInt();
        }while(n<0||n>100);
        int j=1;
        for(int i=0;i<n;i++){
            System.out.print("nhap phan tu thu "+j+"=");
            j++;
            dayso[i]=sc.nextInt();
        }
        System.out.print("day so vua nhap :");
        for(int i=0;i<n;i++){
            System.out.print(dayso[i]+ " ");
        }
        int tg;
        for(int i=0;i<n-1;i++){
            for(int k=i;k<n;k++){
                if(dayso[i]>dayso[k]){
                    tg=dayso[i];
                    dayso[i]=dayso[k];
                    dayso[k]=tg;
                }
            }
        }
        System.out.println("\nday so duoc sap xep lai nhu sau:");
        for(int i=0;i<n;i++){
            System.out.print( dayso[i]+" ");
        }
        // Tính trung bình cộng các phần tử chia hết cho 3
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (dayso[i] % 3 == 0) {
                sum += dayso[i];
                count++;
            }
        }
        // Kiểm tra nếu không có phần tử nào chia hết cho 3
        if (count == 0) {
            System.out.println("\nKhông có phần tử nào chia hết cho 3 trong mảng.");
        } else {
            double average = (double) sum / count;
            System.out.println("\nTrung bình cộng của các phần tử chia hết cho 3 trong mảng là: " + average);
        }
    }
    
}
