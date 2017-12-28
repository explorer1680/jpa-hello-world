package personal.jpa.jpql.sqlresultsetmapping.constructresultmapping;

import javax.persistence.*;
import java.util.List;

public class TestRun {

    public static void main(String[] args){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("sql-result-set-mapping");
        EntityManager manager1 = factory.createEntityManager();
        EntityTransaction ts1 = manager1.getTransaction();
        ts1.begin();

        Author author1 = new Author(1, "Author1");
        Author author2 = new Author(2, "Auther2");

        Book book1 = new Book(1, "Book1", author1);
        Book book2 = new Book(2, "Book2", author1);
        Book book3 = new Book(3, "Book3", author2);
        Book book4 = new Book(4, "Book4", author2);

        manager1.persist(author1);
        manager1.persist(author2);
        manager1.persist(book1);
        manager1.persist(book2);
        manager1.persist(book3);
        manager1.persist(book4);

//        Query query1 = manager1.createQuery("SELECT ename FROM Employee");
//
//        List<String> list = query1.getResultList();
//
//        for(String e: list){
//            System.out.println("------------" + e);
//        }
//
//
//        Query query2 = manager1.createQuery("SELECT MAX(salary) FROM Employee");
//
//        Double maxSalary = (Double)query2.getSingleResult();
//
//        System.out.println("Max salary: " + maxSalary);


        ts1.commit();
        manager1.close();



        EntityManager manager2 = factory.createEntityManager();
        EntityTransaction ts2 = manager2.getTransaction();
        ts2.begin();

//        Query q = manager2.createQuery("SELECT a.name authorName, b.name bookname FROM Author a, Book b " +
//                "");

        Query q1 = manager2.createQuery("SELECT a.name, b.name FROM Author a, Book b " +
                "WHERE b.author = a" );

        List<Object[]> resultList1 = q1.getResultList();

        for(Object[] l: resultList1){
            System.out.println(l[0] + " : " + l[1]);
        }

//        Query q = manager2.createNativeQauthor_id"BookAuthorMapping" );

        Query q2 = manager2.createNativeQuery("SELECT a.name as authorName, b.name as bookName FROM Author a, Book b WHERE b.author_id = a.id", "BookAuthorMapping" );


        List<BookValue> resultList2 = q2.getResultList();

        for(BookValue o: resultList2){
            System.out.println(o);
        }


        Query q3 = manager2.createNativeQuery("SELECT a.name as authorName, b.name as bookName, b.id FROM Author a, Book b WHERE b.author_id = a.id", BookAuthor.class );

        List<BookAuthor> resultList3 = q3.getResultList();
        for(BookAuthor o: resultList3){
            System.out.println(o);
        }


        ts2.commit();
        manager2.close();

        factory.close();
    }


}
