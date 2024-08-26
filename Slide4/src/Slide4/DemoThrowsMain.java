/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slide4;

import java.io.IOException;

/**
 *
 * @author buimi
 */
public class DemoThrowsMain {
    public static void main(String[] args) {
        try {
            DemoThrows obj = new DemoThrows();
            obj.ghiFile();
            System.out.println("Sử dụng từ khóa throws");
        } catch (IOException ex) {
            System.out.println("Có lỗi: "+ex);
        }
    }
}
