/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;

/**
 *
 * @author buimi
 */
public class student {

    private String id, name, age;

    public student() {
    }

    public student(String id, String name, String salary) {
        this.id = id;
        this.name = name;
        this.age = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return age;
    }

    public void setSalary(String salary) {
        this.age = salary;
    }

    @Override
    public String toString() {
        return  "ID= " + id  + ", Name= " + name  + ", Age= " + age;
    }
}
