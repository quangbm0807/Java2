/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide7;

import static java.lang.Math.*;
import java.util.Scanner;

public class ImportStatic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Nhap a: ");
        a = sc.nextInt();
        System.out.println("Nhap b: ");
        b = sc.nextInt();
        System.out.println("Can bac hai = "+ sqrt(a));
        System.out.println("So nho nhat = "+ min(a, b));
        System.out.println("a luy thua b = "+ pow(a, b));
        System.out.println("So lon nhat = "+ max(a, b));
    }
}
