/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide8;

/**
 *
 * @author buimi
 */
public class ExampleMain {
    public static void main(String[] args) {
        Example so = new Example(9.2);
        Example so2 = new Example(9.2);
        System.out.println("Nghich dao: "+so.nghichDao());
        System.out.println("Phan thap phan: "+so.thapPhan());
        System.out.println("So sanh: "+so.equals(so2));
    }
}
