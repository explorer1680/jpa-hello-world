package personal.jpa.jpql.sqlresultsetmapping.constructresultmapping;

import javax.persistence.Entity;
import javax.persistence.Id;

public class BookValue {


    private String authorName;
    private String bookName;

    public BookValue() {
    }

    public BookValue(String authorName, String bookName) {
//        this.idd = BookValue.i ++;
        this.authorName = authorName;
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "BookValue{" +
                "authorName='" + authorName + '\'' +
                ", bookName='" + bookName + '\'' +
                '}';
    }
}
