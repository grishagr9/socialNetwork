package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class GiftsGivableTest {

    @Mock
    GiftsGivable giftsGivable;
    Person person1 = new Person();
    Person person2 = new Person();

    @BeforeEach
    void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @org.junit.jupiter.api.Test
    void presentGift() {
        Gift gift = new Gift();
        gift.setName("Мишка");
        when(giftsGivable.presentGift(person1, person2, gift)).thenReturn(true);

        Boolean result = giftsGivable.presentGift(person1, person2, gift);
        assertTrue(result);
    }

    @Test
    void NoPresentGiftFromSameUser(){
        Gift gift = new Gift();
        gift.setName("Мишка");
        when(giftsGivable.presentGift(person1, person1, gift)).thenReturn(false);

        Boolean result = giftsGivable.presentGift(person1, person1, gift);
        assertFalse(result);
    }

    @Test
    void ChangeGiftsForUser(){
        Gift gift = new Gift();
        gift.setName("Мишка");
        when(giftsGivable.changeGift()).thenReturn(gift);

        Gift result = giftsGivable.changeGift();
        assertEquals(result.getName(), "Мишка");
    }
}