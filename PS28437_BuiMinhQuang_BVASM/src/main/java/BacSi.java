
import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author buimi
 */
public class BacSi implements Serializable{
    private String maBs, hoTen, khoa;
    private int nam;

    public BacSi() {
    }

    public BacSi(String maBs, String hoTen, String khoa, int nam) {
        this.maBs = maBs;
        this.hoTen = hoTen;
        this.khoa = khoa;
        this.nam = nam;
    }

    public String getMaBs() {
        return maBs;
    }

    public void setMaBs(String maBs) {
        this.maBs = maBs;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }
    
}
