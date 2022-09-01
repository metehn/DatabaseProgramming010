package inventory;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

public class ProductQueryListTest {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("DatabaseProgramming010PU");
        EntityManager manager = factory.createEntityManager();

        //JPA-QL
        String string = "select product from Product as product";
        Query query = manager.createQuery(string);

        List<Product> productList = query.getResultList();

        manager.close();

        for(Product product : productList){

            System.out.println(product.toString());
        }


    }

}
