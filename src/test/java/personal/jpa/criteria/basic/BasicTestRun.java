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
        
        Employee newEmployee = new Employee();
        newEmployee.setDeg("Pechnical Writer");
        newEmployee.setEname("John");
        newEmployee.setSalary(38000.0);
        
        manager.persist(newEmployee);

        Root<Employee> from = criteriaQuery.from(Employee.class);
        

        CriteriaQuery select = criteriaQuery.select(from);

        TypedQuery typedQuery = manager.createQuery(select);

        List<Employee> list = typedQuery.getResultList();
        
//        List<Employee> list = manager.createQuery("SELECT e FROM Employee e WHERE e.eid = 1").getResultList();
        
//        System.out.println(list.size());

        for(Employee e: list){
            System.out.println(String.format("id: %s, name: %s", e.getEid(), e.getEname()));
        }

        transaction.commit();
        manager.close();
        factory.close();
    }
}
