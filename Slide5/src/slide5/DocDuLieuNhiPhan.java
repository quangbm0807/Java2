/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide5;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author buimi
 */
public class DocDuLieuNhiPhan {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\file.dat");
        int c;
        while ((c = fis.read()) != -1) {
            System.out.print((char) c);
        }
        fis.close();
    }
}
