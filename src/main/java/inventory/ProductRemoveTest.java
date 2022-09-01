package inventory;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ProductRemoveTest {


    public static void main(String[] args) {

        long productId = 1L;
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("DatabaseProgramming010PU");
        EntityManager manager = factory.createEntityManager();

        Product product = manager.find(Product.class, productId);

        manager.getTransaction().begin();

        manager.remove(product);

        manager.getTransaction().commit();
        manager.close();

    }

}
