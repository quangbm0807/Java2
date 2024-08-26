/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slide4;

/**
 *
 * @author buimi
 */
public class myexception extends Exception {
    private int message;
    public myexception(int a){
        message = a;
    }
    @Override
    public String toString(){
        return "My exception " +message; 
    }
    public static void tintoan(int a) throws myexception{
        if(a>10){
            throw new myexception(a);
        }
        System.out.println("Normal exit");
    }
    public static void main(String[] args) {
        try {
            tintoan(1);
            tintoan(20);
        } catch (myexception e) {
            System.out.println("Caught "+e);
        }
    }
   
}
