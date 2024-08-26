/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide7;

/**
 *
 * @author buimi
 */
enum Thutrongtuan{
    HAI, BA, TU, NAM, SAU, BAY, CN
}
public class EnumDemo {
    public static void main(String[] args) {
        Thutrongtuan thu;
        thu = Thutrongtuan.BAY;
        if(thu == Thutrongtuan.BAY){
            System.out.println("Cuoi tuan");
        }
        thu = Thutrongtuan.BA;
        switch(thu){
            case HAI:
                System.out.println("Thu hai");
                break;
            case BA:
                System.out.println("Thu ba");
                break;
            case TU:
                System.out.println("Thu tu");
                break;
            case NAM:
                System.out.println("Thu nam");
                break;
            case SAU:
                System.out.println("Thu sau");
                break;
            case BAY:
                System.out.println("Thu bay");
                break;
            case CN:
                System.out.println("Thu chu nhat");
                break;
        }
    }
}
