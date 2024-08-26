/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SLide3;

/**
 *
 * @author buimi
 */
public class Student {
    public String name, major;
    public double mark;

    public Student() {
    }

    public Student(String name, double mark) {
        this.name = name;
        this.mark = mark;
    }
    public String getGrade(){
        if(this.mark<3){
            return "Kém";
        }if(this.mark<5){
            return "Yếu";
        }if(this.mark<6.5){
            return "Trung bình";
        }if(this.mark<7.5){
            return "Khá";
        }if(this.mark<9){
            return "Giỏi";
        }return "Xuất sắc";
    }
}
