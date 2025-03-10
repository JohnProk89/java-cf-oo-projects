package ch12oopintro;

import ch12oopintro.model.User;
import ch12oopintro.model.UserCredentials;

public class Main {

    public static void main(String[] args) {

        User john = new User(1L, "John", "Prokopiou");
        UserCredentials johnp = new UserCredentials(1l, "johnprok", "12345");

        System.out.println(john.getId() + ", " + john.getFirstname() + ", " + john.getLastname());
        System.out.println(johnp.getId() + ", " + johnp.getUsername() + ", " + johnp.getPassword());
    }
}
