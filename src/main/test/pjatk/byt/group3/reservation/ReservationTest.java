package pjatk.byt.group3.reservation;

import org.junit.Before;
import org.junit.Test;
import pjatk.byt.group3.book.Book;
import pjatk.byt.group3.enums.GenreEnum;
import pjatk.byt.group3.member.LibraryMember;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ReservationTest {

    LibraryMember member;
    Book book;
    Reservation reservation;

    @Before
    public void setUp() {
        member = new LibraryMember("John", "Kowalski", "john.kowalski@gmail.com", "Warszawaska 2", "123456789");
        book = new Book("Title", "Author", GenreEnum.NOVEL, "PublisherName", new BigInteger("1234566789"), null);
        reservation = new Reservation(member, book);
    }

    @Test
    public void testReservationGetter() {
        assertEquals(Collections.singletonList(book), reservation.getBookList());
        assertEquals(member, reservation.getMember());
    }

    @Test
    public void testReservationDate() {
        assertNull(reservation.getReservationDate());
        LocalDate time = LocalDate.now();
        reservation.setReservationDate(time);
        assertEquals(time, reservation.getReservationDate());
    }
}