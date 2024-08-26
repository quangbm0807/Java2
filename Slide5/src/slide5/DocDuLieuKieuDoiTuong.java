/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide5;

import java.io.FileInputStream;
import java.io.ObjectInputStream;



/**
 *
 * @author buimi
 */
public class DocDuLieuKieuDoiTuong {
    public static void main(String[] args)  {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("D:\\fileObject.dat");
            ois = new ObjectInputStream(fis);
            Stock[] stocks1 = (Stock []) ois.readObject();
            System.out.println("Doc tu file: ");
            for (Stock s:stocks1){
                System.out.println(s);
            }
            ois.close();
            fis.close();
        } catch (Exception e) {
            System.out.println("Co loi "+e);
        }
        
    }
        
}
