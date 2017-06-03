package personal.jpa.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestRun {
    public static void main(String[] args){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpql");
        EntityManager manager = factory.createEntityManager();
        EntityTransaction ts = manager.getTransaction();
        ts.begin();
        
        
        
        
        
        
        
        ts.commit();
        manager.close();

        factory.close();
    }
}
