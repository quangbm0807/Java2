/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SLide3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SinhVienMain {
    public static void main(String[] args) {
        List<SinhVien> list = new ArrayList<>();
        list.add(new SinhVien("Teo", 5.0));
        list.add(new SinhVien("Gai", 7.0));
        list.add(new SinhVien("Ti", 6.0));
        list.add(new SinhVien("Bi", 8.0));

        System.out.println("-----Before Sort-----");
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + "-" + list.get(i).fullname + "\t" + list.get(i).marks);
        }

        Collections.sort(list);

        System.out.println("-----After Sort-----");
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + "-" + list.get(i).fullname + "\t" + list.get(i).marks);
        }
    }
}
