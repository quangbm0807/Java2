/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;

/**
 *
 * @author buimi
 */
public class employee {

    private String id, name, salary;

    public employee(String id, String name, String age) {
        this.id = id;
        this.name = name;
        this.salary = age;
    }

    public employee() {
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

    public String getAge() {
        return salary;
    }

    public void setAge(String age) {
        this.salary = age;
    }

    @Override
    public String toString() {
        return    "ID= " + id  + ", Name= " + name  + ", Salary= " + salary;
    }
}
