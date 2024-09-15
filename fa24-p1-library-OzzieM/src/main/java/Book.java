import java.time.LocalDate;
import java.util.Objects;

public class Book {
    /**
     * @author Ozzie Munoz
     * This is a Plain Old Java Object (POJO)
     * That represents a book
      */

    public static final int ISBN_ = 0;
    public static final int TITLE_ = 1;
    public static final int SUBJECT_ = 2;
    public static final int PAGE_COUNT_ = 3;
    public static final int AUTHOR_ = 4;
    public static final int DUE_DATE_ = 5;

    private String ISBN;
    private String title;
    private String subject;
    private int pageCount;
    private String author;
    private LocalDate dueDate;

    public Book(String ISBN, LocalDate dueDate, String title, String subject, int pageCount, String author) {
        this.ISBN = ISBN;
        this.dueDate = dueDate;
        this.title = title;
        this.subject = subject;
        this.pageCount = pageCount;
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;
        return getPageCount() == book.getPageCount() && Objects.equals(getISBN(), book.getISBN()) && Objects.equals(getTitle(), book.getTitle()) && Objects.equals(getSubject(), book.getSubject()) && Objects.equals(getAuthor(), book.getAuthor());
    }

    @Override
    public String toString() {
        return title + " by " + author + " ISBN " + ISBN;
    }


    @Override
    public int hashCode() {
        int result = Objects.hashCode(getISBN());
        result = 31 * result + Objects.hashCode(getTitle());
        result = 31 * result + Objects.hashCode(getSubject());
        result = 31 * result + getPageCount();
        result = 31 * result + Objects.hashCode(getAuthor());
        return result;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
}

