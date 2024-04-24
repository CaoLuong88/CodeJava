/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EF;

/**
 *
 * @author FPT
 */
public class NguoiDung {

    protected int iDNguoiDung;
    protected String tenDangNhap;
    protected String matKhau;
    protected String hoTen;
    protected String trangthai;
    protected int iDQuyen;

    public NguoiDung() {
    }

    public NguoiDung(int iDNguoiDung, String tenDangNhap, String matKhau, String hoTen, String trangthai, int iDQuyen) {
        this.iDNguoiDung = iDNguoiDung;
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.hoTen = hoTen;
        this.trangthai = trangthai;
        this.iDQuyen = iDQuyen;
    }

    public int getiDNguoiDung() {
        return iDNguoiDung;
    }

    public void setiDNguoiDung(int iDNguoiDung) {
        this.iDNguoiDung = iDNguoiDung;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    public int getiDQuyen() {
        return iDQuyen;
    }

    public void setiDQuyen(int iDQuyen) {
        this.iDQuyen = iDQuyen;
    }

}
