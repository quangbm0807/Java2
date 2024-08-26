/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author buimi
 */
public class Bai2 {

    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Tuấn", "CNTT", 5));
        list.add(new Student("Cường", "TKTW", 7.5));
        list.add(new Student("Hạnh", "CNTT", 8.5));
        XFile.writeObj("c:/temp/students.dat", list);
        List<Student> list2 = (List<Student>) XFile.readObj("c:/temp/students.dat");
        for (Student sv : list) {
            System.out.println(">Họ và tên: " + sv.name);
            System.out.println(">Nganh: " + sv.major);
            System.out.println(">Diem: " + sv.marks);
        }
    }
}
