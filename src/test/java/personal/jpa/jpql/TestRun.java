package personal.jpa.jpql;

import javax.persistence.*;
import java.util.List;

public class TestRun {
    public static void main(String[] args){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpql");
        EntityManager manager = factory.createEntityManager();
        EntityTransaction ts = manager.getTransaction();
        ts.begin();

        Query query = manager.createQuery("SELECT e.ename FROM Employee e");

        List<String> list = query.getResultList();

        for(String e: list){
            System.out.println("------------" + e);
        }
        
        
        
        
        ts.commit();
        manager.close();

        factory.close();
    }
}
