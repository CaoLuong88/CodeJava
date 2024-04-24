/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai6_6;

/**
 *
 * @author FPT
 */
import java.util.Scanner;

class SinhVien {
    private String hoTen;
    private String nganh;
    private double diem;

    public SinhVien(String hoTen, String nganh, double diem) {
        this.hoTen = hoTen;
        this.nganh = nganh;
        this.diem = diem;
    }

    public double getDiem() {
        return diem;
    }

    public String getHocLuc() {
        if (diem >= 9.0) {
            return "Xuất sắc";
        } else if (diem >= 8.0) {
            return "Giỏi";
        } else if (diem >= 7.0) {
            return "Khá";
        } else if (diem >= 5.0) {
            return "Trung bình";
        } else {
            return "Yếu";
        }
    }

    public void xuat() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Ngành: " + nganh);
        System.out.println("Điểm: " + diem);
        System.out.println("Học lực: " + getHocLuc());
    }
}

public class MainSinhVien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập họ tên của sinh viên: ");
        String hoTen = scanner.nextLine();

        System.out.print("Nhập ngành của sinh viên: ");
        String nganh = scanner.nextLine();

        System.out.print("Nhập điểm của sinh viên: ");
        double diem = scanner.nextDouble();

        SinhVien sinhVien = new SinhVien(hoTen, nganh, diem);

        System.out.println("\nThông tin về sinh viên:");
        sinhVien.xuat();
    }
}

