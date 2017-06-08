package personal.jpa.criteria.basic;

import personal.jpa.Employee;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class BasicTestRun {
    public static void main(String[] args){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpql");
        EntityManager manager = factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();

        transaction.begin();

        CriteriaBuilder criteriaBuilder = manager.getCriteriaBuilder();
        CriteriaQuery criteriaQuery = criteriaBuilder.createQuery();

        Root<Employee> from = criteriaQuery.from(Employee.class);

        CriteriaQuery select = criteriaQuery.select(from);

        TypedQuery typedQuery = manager.createQuery(select);

        List<Employee> list = typedQuery.getResultList();

        for(Employee e: list){
            System.out.println(String.format("id: %s, name: %s", e.getEid(), e.getEname()));
        }

        transaction.commit();
        manager.close();
        factory.close();
    }
}
