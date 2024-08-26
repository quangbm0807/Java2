/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slide4;

/**
 *
 * @author buimi
 */
public class demo3 {
    public static void main(String[] args) {
        String s[] = {"1","b","3"};
        try {
            int a = Integer.parseInt(s[1]);
        } catch (NumberFormatException e1) {
            System.out.println("Khong dung dinh dang so");
        } catch (ArrayIndexOutOfBoundsException e2){
            System.out.println("Vuot qua do dai mang");
        } catch(NullPointerException e3){
            System.out.println("Mang chua duoc khai bao");
        } finally{
            System.out.println("Ket thuc chuong trinh");
        }
    }
}
