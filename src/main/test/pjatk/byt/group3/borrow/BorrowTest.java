package pjatk.byt.group3.borrow;

import org.junit.Before;
import org.junit.Test;
import pjatk.byt.group3.book.Book;
import pjatk.byt.group3.enums.GenreEnum;
import pjatk.byt.group3.member.LibraryMember;

import java.math.BigInteger;
import java.time.LocalDate;
import java.time.Month;
import java.util.Collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class BorrowTest {

    Borrow borrow;
    LibraryMember member;
    Book book;

    @Before
    public void setUp() {
        member = new LibraryMember("John", "Kowalski", "john.kowalski@gmail.com", "Warszawaska 2", "123456789");
        book = new Book("Title", "Author", GenreEnum.DRAMA, "PublisherName", new BigInteger("123456789"), null);
        borrow = new Borrow(LocalDate.of(2020, Month.JANUARY, 15), LocalDate.of(2020, Month.JANUARY, 30), member, book);
    }


    @Test
    public void testGetter() {
        assertEquals(member, borrow.getMember());
        assertEquals(Collections.singletonList(book), borrow.getBookList());
        assertEquals(LocalDate.of(2020, Month.JANUARY, 15), borrow.getBorrowDate());
        assertEquals(LocalDate.of(2020, Month.JANUARY, 30), borrow.getDueDate());
        assertNull(borrow.getReturnDate());
    }

    @Test
    public void testSetReturnDate() {
        assertNull(borrow.getReturnDate());
        LocalDate time = LocalDate.now();
        borrow.setReturnDate(time);
        assertEquals(time, borrow.getReturnDate());
    }
}