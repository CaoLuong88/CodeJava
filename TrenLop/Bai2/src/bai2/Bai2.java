/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai2;
import java.util.Scanner;
/**
 *
 * @author FPT
 */
public class Bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều cao của cây thông Noel: ");
        int n = scanner.nextInt();

        // Vẽ cây thông Noel
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" "); // In ra khoảng trắng để dịch sang phải
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*"); // In ra dấu sao (*)
            }
            System.out.println(); // Xuống dòng
        }

        // Vẽ thân cây
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n - 1; j++) {
                System.out.print(" "); // In ra khoảng trắng để căn giữa
            }
            System.out.println("*"); // In ra thân cây
        }
    }
}

