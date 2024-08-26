/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide1;

/**
 *
 * @author buimi
 */
public class SinhVienBiz extends SinhVien {

    public double keToan, marketing, banHang;

    @Override
    public double getDIemTB() {
        return (keToan + marketing + banHang) / 3;
    }

}
