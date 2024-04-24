/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai6;

/**
 *
 * @author FPT
 */
import java.util.Scanner;

class CN {
    private double chieuRong;
    private double chieuDai;

    public CN(double chieuRong, double chieuDai) {
        this.chieuRong = chieuRong;
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public double getChuVi() {
        return 2 * (chieuRong + chieuDai);
    }

    public double getDienTich() {
        return chieuRong * chieuDai;
    }

    public void xuat() {
        System.out.println("Chiều rộng: " + chieuRong);
        System.out.println("Chiều dài: " + chieuDai);
        System.out.println("Diện tích: " + getDienTich());
        System.out.println("Chu vi: " + getChuVi());
    }
}

public class chuNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
        double chieuRong = scanner.nextDouble();

        System.out.print("Nhập chiều dài của hình chữ nhật: ");
        double chieuDai = scanner.nextDouble();

        CN hinhChuNhat = new CN(chieuRong, chieuDai);

        System.out.println("\nThông tin về hình chữ nhật:");
        hinhChuNhat.xuat();
    }
}

