package inventory;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ProductFindTest {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("DatabaseProgramming010PU");
        EntityManager manager = factory.createEntityManager();

        Product product = manager.find(Product.class, 1L);

        manager.close();

        System.out.println(product.toString());
    }

}
