package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class FriendableTest {

    @Mock
    Friendable friendable;

    Person person1;
    Person person2;


    @BeforeEach
    void setUp(){
        MockitoAnnotations.openMocks(this);
        person1 = new Person();
        person2 = new Person();
    }
    @Test
    void addFriend_TwoUsersAdded_success() {
        when(friendable.addFriend(person1, person2)).thenReturn(true);

        Boolean result = friendable.addFriend(person1, person2);
        Assertions.assertTrue(result);
    }

    @Test
    void addFriend_SameUserAdded_Fail() {
        when(friendable.addFriend(person1, person1)).thenReturn(false);

        Boolean result = friendable.addFriend(person1, person1);
        Assertions.assertFalse(result);
    }

    @Test
    void deleteFriend() {
        when(friendable.deleteFriend(person1, person1)).thenReturn(true);

        Boolean result = friendable.deleteFriend(person1, person1);
        Assertions.assertTrue(result);
    }

    @Test
    void countFriends() {
        when(friendable.countFriends(person1)).thenReturn(4);

        Assertions.assertEquals(friendable.countFriends(person1),4);
    }

    @Test
    void isFriends_whenUsersFriends_True(){
        when(friendable.isFriends(person1, person2)).thenReturn(true);

        Boolean result = friendable.isFriends(person1, person2);
        Assertions.assertTrue(result);
    }
}