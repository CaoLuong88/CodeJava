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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class SinhVien {
    private String maSV;
    private String hoTen;
    private String email;
    private String soDienThoai;

    public SinhVien(String maSV, String hoTen, String email, String soDienThoai) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.email = email;
        this.soDienThoai = soDienThoai;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getEmail() {
        return email;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public String toString() {
        return "Mã SV: " + maSV + ", Họ tên: " + hoTen + ", Email: " + email + ", Số điện thoại: " + soDienThoai;
    }

    public boolean isValidEmail() {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}

public class QuanLySinhVien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<SinhVien> danhSachSinhVien = new ArrayList<>();

        // Nhập thông tin cho danh sách sinh viên
        for (int i = 0; i < 2; i++) {
            System.out.println("Nhập thông tin cho sinh viên thứ " + (i + 1) + ":");
            System.out.print("Mã sinh viên: ");
            String maSV = scanner.nextLine();
            System.out.print("Họ tên: ");
            String hoTen = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();

            // Kiểm tra định dạng email và thông báo lỗi nếu cần
            while (!isValidEmail(email)) {
                System.out.println("Email không hợp lệ. Nhập lại:");
                email = scanner.nextLine();
            }

            System.out.print("Số điện thoại: ");
            String soDienThoai = scanner.nextLine();

            danhSachSinhVien.add(new SinhVien(maSV, hoTen, email, soDienThoai));
        }

        // Xuất thông tin mảng vừa nhập
        System.out.println("\nThông tin mảng sinh viên vừa nhập:");
        for (SinhVien sv : danhSachSinhVien) {
            System.out.println(sv);
        }
    }

    private static boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}

