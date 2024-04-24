/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai7;

/**
 *
 * @author FPT
 */import java.util.Scanner;
public class Bai7 {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhắc người dùng nhập số giây
        System.out.print("Nhập tổng số giây: ");

        // Đọc số nguyên từ bàn phím
        int totalSeconds = scanner.nextInt();

        // Tính toán số giờ, phút và giây
        int hours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;

        // Hiển thị kết quả
        System.out.printf("%d giây = %d giờ, %d phút và %d giây", totalSeconds, hours, minutes, seconds);
    }
}

