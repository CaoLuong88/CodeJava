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
public class GioPhutGiay {
    public static void main(String[] args) {
        // TODO code application logic here
        int total_s=0, h=0, m=0, s=0;
          System.out.println("Moi ban nhap tong so giay (s):");
        Scanner input = new Scanner(System.in);
        total_s = input.nextInt();
        h = total_s / 3600;
        m = (total_s - (h*3600)) / 60;
        s = total_s - h*3600 - m*60;
        
        System.err.println(total_s + " seconds = " + h + " hours, " + 
                m + " minutes, and "+ s + " seconds.");
    }
}
