/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide5;

import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author buimi
 */
public class CharacterReadWrite {
    public static void main(String[] args) {
        try {
            FileWriter out = new FileWriter("D:\\first.txt");
            out.write("Doc ghi du lieu trong Java!");
            out.write("\n");
            out.write("Su dung stream character");
            out.close();
            FileReader input = new FileReader("D:\\first.txt");
            System.out.println("Doc tu file first.txt");
            int ch = input.read();
            while(ch != -1){
                System.out.print((char)ch);
                ch = input.read();
            }
        } catch (Exception e) {
            System.out.println("Co loi "+e.getMessage());
        }
    }
}
