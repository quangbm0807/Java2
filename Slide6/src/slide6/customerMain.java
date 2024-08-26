/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide6;

/**
 *
 * @author buimi
 */
public class customerMain {
    public static void main(String[] args) {
        Customer bank = new Customer();
        Thread rut = new Thread(){
            @Override
             public void run(){
                bank.withraw(1500);
            }
        };
        rut.start();
        
        Thread nap = new Thread(){
            @Override
            public void run(){
                bank.deposit(2000);
            }
        };
        nap.start();
        
    }
}
