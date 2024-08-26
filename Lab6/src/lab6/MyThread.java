/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

/**
 *
 * @author buimi
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.print(Thread.currentThread().getName()+":\t");
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                break;
            }
        }

    }

    public static void main(String[] args){
        MyThread ob1 = new MyThread();
        MyThread ob2 = new MyThread();
        Thread th1 = new Thread(ob1);
        Thread th2 = new Thread(ob2);
        th1.setName("Thread 1");
        th2.setName("Thread 2");
        th1.setPriority(Thread.MAX_PRIORITY);
        th2.setPriority(Thread.MIN_PRIORITY);
        th1.start();
        th2.start();
    }
}
