/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide6;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author buimi
 */
public class Customer {
    int amount = 1000;
    public synchronized void withraw(int m){
        System.out.println("Ban dang rut tien");
        if(amount <m){
            System.out.println("Ban khong du tien");
            try {
                wait();
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
        amount = amount - m;
        System.out.println("So tien da rut: "+m);
        System.out.println("So du tai khoan: "+amount);
        System.out.println("Rut tien thanh cong");
    }
    public synchronized void deposit (int m){
        System.out.println("Ban dang nap tien");
        amount = amount + m;
        System.out.println("Nap tien thanh cong");
        notify();
    }
 
}
