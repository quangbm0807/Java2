/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author buimi
 */
public class TestThread {

    public static void main(String[] args) {
        OddThread soLe = new OddThread();
        EvenThread soChan = new EvenThread();
        Thread t1 = new Thread(soLe);
        Thread t2 = new Thread(soChan);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(TestThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        t2.start();
    }
}
