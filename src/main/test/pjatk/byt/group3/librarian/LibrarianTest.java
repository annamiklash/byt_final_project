package pjatk.byt.group3.librarian;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LibrarianTest {

    Librarian librarian;

    @Before
    public void setUp() {
        librarian = new Librarian("somelogin", "somepassword");
        librarian.registerUser("John", "Kowalski", "john.kowalski@gmail.com", "Warszawaska 2", "123456789");

    }

    @Test
    public void testLibrarianGetterSetter() {
        assertEquals("somelogin", librarian.getLogin());
        assertEquals("somepassword", librarian.getPassword());
    }
}