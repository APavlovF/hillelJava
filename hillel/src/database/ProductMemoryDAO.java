package database;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

/**
 * Created by APavlov on 14.12.2015.
 */
public class ProductMemoryDAO implements ProductDAO {
    private List<Product> products;

    public ProductMemoryDAO() {
        products = new ArrayList<>();
        products.add(new Product(1, "Mouse", "Computers", 10));
        products.add(new Product(2, "Keyboard", "Computers", 15));
    }


    @Override
    public Optional<Product> findById(int id) {
        /*
        for (Product product : products){
            if(product.getId() == id){
                return Optional.of(product);
            }
        }
        return Optional.empty();
        */
        return products.stream()
                .filter(product -> product.getId() == id)
                .findFirst();
    }

    /*    substituted by lambda in upper method
    public boolean match(Product product){
        return product.getId() == 5;
    }
    */
    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void deleteById(int id) {
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getId() == id) {
                iterator.remove();
                return;
            }
        }
    }
    /* ������ ������� �� ��������� ����� ��� ��� ���:

        products.removeIf(p -> p.getId() == id);

        (��� �� ����� ������, ��� ����� ������ � ����������)
     */

    @Override
    public void update(Product product) {
        deleteById(product.getId());
        create(product);
    }

    @Override
    public void create(Product product) {
        products.add(product);
    }
}
