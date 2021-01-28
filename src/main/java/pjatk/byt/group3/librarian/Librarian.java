package pjatk.byt.group3.librarian;

import java.lang.reflect.Member;

public class Librarian {

    private final String login;
    private final String password;

    public Librarian(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void registerUser(String firstName, String lastName, String email, String address, String phoneNumber) {
        System.out.println("user registered");
    }

    public boolean memberExists(Member member) {
        return false;
    }


    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
