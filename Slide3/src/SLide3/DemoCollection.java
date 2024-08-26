/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SLide3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class DemoCollection {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(9);
        list.add(1);
        System.out.println(list.toString());
        Set<Integer> set = new HashSet<>();
        set.add(100);
        set.add(100);
        set.add(200);
        System.out.println(set.toString());
        set.addAll(list);
        System.out.println(set.toString());
        list.addAll(set);
        System.out.println(list.toString());
    }
}
