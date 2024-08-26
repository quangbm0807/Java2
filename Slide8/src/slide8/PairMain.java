/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide8;

/**
 *
 * @author buimi
 */
public class PairMain {

    public static void main(String[] args) {
        Pair<String, String> p1 = new Pair("Cat", "Con mèo");
        Pair<String, String> p2 = new Pair("Dog", "Con chó");
        Pair<String, String> p3 = new Pair("Duck", "Con vịt");
        Pair<String, Integer> ip15 = new Pair("Iphone 15", 32000);
        System.out.println(p1.getKey() + ": " + p1.getValue());
        System.out.println(p2.getKey() + ": " + p2.getValue());
        System.out.println(p3.getKey() + ": " + p3.getValue());
        System.out.println(ip15.getKey() + ": " + ip15.getValue());

        Person per1 = new Person("Quang");
        Person per2 = new Person("Lisa");
        Pair<Person, Person> couple = new Pair(per1, per2);
        System.out.println(couple.getValue().getTen()+" loves "+couple.getKey().getTen()+" so much!");
    }

}
