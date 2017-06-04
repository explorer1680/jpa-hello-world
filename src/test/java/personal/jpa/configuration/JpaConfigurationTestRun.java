package personal.jpa.configuration;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaConfigurationTestRun {
	public static void main(String[] args){
		EntityManagerFactory managerFactory = Persistence
	            .createEntityManagerFactory("configuration");
		
		EntityManager manager1 = managerFactory.createEntityManager();
        EntityTransaction transaction1 = manager1.getTransaction();
        transaction1.begin();
        
        Cat c1 =new Cat("black");
        
        manager1.persist(c1);
        
        
        transaction1.commit();
        
        manager1.close();
        
        EntityManager manager2= managerFactory.createEntityManager();
        EntityTransaction transaction2 = manager2.getTransaction();
        transaction2.begin();
        
        
        List<Cat> cats = manager2.createQuery("SELECT c FROM Cat c", Cat.class).getResultList();
        
        for(Cat c : cats){
        	System.out.println(c);
        }
        
        transaction2.commit();
        manager2.close();
        
        managerFactory.close();
	}
}
