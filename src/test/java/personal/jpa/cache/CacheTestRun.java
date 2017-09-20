package personal.jpa.cache;

import javax.persistence.*;

public class CacheTestRun {

    public static void main(String[] args){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("cache-hibernate");

        EntityManager manager = factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();

        transaction.begin();

        Cat cat = new Cat();
        manager.persist(cat);


        Dog dog = new Dog();
        manager.persist(dog);

        transaction.commit();

        Cache cache = factory.getCache();

        if(cache.contains(Cat.class,1)){
            System.out.println("---------Cat is cached.");
        }

        if(cache.contains(Dog.class, 1)){
            System.out.println("++++++++++Dog is cached.");
        }



        manager.close();

        factory.close();
    }
}
