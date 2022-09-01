package inventory;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

public class ProductQuerySingleTest {

    public static void main(String[] args) {

        long productId = 1L;

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("DatabaseProgramming010PU");
        EntityManager manager = factory.createEntityManager();

        //JPA-QL
        String string = "select product from Product as product where product.productId =:productId";
        Query query = manager.createQuery(string);
        query.setParameter("productId", productId);

        try {
            Product product = (Product) query.getSingleResult(); //Kaydı bulamazsa veya birden fazla bulursa hata verir!
            System.out.println(product.toString());
        }catch (Exception e){
            System.out.println("Hata!");
        }


        manager.close();

    }

}
