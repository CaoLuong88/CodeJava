/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai4a;

import java.util.Scanner;

/**
 *
 * @author FPT
 */
public class PTBacNhat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        float a, b, x;
        System.out.println("nhap a=");
        a = sc.nextFloat();
        System.out.println("nhap b=");
        b = sc.nextFloat();
        if (a != 0) {
            x = -b / a;
            System.out.println("nghiem pt x=" + x);
        } else if (a == 0) {
            if (b == 0) {
                System.out.println("pt vo so ngiem");
            } else if (b != 0) {
                System.out.println("pt vo nghiem");
            }
        }
    }

}
