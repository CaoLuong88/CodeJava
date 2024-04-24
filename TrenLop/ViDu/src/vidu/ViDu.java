/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vidu;
import java.util.ArrayList;
/**
 *
 * @author FPT
 */
public class ViDu {
    public static void main(String[] args) {
        // TODO code application logic here
        NHANVIEN nv1 = new NHANVIEN("le", "van", "teo", "Nam", 10000000, 5000000);
        nv1.hienThi();
        // Nhap danh sach nhan vien
        ArrayList<NHANVIEN> ds_nv = new ArrayList<>();//mang nhan vien
        int soLuong = 3;
        for(int i=0; i<soLuong; i++){
            //nhap thong tin cho nhan vien i
            System.out.printf("Nhap thong tin nhan vien %d:",i+1);
            NHANVIEN nv_tam = new NHANVIEN();
            ds_nv.add(nv_tam.nhapThongTin());
        }
        //hien thi danh sach nhan vien
        for(int i=0; i< ds_nv.size(); i++){
            System.out.printf("Thong tin nhan vien %d:\n",i+1);
            ds_nv.get(i).hienThi();
            System.out.printf("\n");
        }
    }
    
}
