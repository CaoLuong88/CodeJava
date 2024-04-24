/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EF;

/**
 *
 * @author FPT
 */
public class Khoa {

    private int iDKhoa;
    private String tenKhoa;
    private String diaChi;
    public Khoa(){}

    public Khoa(int iDKhoa, String tenKhoa, String diaChi) {
        this.iDKhoa = iDKhoa;
        this.tenKhoa = tenKhoa;
        this.diaChi = diaChi;
    }

    public int getiDKhoa() {
        return iDKhoa;
    }

    public void setiDKhoa(int iDKhoa) {
        this.iDKhoa = iDKhoa;
    }

    public String getTenKhoa() {
        return tenKhoa;
    }

    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
}
