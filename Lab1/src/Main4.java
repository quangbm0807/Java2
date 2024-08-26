
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author buimi
 */
import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        Product pro[] = new Product[3];
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            if (i != 0) {
                System.out.println("Nhap ten san pham: ");
                String name = sc.nextLine();
                System.out.println("Nhap gia san pham: ");
                double price = sc.nextDouble();
                sc.nextLine();
                pro[i] = new Product(name, price);
                pro[i].insert();
                pro[i].update();
                pro[i].delete();
                pro[i].select();
            } else {
                System.out.println("Nhap ten san pham: ");
                String name = sc.nextLine();
                System.out.println("Nhap gia san pham: ");
                double price = sc.nextDouble();
                sc.nextLine();
                pro[i] = new NoTaxProduct(name, price);
                pro[i].insert();
                pro[i].update();
                pro[i].delete();
                pro[i].select();
            }
        }
        System.out.println("Thong tin san pham:");
        for (Product product : pro) {
            System.out.println("Ten: " + product.getName());
            System.out.println("Gia: " + product.getPrice());
            System.out.println("Thue: " + product.getImportTax());
        }
    }
}
