/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vidu;

/**
 *
 * @author FPT
 */
public class NV {
    public String ho, lot, ten, gioiTinh;
    double luong, phuCap;//mac dinh = private
    
    //khai bao phuong thuc
    public String layHVT(){
        String hvt = this.ho + " " + this.lot + " " + this.ten;
        //hvt = hvt.toUpperCase();
        return hvt.toUpperCase();
    }
    
    public double layTongLuong(){
        return this.luong + this.phuCap;
    }
    //ham khoi tao
    public NV(){
        
    }
    public NV(String ho, String lot, String ten, String gioiTinh, double luong, double phuCap) {
        this.ho = ho;
        this.lot = lot;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.luong = luong;
        this.phuCap = phuCap;
    }
    
    // ham hien thi thong tin cua nhan vien
    public void hienThi(){
        System.out.println("Ho va ten: " + this.layHVT());
        System.out.println("Gioi tinh: " + this.gioiTinh);
        System.out.println("Tong luong (USD): " + this.layTongLuong());
    }
}
