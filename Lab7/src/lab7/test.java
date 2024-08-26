/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

import java.util.Scanner;

/**
 *
 * @author buimi
 */
public class test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap N: ");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
            for (int j = i; j >= 1; j--) {
                if (j == 1) {
                    System.out.print(j + " = " + sum);
                } else {
                    System.out.print(j + "+");
                }
            }
            System.out.println(); 
        }
    }
}
