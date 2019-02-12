package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class UserVerifyTest {

    @Test
    public void shouldValidateValidUserString() {
        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("123-1234", "password", "name", "email", "111"));
        users.add(new User("234-2345", "password2", "name", "email", "111"));

        UserVerify userVerify = new UserVerify(users);

        assertEquals((userVerify.validUser("123-1234")), users.get(0));
    }

    @Test
    public void shouldValidateInvalidUserString() {
        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("123-1234", "password", "name", "email", "111"));
        users.add(new User("234-2345", "password2", "name", "email", "111"));

        UserVerify userVerify = new UserVerify(users);

        assertEquals(userVerify.validUser("111-1111"), null);
    }

    @Test
    public void shouldValidateCorrectPassword() {
        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("123-1234", "password", "name", "email", "111"));
        users.add(new User("234-2345", "password2", "name", "email", "111"));

        UserVerify userVerify = new UserVerify(users);

        assertTrue(userVerify.validPassword("password2", users.get(1)));
    }

    @Test
    public void shouldValidateIncorrectPassword() {
        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("123-1234", "password", "name", "email", "111"));
        users.add(new User("234-2345", "password2", "name", "email", "111"));

        UserVerify userVerify = new UserVerify(users);

        assertFalse(userVerify.validPassword("password3", users.get(0)));
    }
}