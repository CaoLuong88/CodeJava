/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thu;
import java.util.Scanner;
/**
 *
 * @author FPT
 */
public class Thu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello world");
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap chuoi:");
        String ten;
        ten=scanner.next();
        System.out.println("hello "+ ten);
        System.out.println("Tab: " + "Chèn vào một khoảng trắng \t trong đoạn văn bản");
        System.out.println("Backspace: " + "Xóa lùi 1 ký tự trước trong \b đoạn văn bản");
        System.out.println("New line: " + "Chèn một dòng mới\n trong đoạn văn bản"); 
        System.out.println("Thay thế các ký tự trước $\r bằng số các ký tự phía sau "); // /r
        System.out.println("Single quote: " + "Chèn vào dấu nháy đơn \'trong đoạn văn bản.");
        System.out.println("Double quote: " + "Chèn vào dấu nháy kep \"trong đoạn văn bản.!");
        System.out.println("Backslash: " + "Chèn vào dấu \\ trong đoạn văn bản");
        // ep kieu
        int i = 100;    
        long l = i;     // chuyển từ kiểu dữ liệu integer lên kiểu long
        float f = l;    // chuyển từ kiểu dữ liệu long lên kiểu float
        System.out.println("Giá trị biến i = " + i);
        System.out.println("Giá trị biến l = " + l);
        System.out.println("Giá trị biến f = " + f);
    }
    
}
