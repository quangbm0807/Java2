package lab8;

public class ProductManager {

    public static void main(String[] args) {
        Product p1 = new Product("iPhone 14prm", 23000.0);
        Product p2 = new Product("iPhone 15prm", 33000.0);

        ProductDAO dao = new ProductDAO();
        dao.add(p1);
        dao.add(p2);
        try {
            dao.load("D:/data.dat");
            System.out.println("ghi file thanh cong");
            dao.store("D:/data.dat");
            System.out.println("doc file thanh cong");
            Product p = dao.find("iPhone 15prm");
            System.out.println("Name: " + p.getName());
            System.out.println("Price: " + p.getPrice());

        } catch (Exception e) {
            System.out.println(""+e);
        }

    }
}
