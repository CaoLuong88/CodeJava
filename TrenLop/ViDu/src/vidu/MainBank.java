/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vidu;

/**
 *
 * @author FPT
 */
public class MainBank {
     public static void main(String[] args) {
        // TODO code application logic here
        
        BankAccount tk_1 = new BankAccount();
        System.out.println("The owner:"+ tk_1.owner); // not good, use set / get
        BankAccount tk_2 = new BankAccount("Tuan");
        System.out.println("The owner:" + tk_2.getOwner());
        BankAccount tk_3 = new BankAccount("5010078", 100.0, "Teo");
        System.out.println(tk_3.getAccountNumber() + " " + tk_3.getBalance() + " "+ 
                tk_3.getOwner());
        
        
    }
}
