import java.util.Objects;

public class Book {
    private String bookName;
    private Author authorName;
    private int bookDate;

    public Book (String bookName, Author authorName, int bookDate) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.bookDate = bookDate;
    }
    public String getBookName () {
        return this.bookName;
    }
    public Author getAuthorName (){
        return this.authorName;
    }
    public int getBookDate() {
        return this.bookDate;
    }
    public void setBookDate(int bookDate) {
        this.bookDate = bookDate;
    }
    @Override
    public String toString () {
        return "Книга " + bookName + ", автор " + authorName + ", издано в " + bookDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookDate == book.bookDate && Objects.equals(bookName, book.bookName) && Objects.equals(authorName, book.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, authorName, bookDate);
    }
}
