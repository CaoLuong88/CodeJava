/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import EF.Khoa;
import EF.ModelDbContext;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author FPT
 */
public class KhoaDao {
    // hiển thị

    public List<Khoa> getAllKhoa() {
        List<Khoa> khoas = new ArrayList<Khoa>();
        Connection sCon = ModelDbContext.getConnectString();
        String sql = "SELECT iDKhoa, tenKhoa, diaChi FROM"
                + " Khoa ORDER BY iDKhoa DESC";
        try {
            PreparedStatement preparedStatement = sCon.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Khoa khoa = new Khoa();
                khoa.setiDKhoa(rs.getInt("iDKhoa"));
                khoa.setTenKhoa(rs.getString("tenKhoa"));
                khoa.setDiaChi(rs.getString("diaChi"));
                khoas.add(khoa);
            }
//conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return khoas;
    }

    public List<Khoa> getKhoaBySearch(String keySearch) {
        List<Khoa> khoas = new ArrayList<Khoa>();
        Connection sCon = ModelDbContext.getConnectString();
        String sql = "SELECT iDKhoa, tenKhoa, diaChi FROM Khoa"
                + "WHERE tenKhoa LIKE '%' + 2 + '8"
                + "or diachi LIKE '%'+ ? + '%' ";
        try {
            PreparedStatement preparedStatement = sCon.prepareStatement(sql);
            preparedStatement.setString(1, keySearch);
            preparedStatement.setString(2, keySearch);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Khoa khoa = new Khoa();
                khoa.setiDKhoa(rs.getInt("iDKhoa"));
                khoa.setTenKhoa(rs.getString("tenkhoa"));
                khoas.add(khoa);
                khoa.setDiaChi(rs.getString("diaChi"));
            }
//conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return khoas;
    }
    // lấy theo ID

    public Khoa getKhoaByiDKhoa(int iDKhoa) {
        Connection sCon = ModelDbContext.getConnectString();
        Khoa khoa = new Khoa();
        String sql = "SELECT iDKhoa, tenKhoa, diaChi"
                + "FROM Khoa WHERE (iDKhoa ?)";
        try {
            PreparedStatement preparedStatement = sCon.prepareStatement(sql);
            preparedStatement.setInt(1, iDKhoa);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                khoa.setiDKhoa(resultSet.getInt("iDKhoa"));
                khoa.setTenKhoa(resultSet.getString("tenKhoa"));
                khoa.setDiaChi(resultSet.getString("diaChi"));
            }
            sCon.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return khoa;
    }
    // Thêm

    public void addKhoa(Khoa khoa) {
        Connection sCon = ModelDbContext.getConnectString();
        String sql = "INSERT INTO Khoa (tenKhoa, diachi,iDKhoa) VALUES (?,?,?)";
        try {
            PreparedStatement preparedStatement = sCon.prepareStatement(sql);
            preparedStatement.setString(1, khoa.getTenKhoa());
            preparedStatement.setString(2, khoa.getDiaChi());
            preparedStatement.setInt(3, khoa.getiDKhoa());
            int rs = preparedStatement.executeUpdate();
// System.out.println(rs);
            sCon.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    // Sửa

    public void upDateKhoa(Khoa khoa) {
        Connection sCon = ModelDbContext.getConnectString();
        String sql = "UPDATE Khoa SET tenkhoa ?,"
                + "diachi ? WHERE  iDKhoa =  ? ";
        try {
            PreparedStatement preparedStatement = sCon.prepareStatement(sql);
            preparedStatement.setString(1, khoa.getTenKhoa());
            preparedStatement.setString(2, khoa.getDiaChi());
            preparedStatement.setInt(3, khoa.getiDKhoa());
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
            sCon.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    // Xóa

    public void deleteKhoa(int iDKhoa) {
        Connection sCon = ModelDbContext.getConnectString();
        String sql = "DELETE FROM Khoa WHERE iDKhoa = ?";
        try {
            PreparedStatement preparedStatement = sCon.prepareStatement(sql);
            preparedStatement.setInt(1, iDKhoa);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
            sCon.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
