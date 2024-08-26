/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide6;



/**
 *
 * @author buimi
 */
public class MyRunable implements Runnable{

    @Override
    public void run() {
        for(int i=0; true; i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunable());
        t1.start();
        Thread t2 = new Thread(new MyRunable());
        t2.start();
    }
    
}
