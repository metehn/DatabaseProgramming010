package inventory;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class ProductQueryAggregateTest {

    public static void main(String[] args) {

        long productId = 1L;

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("DatabaseProgramming010PU");
        EntityManager manager = factory.createEntityManager();

        //JPA-QL
        //String string = "select count(product) from Product as product ";
        String string = "select avg(product.salesPrice) from Product as product ";
        Query query = manager.createQuery(string);

        //long count = (Long)query.getSingleResult();
        double avg = (Double)query.getSingleResult();
        manager.close();

        //System.out.println("Sayı: " + count);
        System.out.println("Ortalama: " + avg);
    }

}
