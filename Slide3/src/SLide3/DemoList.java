/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SLide3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author buimi
 */
public class DemoList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("A");
        names.add("B");
        names.add("C");
        names.add("D");
        names.set(1, "F");
        names.remove("D");
        System.out.println(names.toString());
//        for(int i = 0; i<names.size();i++){
//            String name = names.get(i);
//            System.out.println("Name: "+name);
//        }
//        for(String name:names){
//            System.out.println("Name: "+name);
//        }
        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
