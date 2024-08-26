/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slide4;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author buimi
 */
public class DemoThrows1 {
    public void ghiFile() throws IOException{
        FileWriter file = new FileWriter("D:\\data.txt");
        file.write("Xử lý ngoại lệ trong java\n");
        file.write(100);
        System.out.println("Đã ghi xong!");
        file.close();
    }
    public static void main(String[] args) throws IOException {
        DemoThrows1 obj1 = new DemoThrows1();
        obj1.ghiFile();
        System.out.println("Sử djng từ khoa throws");
    }
}
