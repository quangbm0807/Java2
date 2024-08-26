/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide8;

/**
 *
 * @author buimi
 */
public class GenericTypeMain {

    public static void main(String[] args) {
        GenericType<String> str = new GenericType<>();
        
        str.setT("Hello world!");
        System.out.println("String: "+str.getT());
        
        GenericType<Integer> intt = new GenericType<>(5);
        System.out.println("Integer: " + intt.getT());
        
        GenericType<Double> dou = new GenericType<>(6.254);
        System.out.println("Double: " + dou.getT());

    }
}
