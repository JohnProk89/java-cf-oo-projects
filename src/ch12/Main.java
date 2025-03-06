package ch12;

import ch12.model.User;
import ch12.model.UserCredentials;

public class Main {

    public static void main(String[] args) {

        User john = new User(1L, "John", "Prokopiou");
        UserCredentials johnp = new UserCredentials(1l, "johnprok", "12345");

        System.out.println(john.getId() + ", " + john.getFirstname() + ", " + john.getLastname());
        System.out.println(johnp.getId() + ", " + johnp.getUsername() + ", " + johnp.getPassword());
    }
}
