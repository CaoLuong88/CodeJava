/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai6;
  import java.util.Scanner;
/**
 *
 * @author FPT
 */
public class Bai6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhắc người dùng nhập dữ liệu
        System.out.print("Nhập nhiệt độ Celsius: ");
        
        // Đọc giá trị từ bàn phím
        double celsius = scanner.nextDouble();

        // Tính độ Fahrenheit
        double fahrenheit = celsius * 9 / 5 + 32;

        // Hiển thị kết quả với định dạng chữ số thập phân
        System.out.printf("%.1f C = %.1f F ", celsius, fahrenheit);
    }
}


