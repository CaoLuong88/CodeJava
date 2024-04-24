/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai6_6;

/**
 *
 * @author FPT
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class sinhVien {
    private String hoTen;
    private double diem;

    public sinhVien(String hoTen, double diem) {
        this.hoTen = hoTen;
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

    public String getHoTen() {
        return hoTen;
    }
}

public class QuanLySinhVien7 {
    private ArrayList<sinhVien> danhSachSinhVien = new ArrayList<>();

    public void nhapDanhSach() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng sinh viên: ");
        int soLuong = scanner.nextInt();
        scanner.nextLine(); // Đọc ký tự xuống dòng

        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhập thông tin cho sinh viên thứ " + (i + 1) + ":");
            System.out.print("Họ tên: ");
            String hoTen = scanner.nextLine();
            System.out.print("Điểm: ");
            double diem = scanner.nextDouble();
            scanner.nextLine(); // Đọc ký tự xuống dòng

            danhSachSinhVien.add(new sinhVien(hoTen, diem));
        }
    }

    public void xuatDanhSach() {
        System.out.println("\nDanh sách sinh viên:");
        for (sinhVien sv : danhSachSinhVien) {
            System.out.println("Họ tên: " + sv.getHoTen() + ", Điểm: " + sv.getDiem() + ", Học lực: " + sv.getHocLuc());
        }
    }

    public void xuatSinhVienGioi() {
        System.out.println("\nDanh sách sinh viên có học lực giỏi:");
        for (sinhVien sv : danhSachSinhVien) {
            if (sv.getHocLuc().equals("Giỏi")) {
                System.out.println("Họ tên: " + sv.getHoTen() + ", Điểm: " + sv.getDiem());
            } else System.out.println("ko co sv gioi!");
        }
    }

    public void sapXepDanhSachTheoDiem() {
        Collections.sort(danhSachSinhVien, Comparator.comparing(sinhVien::getDiem).reversed());
        System.out.println("\nDanh sách sinh viên sau khi sắp xếp theo điểm giam dan :");
        for (sinhVien sv : danhSachSinhVien) {
            System.out.println("Họ tên: " + sv.getHoTen() + ", Điểm: " + sv.getDiem());
        }
    }

    public static void main(String[] args) {
        QuanLySinhVien7 quanLy = new QuanLySinhVien7();
        Scanner scanner = new Scanner(System.in);
        int luaChon;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Xuất thông tin danh sách sinh viên");
            System.out.println("3. Xuất danh sách sinh viên có học lực giỏi");
            System.out.println("4. Sắp xếp danh sách sinh viên theo điểm");
            System.out.println("5. Kết thúc");
            System.out.print("Chọn chức năng (1-5): ");
            luaChon = scanner.nextInt();

            switch (luaChon) {
                case 1:
                    quanLy.nhapDanhSach();
                    break;
                case 2:
                    quanLy.xuatDanhSach();
                    break;
                case 3:
                    quanLy.xuatSinhVienGioi();
                    break;
                case 4:
                    quanLy.sapXepDanhSachTheoDiem();
                    break;
                case 5:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Chức năng không hợp lệ. Vui lòng chọn lại.");
            }

        } while (luaChon != 5);
    }
}

