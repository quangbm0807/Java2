/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai5;

/**
 *
 * @author buimi
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Bai5Main {

    public static void main(String[] args) {
        ArrayList<SanPham> danhSachSanPham = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Chon tuy chon:");
            System.out.println("1. Them san pham");
            System.out.println("2. Xuat danh sach san pham");
            System.out.println("3. Thoat");

            int luaChon = sc.nextInt();

            switch (luaChon) {
                case 1:
                    themSanPham(danhSachSanPham, sc);
                    break;
                case 2:
                    xuatDanhSachSanPham(danhSachSanPham);
                    break;
                case 3:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

    private static void themSanPham(ArrayList<SanPham> danhSachSanPham, Scanner sc) {
        sc.nextLine();
        System.out.println("Nhap ten san pham: ");
            String tenSanPham = sc.nextLine();
            System.out.println("Nhap so luong: ");
            int soLuong = sc.nextInt();
            sc.nextLine();
        System.out.print("Nhap chi tiet san pham: ");
        String chiTiet = sc.next();

        SanPham sanPham = new SanPham(tenSanPham, soLuong, chiTiet);
        danhSachSanPham.add(sanPham);
        System.out.println("San pham da duoc them.");
        sc.nextLine();
    }

    private static void xuatDanhSachSanPham(ArrayList<SanPham> danhSachSanPham) {
        System.out.println("Danh sach san pham:");
        int index = 1;
        for (SanPham sanPham : danhSachSanPham) {
            System.out.println("San pham " + index + ":");
            System.out.println("Ten san pham: " + sanPham.getTenSanPham());
            System.out.println("So luong: " + sanPham.getSoLuong());
            System.out.println("Chi tiet san pham: " + sanPham.getChiTiet());
            index++;
        }
    }
}
