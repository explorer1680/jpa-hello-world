package personal.jpa.jpql.basic;

import javax.persistence.*;
import java.util.List;

public class TestRun {
    public static void main(String[] args){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpql");
        EntityManager manager = factory.createEntityManager();
        EntityTransaction ts = manager.getTransaction();
        ts.begin();

        Query query1 = manager.createQuery("SELECT ename FROM Employee");

        List<String> list = query1.getResultList();

        for(String e: list){
            System.out.println("------------" + e);
        }
        

        Query query2 = manager.createQuery("SELECT MAX(salary) FROM Employee");

        Double maxSalary = (Double)query2.getSingleResult();

        System.out.println("Max salary: " + maxSalary);
        
        
        ts.commit();
        manager.close();

        factory.close();
    }
}
