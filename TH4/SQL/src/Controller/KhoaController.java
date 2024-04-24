/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Dao.KhoaDao;
import EF.Khoa;
import java.util.List;

/**
 *
 * @author FPT
 */
public class KhoaController {
    protected KhoaDao khoaDao;

    public KhoaController() {
        khoaDao = new KhoaDao();
    }

    public List<Khoa> getAllKhoa() {
        return khoaDao.getAllKhoa();
    }
    public List<Khoa> getKhoaBySearch(String keySearch) {
        return khoaDao.getKhoaBySearch(keySearch);
    }

    public Khoa getKhoaByiDKhoa(int iDKhoa) {
        return khoaDao.getKhoaByiDKhoa(iDKhoa);
    }

    public void addKhoa(Khoa khoa) {
        khoaDao.addKhoa(khoa);
    }

    public void upDateKhoa(Khoa khoa) {
         khoaDao.upDateKhoa(khoa);
    }

    public void deleteKhoa(int iDKhoa) {
       
        khoaDao.deleteKhoa(iDKhoa);
    }
}
