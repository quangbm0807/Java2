/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai5;

/**
 *
 * @author buimi
 */
public class SanPham {
    private String tenSanPham;
    private int soLuong;
    private String chiTiet;

    public SanPham(String tenSanPham, int soLuong, String chiTiet) {
        this.tenSanPham = tenSanPham;
        this.soLuong = soLuong;
        this.chiTiet = chiTiet;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public String getChiTiet() {
        return chiTiet;
    }
}
