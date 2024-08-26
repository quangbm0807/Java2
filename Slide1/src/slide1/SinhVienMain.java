/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide1;

/**
 *
 * @author buimi
 */
public class SinhVienMain {

    public static void main(String[] args) {
        SinhVienIT sv1 = new SinhVienIT();
        sv1.ten = "Quang";
        sv1.java = 9;
        sv1.css = 10;
        SinhVienBiz sv2 = new SinhVienBiz();
        sv2.ten = "Khoa";
        sv2.banHang = 8;
        sv2.keToan = 7;
        sv2.marketing = 9;
        System.out.println("Ten: "+sv1.ten +" -- DTB: "+sv1.getDIemTB());
        System.out.println("Ten: "+sv2.ten +" -- DTB: "+sv2.getDIemTB());
    }

}
