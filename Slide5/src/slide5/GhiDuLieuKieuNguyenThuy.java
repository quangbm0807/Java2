/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide5;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author buimi
 */
public class GhiDuLieuKieuNguyenThuy {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream("D:\\fileNguyenThuy.dat");
        DataOutputStream dos = new DataOutputStream(fos);
        final int NUMBER = 5;
        dos.writeInt(NUMBER);
        for(int i=0; i<=NUMBER; i++){
            dos.writeInt(i);
        }
        dos.writeUTF("Hello!");
        dos.writeDouble(100.75);
        dos.flush();
        dos.close();
        fos.close();
    }
}
