package persistence;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class SamplePersistTest { //SampleInsertTest

    public static void main(String[] args) {

        Sample sample = new Sample().builder().sampleId(0).sampleName("Metehan").sampleValue(45.0).build();

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("DatabaseProgramming010PU");
        EntityManager manager = factory.createEntityManager(); //EntityManager, entitiy'i databaseye yazıp okuyan sınıftır

        manager.getTransaction().begin();

        manager.persist(sample);

        manager.getTransaction().commit();
        manager.close();

    }

}
