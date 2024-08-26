/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author buimi
 */
public class Boxing {

    public static int sumEven(List<Integer> li) {
        int sum = 0;
        for (Integer n : li) {
            if (n % 2 == 0) {
                sum += n;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            li.add(i);
        }
        System.out.println("Tong cac so chan la: "+sumEven(li));

    }
}
