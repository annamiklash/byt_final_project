package pjatk.byt.group3.reservation;

import pjatk.byt.group3.book.Book;
import pjatk.byt.group3.member.LibraryMember;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Reservation  {

    private final LibraryMember libraryMember;
    private final List<Book> bookList = new ArrayList<>();
    private LocalDate reservationDate;

    public Reservation(LibraryMember libraryMember, Book book) {
        this.libraryMember = libraryMember;
        bookList.add(book);

    }

    public void cancelReservation() {
        System.out.println("reservation cancelled");
    }

    public void setReservationDate(LocalDate reservationDate) {
        this.reservationDate = reservationDate;
    }

    public LibraryMember getMember() {
        return libraryMember;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public LocalDate getReservationDate() {
        return reservationDate;
    }
}
