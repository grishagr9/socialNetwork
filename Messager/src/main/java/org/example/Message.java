package org.example;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Message {
    private String text;
    private Person from;
    private Person to;
}
