/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai5b;

/**
 *
 * @author FPT
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class QLSinhVien {
    private String hoTen;
    private double diem;

    public QLSinhVien(String hoTen, double diem) {
        this.hoTen = hoTen;
        this.diem = diem;
    }

    public String getHoTen() {
        return hoTen;
    }

    public double getDiem() {
        return diem;
    }

    public String toString() {
        return "Họ tên: " + hoTen + ", Điểm: " + diem;
    }
}

public class SinhVien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<QLSinhVien> danhSachSinhVien = new ArrayList<>();

        // Nhập thông tin cho danh sách sinh viên
        System.out.print("Nhập số lượng sinh viên: ");
        int soLuongSV = scanner.nextInt();
        scanner.nextLine(); // Đọc ký tự xuống dòng

        for (int i = 0; i < soLuongSV; i++) {
            System.out.println("Nhập thông tin cho sinh viên thứ " + (i + 1) + ":");
            System.out.print("Họ tên: ");
            String hoTen = scanner.nextLine();
            System.out.print("Điểm: ");
            double diem = scanner.nextDouble();
            scanner.nextLine(); // Đọc ký tự xuống dòng

            danhSachSinhVien.add(new QLSinhVien(hoTen, diem));
        }

        // Xuất dữ liệu đã nhập
        System.out.println("\nDữ liệu sinh viên đã nhập:");
        for (QLSinhVien sv : danhSachSinhVien) {
            System.out.println(sv);
        }

        // Sắp xếp danh sách sinh viên theo điểm tăng dần
        Collections.sort(danhSachSinhVien, Comparator.comparing(QLSinhVien::getDiem));

        // Xuất danh sách sinh viên sau khi sắp xếp
        System.out.println("\nDữ liệu sinh viên sau khi sắp xếp theo điểm:");
        for (QLSinhVien sv : danhSachSinhVien) {
            System.out.println(sv);
        }
    }
}

