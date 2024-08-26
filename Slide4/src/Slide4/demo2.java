/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slide4;

import java.util.Scanner;

/**
 *
 * @author buimi
 */
public class demo2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Nhap a: ");
            int a = sc.nextInt();
            System.out.println("Ban da nhap a: " + a);
        } catch (Exception e) {
            System.out.println("Ban nhap chua dung");
        }
    }
}
