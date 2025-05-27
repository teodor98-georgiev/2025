public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        Book book1 = new Book("B001", "The Hobbit", "J.R.R. Tolkien", "Fantasy", true, 5);
        Book book2 = new Book("B002", "1984", "George Orwell", "Dystopian", true, 3);
        Book book3 = new Book("B003", "Clean Code", "Robert C. Martin", "Programming", true, 2);
        Book book4 = new Book("B004", "To Kill a Mockingbird", "Harper Lee", "Classic", true, 4);
        Book book5 = new Book("B005", "The Great Gatsby", "F. Scott Fitzgerald", "Classic", true, 3);
        Book book6 = new Book("B006", "Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "Fantasy", true, 6);
        Book book7 = new Book("B007", "The Pragmatic Programmer", "Andrew Hunt", "Programming", true, 2);
        Book book8 = new Book("B008", "Brave New World", "Aldous Huxley", "Dystopian", true, 3);
        Book book9 = new Book("B009", "The Catcher in the Rye", "J.D. Salinger", "Classic", true, 4);
        Book book10 = new Book("B010", "Effective Java", "Joshua Bloch", "Programming", true, 2);
        Book book11 = new Book("B011", "The Lord of the Rings", "J.R.R. Tolkien", "Fantasy", true, 5);

        lib.addBook(book1);
        lib.addBook(book2);
        lib.addBook(book3);
        lib.addBook(book4);
        lib.addBook(book5);
        lib.addBook(book6);
        lib.addBook(book7);
        lib.addBook(book8);
        lib.addBook(book9);
        lib.addBook(book10);
        lib.addBook(book11);



        Member m1 = new Member("001", "Josif Gustaffson", "56-789-34", "gust@gmail.com");
        Member m2 = new Member("002", "Jonas Naimekkoo", "89-916-01", "naimekkoo1@yahoo.com");
        Member m3 = new Member("003", "Karin Daalmans", "23-493-12","Daal@gmail.com");
        Member m4 = new Member("004", "Anthony O'Donnel", "12-389-23","an.don@hotmail.com");
        lib.registerMember(m1);
        lib.registerMember(m2);
        lib.registerMember(m3);
        lib.registerMember(m4);

        //lib.displayMembers();

        lib.loanBook("Josif Gustaffson", book1, book2, book3 );
        lib.loanBook("Karin Daalmans", book4);

        System.out.println("loaned books");
        lib.displayLoanedBooks();
        System.out.println("============");

        lib.displayAvailableBooks();

    }
}