/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author buimi
 */
public class GhiDuLieuKieuDoiTuong {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        FileOutputStream fos = new FileOutputStream("D:\\fileObject.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Stock[] stock = {new Stock(1001,"CD ROM", 100.00, 20),
                          new Stock(1002,"DRAM", 75.00, 30),
                          new Stock(1003,"P4 Processor", 300.00, 100),
                          new Stock(1004,"Cannon Jet", 80.00, 10),
                          new Stock(1005,"HP Scanner", 75.00, 90)};
        oos.writeObject(stock);
        oos.flush();
        oos.close();
        fos.close();
    }
    
}
