/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai6;

/**
 *
 * @author FPT
 */
import java.util.ArrayList;
import java.util.Scanner;

class SanPham {
    private String ten;
    private double gia;
    private String hang;

    public SanPham(String ten, double gia, String hang) {
        this.ten = ten;
        this.gia = gia;
        this.hang = hang;
    }

    public String getTen() {
        return ten;
    }

    public double getGia() {
        return gia;
    }

    public String getHang() {
        return hang;
    }

    public String toString() {
        return "Tên: " + ten + ", Giá: " + gia + ", Hãng: " + hang;
    }
}

public class QuanLySanPham {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<SanPham> danhSachSanPham = new ArrayList<>();

        // Nhập thông tin cho danh sách sản phẩm
        for (int i = 0; i < 2; i++) {
            System.out.println("Nhập thông tin cho sản phẩm thứ " + (i + 1) + ":");
            System.out.print("Tên sản phẩm: ");
            String ten = scanner.nextLine();
            System.out.print("Giá sản phẩm: ");
            double gia = scanner.nextDouble();
            scanner.nextLine(); // Đọc ký tự xuống dòng
            System.out.print("Hãng sản phẩm: ");
            String hang = scanner.nextLine();

            danhSachSanPham.add(new SanPham(ten, gia, hang));
        }

        // Xuất thông tin các sản phẩm có hãng là Nokia
        System.out.println("\nThông tin các sản phẩm có hãng là Nokia:");
        for (SanPham sp : danhSachSanPham) {
            if (sp.getHang().equalsIgnoreCase("Nokia")) {
                System.out.println(sp);
            }
        }
    }
}

