/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuLieu;
import java.sql.*;
/**
 *
 * @author FPT
 */
public class dbContext {
    public static Connection sConn = null;
    public static void main(String[] args) {
        //Khai báo chuỗi kết nối
        String strDbUrl = "jdbc:sqlserver://localhost:1433; databaseName=QuanLySinhVien;user=sa;password=may1;"
                + "encrypt=true;trustServerCertificate=true";
        if (sConn == null) {
            try {              
                sConn = DriverManager.getConnection(strDbUrl);
                System.out.println("Ket noi thanh cong");
                DatabaseMetaData data = (DatabaseMetaData) sConn.getMetaData();
                // hien thi thong tin sql khi ket noi thanh cong
                System.out.println("Driver Name: " + data.getDriverName());
                System.out.println("Driver Version: " + data.getDriverVersion());
                System.out.println("Product Name: " + data.getDatabaseProductName());
                System.out.println("Version: " + data.getDatabaseProductVersion());
            } 
            catch (SQLException ex) {System.out.println("Khong the ket noi den CSDL \n" + ex);
            } 
        }
    }
}
