/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SLide3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author buimi
 */
public class StudentMain {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Teo", 5.0));
        list.add(new Student("Gai", 7.0));
        list.add(new Student("Ti", 6.0));
        list.add(new Student("Bi", 8.0));

        Comparator<Student> com = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.mark, o2.mark);
            }
        };
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + "-" + list.get(i).name + "\t" + list.get(i).mark);
        }

        Collections.sort(list, com);

        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + "-" + list.get(i).name + "\t" + list.get(i).mark);
        }
    }
}
