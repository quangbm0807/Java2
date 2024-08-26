/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

/**
 *
 * @author buimi
 */
public class EvenThread extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            if ((i % 2) == 0) {
                System.out.println(i);
            }
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        EvenThread soChan = new EvenThread();
        soChan.start();
    }
}
