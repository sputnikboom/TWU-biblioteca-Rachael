package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UserInputTest {

    @Test
    public void shouldReturnUsersInput(){
            char charInput = '0';
            UserInput userInput = mock(UserInput.class);
            when(userInput.charInput()).thenReturn('0');

            assertEquals(userInput.charInput(), charInput);
        }
    }
