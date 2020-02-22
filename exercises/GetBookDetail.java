package exercises;

public class GetBookDetail{
    private String bookId, title, author, publisher;

    public GetBookDetail(String bookId, String title, String author, String publisher){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public String getBookId(){
        return bookId;
    }

    public void setBookID(String bookID) {
        this.bookId = bookID;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

}