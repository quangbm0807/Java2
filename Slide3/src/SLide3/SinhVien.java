package SLide3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author buimi
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SinhVien implements Comparable<SinhVien> {
    public String fullname;
    public Double marks;

    public SinhVien(String fullname, Double marks) {
        this.fullname = fullname;
        this.marks = marks;
    }

    @Override
    public int compareTo(SinhVien sv) {
        return this.marks.compareTo(sv.marks);
    }

  
}
