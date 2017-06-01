package personal.jpa.jpql;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestRun {
    public static void main(String[] args){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpql");



        factory.close();
    }
}
