package pjatk.byt.group3.member;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryMemberTest {

    LibraryMember member;

    @Before
    public void setUp() {
        member = new LibraryMember("John", "Kowalski", "john.kowalski@gmail.com", "Warszawaska 2", "123456789");

    }

    @Test
    public void testMemberGetter() {
        assertEquals("John", member.getFirstName());
        assertEquals("Kowalski", member.getLastName());
        assertEquals("john.kowalski@gmail.com", member.getEmail());
        assertEquals("Warszawaska 2", member.getAddress());
        assertEquals("123456789", member.getPhoneNumber());
    }

    @Test
    public void testMemberSettetr() {
        member.setAddress("Nowy Swiat 2");
        member.setEmail("sth@gmail.pl");
        member.setPhoneNumber("783123987");

        assertEquals("sth@gmail.pl", member.getEmail());
        assertEquals("Nowy Swiat 2", member.getAddress());
        assertEquals("783123987", member.getPhoneNumber());
    }

}