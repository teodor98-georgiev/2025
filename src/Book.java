public class Book {
    String bookId;
    String title;
    String author;
    String genre;
    boolean isAvail;
    int totalCopies;

    public Book(String bookId, String title, String author, String genre, boolean isAvail, int totalCopies) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvail = isAvail;
        this.totalCopies = totalCopies;
    }
    public String toString(){
        return title + " - " + author + ", genre: " + genre;
    }
}
