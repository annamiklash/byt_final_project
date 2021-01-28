package pjatk.byt.group3.borrow;

import pjatk.byt.group3.book.Book;

import pjatk.byt.group3.member.LibraryMember;
import pjatk.byt.group3.payment.Payment;

import com.sun.istack.internal.Nullable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Borrow {

    private final LocalDate borrowDate;
    private final LocalDate dueDate;
    @Nullable
    private LocalDate returnDate;
    private final LibraryMember member;
    private final List<Book> bookList = new ArrayList<>();

    public Borrow(LocalDate borrowDate, LocalDate dueDate, LibraryMember member, Book book) {
        this.borrowDate = borrowDate;
        this.dueDate = dueDate;
        this.member = member;
        bookList.add(book);
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public Borrow createBorrowRequest() {
        return this;
    }

    public Payment calculatePaymentForOverdue() {
        return new Payment(0D, this);
    }


    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public LibraryMember getMember() {
        return member;
    }

    public List<Book> getBookList() {
        return bookList;
    }
}
