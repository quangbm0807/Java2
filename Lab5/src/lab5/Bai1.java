/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;



/**
 *
 * @author buimi
 */
public class Bai1 {
    public static void main(String[] args) {
        try {
            byte[] data = XFile.read("D:\\Lab5.txt");
            XFile.write("Lab5.txt", data);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
