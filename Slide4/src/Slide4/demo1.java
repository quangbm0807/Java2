/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slide4;

import java.util.Scanner;

public class demo1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, thuong;
        try {
            System.out.println("Nhap a: ");
            a = sc.nextInt();
            System.out.println("Nhap b: ");
            b = sc.nextInt();
            thuong = a / b;
            System.out.println("Thuong = " + thuong);
        } catch (Exception e) {
            System.out.println("B phai khac 0");
        }
    }
}
