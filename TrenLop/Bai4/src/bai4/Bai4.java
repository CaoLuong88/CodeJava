/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai4;

/**
 *
 * @author FPT
 */
public class Bai4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int x = 5;
        int y = 10;
        int z;

        // Gán tổng của x và y cho z và tăng x thêm 1 sau phép tính
        z = x + y;
        x++;

        // Kiểm tra giá trị biến count có lớn hơn 10 hay không
        int count = 12;
        if (count > 10) {
            System.out.println("Count is greater than 10");
        }

        // Tính phần dư của phép chia q cho d và gán kết quả đó cho q
        int q = 25;
        int d = 7;
        q = q % d;

        // Tính tổng các số chẵn từ 1 đến 99
        int sumEven = 0;
        for (int i = 2; i <= 99; i += 2) {
            sumEven += i;
        }
        System.out.println("Tổng các số chẵn từ 1 đến 99 là: " + sumEven);

        // In ra các số từ 1 đến 10 trên một dòng, sử dụng kí tự tab ('\t') để ngăn cách
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "\t");
        }
    }
}

