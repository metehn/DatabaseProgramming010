package persistence;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class SamplePersistTest { //SampleInsertTest

    public static void main(String[] args) {


        //Amacımız bu nesneyi sql kullanmadan databaseye yazmak
        Sample sample = new Sample().builder().sampleId(0).sampleName("Metehan").sampleValue(45.0).build();

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("DatabaseProgramming010PU");
        EntityManager manager = factory.createEntityManager(); //EntityManager, entitiy'i databaseye yazıp okuyan sınıftır

        /*
        JPA kütüphanesi herhangi bir yazma, silme işleminde Transaction açmamızı
        istiyor(okuma, select tarzı işlemlerde gerek yok). Bu jdbc'de opsiyonel
        ama burada böyle bir şey söz konusu değil, yapmak zorundayız

        */
        manager.getTransaction().begin();

        manager.persist(sample);

        manager.getTransaction().commit();
        manager.close();

    }

}
