/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EF;

/**
 *
 * @author FPT
 */
import static DuLieu.userStatement.sConn;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModelDbContext {

    public static Connection getConnectString() {
        final String user = "sa";
        final String password = "may1";
//        final String url
//                = "jdbc:sqlserver://localhost:1433;"
//                + "databaseName=QuanLySinhVien; user="
//                + user + "; password="
//                + password+"encrypt=true;trustServerCertificate=true" ;
        String strDbUrl = "jdbc:sqlserver://localhost:1433;" + "databaseName=QuanLySinhVien;user=sa;password=may1;"
                + "encrypt=true;trustServerCertificate=true";
        try {
            Class.forName("com.microsoft"
                    + ".sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(strDbUrl);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
