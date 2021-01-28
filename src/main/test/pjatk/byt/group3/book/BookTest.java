package pjatk.byt.group3.book;

import lombok.SneakyThrows;
import org.junit.Before;
import org.junit.Test;
import pjatk.byt.group3.enums.GenreEnum;
import pjatk.byt.group3.enums.StatusEnum;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.math.BigInteger;

import static org.junit.Assert.*;

public class BookTest {
    Book book;

    @Before
    public void setUp() {
        book = new Book("Title", "Author", GenreEnum.CLASSIC, "PublisherName", new BigInteger("12345667"), null);

    }

    @Test
    public void testGetter() {

        assertEquals("Title", book.getTitle());
        assertEquals("Author", book.getAuthor());
        assertEquals(GenreEnum.CLASSIC, book.getGenre());
        assertEquals("PublisherName", book.getPublisherName());
        assertEquals(new BigInteger("12345667"), book.getISBN());
        assertNull(book.getImage());
    }

    @Test
    public void testGetMethodEnum() {
        book.setBookStatus(StatusEnum.AVAILABLE);
        assertEquals(StatusEnum.AVAILABLE, book.getBookStatus());
    }

    @Test
    @SneakyThrows
    public void testImageSetter(){
        String path = "src/main/java/pjatk/byt/group3/data/img.png";
        BufferedImage image = ImageIO.read(new File(path));
        book.setImage(image);
        assertEquals(book.getImage(), image);
    }
}