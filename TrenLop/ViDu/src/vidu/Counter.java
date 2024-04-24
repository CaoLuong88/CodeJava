/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vidu;

/**
 *
 * @author FPT
 */
public class Counter {
     static int count = 0;

    public Counter() {
        count ++;
        System.out.println(count);
    }
    // co the tach
    public static void main(String[] args) {
        // TODO code application logic here
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();        
        
    }
}
