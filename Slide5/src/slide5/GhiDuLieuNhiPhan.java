/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author buimi
 */
public class GhiDuLieuNhiPhan {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream("D:\\file.dat");
        String text = "Fpoly Ho Chi Minh";
        byte[] textAsByte = text.getBytes();
        fos.write(textAsByte);
        fos.flush();
        fos.close();
    }
   
}
