package personal.jpa.mapping.component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ExampleTestRun {
	
	public static void main(String[] args){
		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("component");
		
		EntityManager manager = managerFactory.createEntityManager();
		
		EntityTransaction ts = manager.getTransaction();
		
		ts.begin();
		
		AClass aClass = new AClass();
		aClass.setId(1);
		EmClass emClass = new EmClass();
		emClass.setaClass(aClass);
		emClass.setDescription("A aClass");
		
		Example example = new Example();
		example.setEmClass(emClass);
		example.setId(2);
		example.setStr("a example");
		
		manager.persist(aClass);
		manager.persist(example);
		
		
		ts.commit();
		manager.close();
		
		managerFactory.close();
		
	}

}
