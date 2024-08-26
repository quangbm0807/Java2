/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

import java.io.Serializable;

/**
 *
 * @author buimi
 */
public class Student implements Serializable{
    public String name, major;
    public double marks;
    public String getGrade(){
        if(this.marks<3){
            return "Kém";
        }if(this.marks<5){
            return "Yếu";
        }if(this.marks<6.5){
            return "Trung bình";
        }if(this.marks<7.5){
            return "Khá";
        }if(this.marks<9){
            return "Giỏi";
        }return "Xuất sắc";
    }
    public boolean isBonus(){
        return this.marks >=7.5;
    }

    public Student(String name, String major, double marks) {
        this.name = name;
        this.major = major;
        this.marks = marks;
    }

    public Student() {
    }

    
}