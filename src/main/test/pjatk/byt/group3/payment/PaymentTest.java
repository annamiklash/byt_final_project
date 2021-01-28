package pjatk.byt.group3.payment;

import org.junit.Before;
import org.junit.Test;
import pjatk.byt.group3.book.Book;
import pjatk.byt.group3.borrow.Borrow;
import pjatk.byt.group3.enums.GenreEnum;
import pjatk.byt.group3.enums.PaymentMethodEnum;
import pjatk.byt.group3.member.LibraryMember;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class PaymentTest {
    Payment payment;

    @Before
    public void setUp() {
        LibraryMember member = new LibraryMember("John", "Kowalski", "john.kowalski@gmail.com", "Warszawaska 2", "123456789");
        Book book = new Book("Title", "Author", GenreEnum.FANTASY, "PublisherName", null, null);
        Borrow borrow = new Borrow(LocalDate.now(), LocalDate.now().plusDays(7), member, book);
        payment = new Payment(500.00, borrow);
    }

    @Test
    public void testPaymentGetter() {
        assertEquals(new Double(500), payment.getAmountDue());
        assertFalse(payment.isPayed());
    }

    @Test
    public void testMakePayment() {
        payment.setPaymentMethodEnum(PaymentMethodEnum.CARD);
        assertFalse(payment.isPayed());
        payment.makePayment();
        assertTrue(payment.isPayed());
        assertEquals(PaymentMethodEnum.CARD, payment.getPaymentMethodEnum());
    }

    @Test
    public void testGetMethodEnum() {
        payment.setPaymentMethodEnum(PaymentMethodEnum.CARD);
        assertEquals(PaymentMethodEnum.CARD, payment.getPaymentMethodEnum());

    }

    @Test
    public void testGetId(){
        assertNotNull(payment.getId());
    }
}