/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vidu;

/**
 *
 * @author FPT
 */
public class BankAccount {
     String accountNumber;//private as a default
    public double balance;
    public String owner;
    
    //methods    
    //constructor
    public BankAccount(){
        accountNumber = "";
        balance = 0.0;
        owner = "";
    }
    
    public BankAccount(String owner){
        this.owner = "BIDV Thanh Hoa";
    }

    public BankAccount(String accountNumber, double balance, String owner) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
    }
    // get method
    public String getOwner() {
        return owner;
    }
    
    //set method
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
