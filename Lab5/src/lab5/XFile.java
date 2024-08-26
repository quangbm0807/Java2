/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author buimi
 */
public class XFile {

    public static byte[] read(String path) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream(path);
        int length = fis.available();
        byte[] data = new byte[length];
        fis.read(data);
        fis.close();
        return data;
    }

    public static void write(String path, byte[] data) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream(path);
        fos.write(data);
        fos.close();
    }

    public static Object readObj(String path) throws FileNotFoundException, IOException, ClassNotFoundException {
        try (
                FileInputStream fis = new FileInputStream(path); ObjectInputStream ois = new ObjectInputStream(fis);) {
            return ois.readObject();
        }
    }
    public static void writeObj(String path, Object object) throws FileNotFoundException, IOException{
        try(
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
                ){
            oos.writeObject(object);
        }
    }
}
