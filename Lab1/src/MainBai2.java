
import java.util.Scanner;

public class MainBai2 {

    public static void main(String[] args) {
        Product prod = new Product();
        Product pro[] = new Product[5];
        for (int i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap ten san pham: ");
            String name = sc.nextLine();
            System.out.println("Nhap gia san pham: ");
            double price = sc.nextDouble();
            sc.nextLine();
            pro[i] = new Product(name, price);
        }
        System.out.println("Thong tin san pham:");
        for (Product product : pro) {
            System.out.println("Ten: " + product.getName());
            System.out.println("Gia: " + product.getPrice());
            System.out.println("Thue: " + product.getImportTax());
        }
    }
}
