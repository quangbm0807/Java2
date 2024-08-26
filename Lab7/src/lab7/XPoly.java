/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

public class XPoly {

    public static boolean isCardNumber(String number) {
        int sum = 0;
        int n = Integer.parseInt(number);

        while (n > 0) {
            int digit = n % 10;
            n = n / 10;
            sum += digit;
        }

        return sum % 2 == 0;
    }
}
