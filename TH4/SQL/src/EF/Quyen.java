/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EF;

/**
 *
 * @author FPT
 */
public class Quyen {

    protected int iDQuyen;
    protected String tenQuyen;
    protected String ghiChu;

    public Quyen() {
    }

    public Quyen(int iDQuyen, String tenQuyen, String ghiChu) {
        this.iDQuyen = iDQuyen;
        this.tenQuyen = tenQuyen;
        this.ghiChu = ghiChu;
    }

    public int getiDQuyen() {
        return iDQuyen;
    }

    public void setiDQuyen(int iDQuyen) {
        this.iDQuyen = iDQuyen;
    }

    public String getTenQuyen() {
        return tenQuyen;
    }

    public void setTenQuyen(String tenQuyen) {
        this.tenQuyen = tenQuyen;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

}
