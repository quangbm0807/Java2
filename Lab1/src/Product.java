
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author buimi
 */
    public class Product implements DAO{
        private String name;
        private double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public Product() {
            name = "";
            price =0;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
        public double getImportTax(){
            return price*0.1;
        }
        public void nhap(){
             Scanner sc = new Scanner(System.in);
                System.out.println("Nhap ten san pham: ");
                String name = sc.nextLine();
                System.out.println("Nhap gia san pham: ");
                double price = sc.nextDouble();
                sc.nextLine();
        }
        public void xuat(){
             System.out.println("Ten: " + getName());
                System.out.println("Gia: " + getPrice());
                System.out.println("Thue: " + getImportTax());
        }

    @Override
    public void insert() {
        System.out.println("Them san pham thanh cong");
    }

    @Override
    public void update() {
        System.out.println("Cap nhat san pham thanh cong");
    }

    @Override
    public void delete() {
        System.out.println("Xoa san pham thanh cong");
    }

    @Override
    public void select() {
        System.out.println("Chon san pham thanh cong");
    }
}
