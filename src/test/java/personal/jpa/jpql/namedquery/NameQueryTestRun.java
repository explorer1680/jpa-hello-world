package personal.jpa.jpql.namedquery;

import personal.jpa.Employee;

import javax.persistence.*;

public class NameQueryTestRun {

    public static void main(String[] args){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpql");
        EntityManager manager = factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();

        Query query = manager.createNamedQuery("find employee by id");
        query.setParameter("id", 4);

        Employee e = (Employee)query.getSingleResult();

        System.out.println(String.format("id: %s, name: %s", e.getEid(), e.getEname()));

        transaction.commit();
        manager.close();
        factory.close();
    }

}
