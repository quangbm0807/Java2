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
public class Bai2 {

    public static void main(String[] args) {
        ArrayList<Integer> myarrr = new ArrayList<Integer>();
        for(int i=1; i<=10; i++){
            myarrr.add(i);
        }
        System.out.println("Cac so tu 1-10 la");
        for(int i:myarrr){
            System.out.println(""+i);
        }
    }
}
