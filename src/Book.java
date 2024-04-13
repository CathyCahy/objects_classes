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
}
