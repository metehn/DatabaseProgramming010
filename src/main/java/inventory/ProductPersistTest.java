package inventory;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import persistence.Sample;

public class ProductPersistTest {

    public static void main(String[] args) {


        //Amacımız bu nesneyi sql kullanmadan databaseye yazmak
        Product product = new Product().builder().productId(0).productName("Tablet Bilgisayar").salesPrice(2225.0).build();

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("DatabaseProgramming010PU");
        EntityManager manager = factory.createEntityManager(); //EntityManager, entitiy'i databaseye yazıp okuyan sınıftır

        /*
        JPA kütüphanesi herhangi bir yazma, silme işleminde Transaction açmamızı
        istiyor(okuma, select tarzı işlemlerde gerek yok). Bu jdbc'de opsiyonel
        ama burada böyle bir şey söz konusu değil, yapmak zorundayız

        */
        manager.getTransaction().begin();

        manager.persist(product);

        manager.getTransaction().commit();
        manager.close();

    }

}
