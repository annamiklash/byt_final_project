package pjatk.byt.group3.book;


import pjatk.byt.group3.borrow.Borrow;
import pjatk.byt.group3.enums.GenreEnum;
import pjatk.byt.group3.enums.StatusEnum;
import pjatk.byt.group3.librarian.Librarian;
import pjatk.byt.group3.member.LibraryMember;
import pjatk.byt.group3.reservation.Reservation;

import java.awt.image.BufferedImage;
import java.math.BigInteger;
import java.time.LocalDate;

public class Book {

    private final String title;
    private final String author;
    private final GenreEnum genre;
    private final String publisherName;
    private final BigInteger ISBN;
    private BufferedImage image;
    private StatusEnum bookStatus;

    public Book(String title, String author, GenreEnum genre, String publisherName, BigInteger ISBN, BufferedImage image) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publisherName = publisherName;
        this.ISBN = ISBN;
        this.image = image;
        this.bookStatus = StatusEnum.AVAILABLE;
    }

    public Book searchByISBN(BigInteger ISBN) {
        return new Book("title", "author", GenreEnum.CLASSIC, "publisher",
                new BigInteger("123456789765"), new BufferedImage(1, 1, 2));
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public void setBookStatus(StatusEnum bookStatus) {
        this.bookStatus = bookStatus;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public GenreEnum getGenre() {
        return genre;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public BigInteger getISBN() {
        return ISBN;
    }

    public BufferedImage getImage() {
        return image;
    }

    public StatusEnum getBookStatus() {
        return bookStatus;
    }

    public void deleteBook() {
        System.out.println("deleted");
    }

    public void editBook() {
        System.out.println("edited");
    }

    public void issueBook(LibraryMember member, Librarian librarian) {
        System.out.println("issued");
    }

    public boolean isAvailable() {
        return false;
    }

    public Reservation reserveBook(LibraryMember member) {
        return new Reservation(member, this);
    }

    public Borrow requestBook(LibraryMember member) {
        return new Borrow(LocalDate.now(), LocalDate.now(), member, this);
    }
}
