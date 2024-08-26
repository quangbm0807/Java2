/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm_mob1023_buiminhquang_ps28437_NhanVien;

import java.io.Serializable;

public class Employee implements Serializable {

    private String maNv, hoTen, email;
    private int tuoi;
    private double luong;

    public Employee() {
    }

    public Employee(String maNv, String hoTen, String email, int tuoi, double luong) {
        this.maNv = maNv;
        this.hoTen = hoTen;
        this.email = email;
        this.tuoi = tuoi;
        this.luong = luong;
    }

    public String getMaNv() {
        return maNv;
    }

    public void setMaNv(String maNv) {
        this.maNv = maNv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

}
