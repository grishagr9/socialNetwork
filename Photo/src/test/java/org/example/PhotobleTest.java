package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class PhotobleTest {

    @Mock
    Photoble photoble;

    @BeforeEach
    void before(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void likeIt() {
        Photo photo = new Photo("src", 0);
        when(photoble.likeIt(photo)).thenReturn(true);

        Assertions.assertTrue(photoble.likeIt(photo));
    }

    @Test
    void recievePhoto() {
        Photo photo = new Photo("src", 0);
        when(photoble.recievePhoto()).thenReturn(photo);

        Assertions.assertEquals(photoble.recievePhoto().getPath(), photo.getPath());
    }
}