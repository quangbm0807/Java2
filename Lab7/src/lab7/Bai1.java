/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

/**
 *
 * @author buimi
 *
 */
enum Career {
    UDPM, TKTW, LTDĐ, TKĐH
}

public class Bai1 {

    public String fullname;
    public Career career;

    public void print() {
        System.out.println(">Fullname: " + this.fullname);
        switch (this.career) {
            case UDPM:
                System.out.println(">Career: Ứng dụng phần mềm");
                break;
            case TKTW:
                System.out.println(">Career: Thiết kế trang web");
                break;
            case LTDĐ:
                System.out.println(">Career: Lập trình di động");
                break;
            case TKĐH:
                System.out.println(">Career: Thiết kế đồ họa");
                break;
        }
    }

    public static void main(String[] args) {
        Bai1 sv = new Bai1();
        sv.fullname = "Nguyễn Văn Tèo";
        sv.career = Career.valueOf("UDPM");
        sv.print();
    }

}
