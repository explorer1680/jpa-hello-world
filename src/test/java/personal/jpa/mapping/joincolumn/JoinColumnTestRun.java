package personal.jpa.mapping.joincolumn;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JoinColumnTestRun {
    public static void main(String[] args){
		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("joincolumn");
		
		EntityManager manager = managerFactory.createEntityManager();
		
		EntityTransaction ts = manager.getTransaction();
		
		ts.begin();
		
		ts.commit();
		manager.close();
		
		managerFactory.close();
    }
}
