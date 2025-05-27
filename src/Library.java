import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    ArrayList<Book> books;
    ArrayList<Member> members = new ArrayList<>();
    Map<String,List<Book>> booksByGenre = new HashMap<>();
    Map<String,List<Book>> loanedBooks = new HashMap<>();


    public Library() {
        this.books = new ArrayList<>();
    }

    public void loanBook(String memberName, Book... book){
        // iteration over given list
        for (Book b : book){
            // check if book is available
            if (searchBook(b)){
                removeBook(b);
                // searching for same memberId in list of members
                String name = "";
                for (Member m : members){
                    if (m.name.equals(memberName)){
                        name = name + memberName;
                        break;
                    }
                }
                // adding with a key-value pair user and borrowed books
                //loanedBooks.put(name, List.of(book));
                // done to permise adding more books later
                loanedBooks.putIfAbsent(name, new ArrayList<>());
                loanedBooks.get(name).add(b);
            }
            else{
                System.out.println("sorry, current book is not available");
            }
        }

    }

    public void addBook(Book book){
        book.isAvail = true;
        books.add(book);
        loanedBooks.remove(book);
    }



    public void registerMember(Member m){
        members.add(m);
    }

//    public void displayMembers(){
//        for (Member m : members){
//            System.out.println(m);
//        }
//    }


    public void displayLoanedBooks(){ // displays loaned book by a user and user who borrowed books as well
        for (Map.Entry<String,List<Book>> entry : loanedBooks.entrySet()){
            System.out.println(entry.getKey() + " borrowed: " + " " + entry.getValue() );
        }
    }

    public void displayAvailableBooks(){
        groupByGenre();
        for (Map.Entry<String,List<Book>> entry : booksByGenre.entrySet()){
            System.out.println(entry.getKey() + entry.getValue());
        }
    }




    // internal library methods
    public void removeBook(Book book){
        book.isAvail = false;
        books.remove(book);
    }

    public void groupByGenre(){
        booksByGenre.clear();
        for (Book b : books){
            String key = b.genre;
            if (!booksByGenre.containsKey(key)){
                List<Book> bookToAdd = new ArrayList<>();
                bookToAdd.add(b);
                booksByGenre.put(key,bookToAdd);
            }
            else {
                booksByGenre.get(key).add(b);
            }
        }
    }

    public boolean searchBook(Book book){
        boolean verdict = false;
        for (Book book1 : books){
            if (book1.equals((book))){
                verdict = book.isAvail;
            }

        }
        return verdict;
    }
}
