import java.time.LocalDate;

public class Loan {
    String bookId;
    String memberId;
    LocalDate loanDate;
    static LocalDate returnDate;

    public Loan(String bookId, String memberId, LocalDate loanDate, LocalDate returnDate) {
        this.bookId = bookId;
        this.memberId = memberId;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
    }
}
