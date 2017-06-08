package personal.jpa.jpql.betweenandlike;

import personal.jpa.Employee;

import javax.persistence.*;
import java.util.List;

public class TestRun {
    public static void main(String[] args){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpql");
        EntityManager manager = factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();

        Query query1 = manager.createQuery("SELECT e FROM Employee e WHERE e.salary BETWEEN 30000 AND 40000");

        List<Employee> list1 = (List<Employee>)query1.getResultList();

        for(Employee e: list1){
            System.out.println(String.format("id: %s, salary: %s", e.getEid(), e.getSalary()));
        }

        Query query2 = manager.createQuery("SELECT e FROM Employee e WHERE e.ename LIKE 'M%'");

        List<Employee> list2 = (List<Employee>)query2.getResultList();

        for(Employee e: list2){
            System.out.println(String.format("id: %s, name: %s", e.getEid(), e.getEname()));
        }


        transaction.commit();
        manager.close();



        factory.close();
    }



}
