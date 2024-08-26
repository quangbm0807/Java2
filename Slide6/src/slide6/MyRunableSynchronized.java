/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide6;



/**
 *
 * @author buimi
 */
public class MyRunableSynchronized implements Runnable {

    @Override
    public synchronized void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        MyRunableSynchronized runnable1 = new MyRunableSynchronized();
        MyRunableSynchronized runnable2 = new MyRunableSynchronized();
        Thread t1 = new Thread(runnable1);
        Thread t2 = new Thread(runnable2);
        t1.start();
        t2.start();
    }
}

