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
public class Bai1 {
    public static void main(String[] args) {
//        ArrayList<Integer> soNguyen = new ArrayList<>();
//        soNguyen.add(99);
//        ArrayList<Double> soThuc = new ArrayList<>();
//        soThuc.add(99.99);
//        ArrayList<Boolean> bool = new ArrayList<>();
//        bool.add(true);
//        ArrayList<String> str = new ArrayList<>();
//        str.add("Lab 8 - Bui Minh Quang - 02");
//        System.out.println("So nguyen: "+soNguyen);
//        System.out.println("So thuc: "+soThuc);
//        System.out.println("Boolean: "+bool);
//        System.out.println("Xau ky tu: "+str);
        
        ArrayList<Object> obj = new ArrayList<>();
        obj.add("So nguyen: "+99);
        obj.add("So thuc: "+99.99);
        obj.add("Boolean: "+true);
        obj.add("Xau ky tu: "+"Lab 8 - Bui Minh Quang");
        for(Object value : obj){
            System.out.println(value);
        }
        
    }
}
