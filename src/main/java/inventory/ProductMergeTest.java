package inventory;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ProductMergeTest {


    public static void main(String[] args) {

        long productId = 1L;
        Product product = new Product().builder().productId(productId).productName("Bilgisayar").salesPrice(12355.0).build();
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("DatabaseProgramming010PU");
        EntityManager manager = factory.createEntityManager();

        manager.getTransaction().begin();

        manager.merge(product);

        manager.getTransaction().commit();
        manager.close();

    }


}
