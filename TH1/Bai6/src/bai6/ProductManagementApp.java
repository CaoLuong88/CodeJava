/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai6;

/**
 *
 * @author FPT
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

public class ProductManagementApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Product> productList = new ArrayList<>();

        // Nhập danh sách sản phẩm từ bàn phím
        System.out.print("Nhập số lượng sản phẩm: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Đọc ký tự xuống dòng

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho sản phẩm thứ " + (i + 1) + ":");
            System.out.print("Tên sản phẩm: ");
            String name = scanner.nextLine();
            System.out.print("Giá sản phẩm: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Đọc ký tự xuống dòng

            productList.add(new Product(name, price));
        }

        // Tìm sản phẩm theo tên
        System.out.print("Nhập tên sản phẩm để tìm kiếm: ");
        String searchName = scanner.nextLine();

        for (Product product : productList) {
            if (product.getName().equalsIgnoreCase(searchName)) {
                System.out.println("Sản phẩm được tìm thấy:");
                System.out.println("Tên: " + product.getName() + ", Giá: " + product.getPrice());
                break;
            }
        }

        // Sắp xếp giảm dần theo giá và xuất ra màn hình
        Collections.sort(productList, (p1, p2) -> Double.compare(p2.getPrice(), p1.getPrice()));
        System.out.println("\nDanh sách sản phẩm sau khi sắp xếp giảm dần theo giá:");
        for (Product product : productList) {
            System.out.println("Tên: " + product.getName() + ", Giá: " + product.getPrice());
        }

        // Xuất ra giá trị trung bình của tất cả các sản phẩm
        double total = 0;
        for (Product product : productList) {
            total += product.getPrice();
        }
        double average = total / productList.size();
        System.out.println("\nGiá trị trung bình của tất cả các sản phẩm: " + average);
    }
}
