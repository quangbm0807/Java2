/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;

import java.util.ArrayList;

/**
 *
 * @author buimi
 */
public class personModel <T> {
    public ArrayList<T> li = new ArrayList<>();
    public void addObject(T object){
        li.add(object);
    }
    public void display(){
        for(T e:li){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        System.out.println("Danh sach sinh vien");
        personModel<student> student = new personModel<>();
        student.addObject(new student("ps123","Nguyen Van A","18"));
        student.addObject(new student("p456","Tran Thi B","20"));
        student.display();
        System.out.println("Danh sach nhan vien: ");
        personModel<student> employee = new personModel<>();
        employee.addObject(new student("fe123","Nguyen Van C","28"));
        employee.addObject(new student("fe456","Tran Thi D","30"));
        employee.display();
    }
}
