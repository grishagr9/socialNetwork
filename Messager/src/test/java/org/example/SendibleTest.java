package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class SendibleTest {

    @Mock
    Sendible sendible;

    @BeforeEach
    void before(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void createMessage() {
        //when
        Person person1 = new Person();
        Person person2 = new Person();
        when(sendible.createMessage(person1, person2, "Hello"))
                .thenReturn(new Message("Hello", person1, person2));

        Message message = sendible.createMessage(person1, person2, "Hello");

        Assertions.assertEquals(message.getText(), "Hello");
    }

    @Test
    void sendMessage_SamePersonSend_Fail() {
        Person person = new Person();
        Message message = new Message("Hello", person, person);
        when(sendible.sendMessage(message)).thenReturn(false);

        Assertions.assertFalse(sendible.sendMessage(message));
    }

    @Test
    void sendMessage_TwoPersonSend_Success() {
        Person person1 = new Person();
        Person person2 = new Person();
        Message message = new Message("Hello", person1, person2);
        when(sendible.sendMessage(message)).thenReturn(true);

        Assertions.assertTrue(sendible.sendMessage(message));
    }
}