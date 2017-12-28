package personal.jpa.jpql.sqlresultsetmapping.constructresultmapping;

import javax.persistence.*;


@SqlResultSetMapping(
        name = "BookAuthorMapping",
        classes = @ConstructorResult(
                targetClass = BookValue.class,
                columns = {
                        @ColumnResult(name = "authorName"),
                        @ColumnResult(name = "bookName")
                }
        )
)
@Entity
//@Table(name="book_2")
public class Book {

    @Id
    private Integer id;

    private String name;

    @ManyToOne
    @JoinColumn(name="author_id")
    private Author author;

    public Book() {
    }

    public Book(Integer id, String name, Author author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
