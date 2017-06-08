package personal.jpa.jpql.order;

import personal.jpa.Employee;

import javax.persistence.*;
import java.util.List;

public class TestRun {
    public static void main(String[] args){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpql");
        EntityManager manager = factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();

        Query query = manager.createQuery("SELECT e FROM Employee e ORDER BY e.ename ASC");

        List<Employee> list = (List<Employee>)query.getResultList();

        for(Employee e: list){
            System.out.println(String.format("id: %s, name: %s", e.getEid(), e.getEname()));
        }


        transaction.commit();
        manager.close();



        factory.close();
    }
}
