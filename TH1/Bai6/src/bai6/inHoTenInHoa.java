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

class sinhVien {
    private String hoTen;

    public sinhVien(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void HoTenInHoa() {
        String[] parts = hoTen.split(" ");
        if (parts.length >= 3) {
            String hoDem = parts[0];
            String tenDem = parts[1];
            String ten = parts[parts.length - 1];
            System.out.println("Họ ,ten dem, tên " + hoDem+" " +tenDem +" " +ten );

            hoDem = hoDem.toUpperCase();
            tenDem = tenDem.toUpperCase();
            ten = ten.toUpperCase();

            System.out.println("Họ và tên đệm in hoa: " + hoDem );
            System.out.println("Tên in hoa: " + ten);
        } else {
            System.out.println("Không đủ thông tin để xử lý.");
        }
    }
}

public class inHoTenInHoa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập họ và tên sinh viên: ");
        String hoTen = scanner.nextLine();

        sinhVien sinhVien = new sinhVien(hoTen);
        sinhVien.HoTenInHoa();
    }
}
