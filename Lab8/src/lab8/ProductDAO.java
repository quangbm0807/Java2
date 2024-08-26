package lab8;

import java.io.Serializable;

public class ProductDAO extends DAO<Product>{

    @Override
    public void update(Product entity) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equalsIgnoreCase(entity.getName())) {
                list.set(i, entity);
                break;
            }
        }
    }

    @Override
    public Product find(Serializable id) {
        for (Product p : list) {
            if (p.getName().equals(id)) {
                return p;
            }
        }
        return null;
    }

}
