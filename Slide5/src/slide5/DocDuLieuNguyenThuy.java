/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide5;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author buimi
 */
public class DocDuLieuNguyenThuy {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        FileInputStream fis = new FileInputStream("D:\\fileNguyenThuy.dat");
        DataInputStream dis = new DataInputStream(fis);
        int items = dis.readInt();
        for( int i=0; i<= items; i++){
            int n = dis.readInt();
            System.out.println(n+"");
        }
        System.out.println(dis.readUTF());
        System.out.println(dis.readDouble());
        dis.close();
        fis.close();
    }
}
