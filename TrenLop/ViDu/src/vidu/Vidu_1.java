/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vidu;

/**
 *
 * @author FPT
 */
public class Vidu_1 {
    public static void main(String[] args) {
        // TODO code application logic here
        Vidu_1 o = new Vidu_1();
        //o.go();
        double a = 10/3.0;
        System.out.printf("%.1f\n",a);
    }
    void go(){
        int y = 7;
        for(int x=1; x<8;x++){
            y++;
            if(x>4){
                System.out.println(++y + " ");
            }
            if(y>14){
                System.out.println("x= " + x);
                break;
            }
        }
    }
}
