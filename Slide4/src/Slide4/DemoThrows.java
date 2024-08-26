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
public class DemoThrows {
    public void ghiFile() throws IOException{
        FileWriter file = new FileWriter("D:\\data.txt");
        file.write("Xử lý ngoại lệ trong java\n");
        file.write(100);
        System.out.println("Đã ghi xong!");
        file.close();
    }
}
