/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuLieu;

/**
 *
 * @author FPT
 */
import java.sql.*;
public class userStatement {
    public static Connection sConn = null;
    public static void main(String[] args) {
        //Khai báo chuỗi kết nối
        String strDbUrl = "jdbc:sqlserver://localhost:1433;" + "databaseName=QuanLySinhVien;user=sa;password=may1;"
                + "encrypt=true;trustServerCertificate=true";
        if (sConn == null) {
            try {
                sConn = DriverManager.getConnection(strDbUrl);
                Statement st = sConn.createStatement();
                String sql = "SELECT * FROM Khoa WHERE iDKhoa = 1";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    System.out.println(rs.getInt(1) + "  "
                            + rs.getString(2) + "  " + rs.getString(3));
                }
                sConn.close();
            } catch (SQLException ex) {
                System.out.println("Khong the ket noi den CSDL \n" + ex);
            }
        }
    }
}
