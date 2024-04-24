/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vidu;
import java.util.Scanner;
/**
 *
 * @author FPT
 */
public class NHANVIEN {
    //khai bao thuoc tinh
    private String ho, lot, ten, gioiTinh;
    private double luong, phuCap;
    
    // khai bao phuong thuc
    
    public NHANVIEN(){};

    public NHANVIEN(String ho, String lot, String ten, String gioiTinh, double luong, double phuCap) {
        this.ho = ho;
        this.lot = lot;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.luong = luong;
        this.phuCap = phuCap;
    }
    // ham lay ten day du
    public String getTenDayDu(){
        String s= this.ho + " " + this.lot + " " + this.ten;
        return s.toUpperCase();//viet hoa het cac ki tu        
    }
    // ham lay tong luong
    public double getTongLuong(){
        double rs = this.luong + this.phuCap;
        return rs;
    }
    //ham hien thi thong tin
    public void hienThi(){
        System.out.println("Ho va ten: " + this.getTenDayDu());
        System.out.println("Gioi tinh: " + this.gioiTinh);
        System.out.printf("Tong luong: %.0f\n", this.getTongLuong());
    }
    //ham nhap thong tin nhan vien
    public NHANVIEN nhapThongTin(){
        NHANVIEN nv_tam = new NHANVIEN();
        Scanner sc = new Scanner(System.in);
        System.out.printf("\n");
        System.out.println("Nhap ho:");
        nv_tam.ho = sc.nextLine();
        System.out.println("Nhap lot:");
        nv_tam.lot = sc.nextLine();
        System.out.println("Nhap ten:");
        nv_tam.ten = sc.nextLine();
        System.out.println("Nhap GT:");
        nv_tam.gioiTinh = sc.nextLine();
        System.out.println("Nhap luong:");
        nv_tam.luong = sc.nextDouble();
        System.out.println("Nhap phu cap:");
        nv_tam.phuCap = sc.nextDouble();  
        
        return nv_tam;        
    }
}
