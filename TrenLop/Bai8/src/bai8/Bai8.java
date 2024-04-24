/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai8;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author FPT
 */
public class Bai8 {

    private String ho;
    private String lot;
    private String ten;
    private String gioiTinh;
    private double luong;
    private double phuCap;

    // Constructor
    public Bai8(String ho, String lot, String ten, String gioiTinh, double luong, double phuCap) {
        this.ho = ho;
        this.lot = lot;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.luong = luong;
        this.phuCap = phuCap;
    }

    // Lấy thông tin họ và tên đầy đủ nhân viên
    public String getHoTenDayDu() {
        return ho + " " + lot + " " + ten;
    }

    // Lương thực nhận = lương chính + phụ cấp
    public double tinhLuongThucNhan() {
        return luong + phuCap;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Bai8> danhSachNhanVien = new ArrayList<>();

        // Nhập thông tin cho danh sách nhân viên
        System.out.print("Nhập số lượng nhân viên: ");
        int soLuongNhanVien = scanner.nextInt();
        scanner.nextLine(); // Đọc ký tự xuống dòng

        for (int i = 0; i < soLuongNhanVien; i++) {
            System.out.println("Nhập thông tin cho nhân viên thứ " + (i + 1) + ":");
            System.out.print("Họ: ");
            String ho = scanner.nextLine();
            System.out.print("Lót: ");
            String lot = scanner.nextLine();
            System.out.print("Tên: ");
            String ten = scanner.nextLine();
            System.out.print("Giới tính: ");
            String gioiTinh = scanner.nextLine();
            System.out.print("Lương: ");
            double luong = scanner.nextDouble();
            System.out.print("Phụ cấp: ");
            double phuCap = scanner.nextDouble();

            danhSachNhanVien.add(new Bai8(ho, lot, ten, gioiTinh, luong, phuCap));
            scanner.nextLine(); // Đọc ký tự xuống dòng
        }

        // In ra tổng lương của các nhân viên
        double tongLuong = 0;
        for (Bai8 nv : danhSachNhanVien) {
            tongLuong += nv.tinhLuongThucNhan();
        }
        System.out.println("Tổng lương của các nhân viên: " + tongLuong);

        // Tìm kiếm thông tin của một nhân viên
        System.out.print("Nhập tên nhân viên cần tìm kiếm: ");
        String tenCanTim = scanner.nextLine();
        boolean timThay = false;
        for (Bai8 nv : danhSachNhanVien) {
            if (nv.getHoTenDayDu().equalsIgnoreCase(tenCanTim)) {
                System.out.println("Thông tin của nhân viên " + tenCanTim + ":");
                System.out.println("Họ và tên đầy đủ: " + nv.getHoTenDayDu());
                System.out.println("Lương thực nhận: " + nv.tinhLuongThucNhan());
                timThay = true;
                break;
            }
        }
        if (!timThay) {
            System.out.println("Không tìm thấy thông tin của nhân viên có tên " + tenCanTim);
        }
    }
}

