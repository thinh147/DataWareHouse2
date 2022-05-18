package com.example.demo;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class Office {
    private Long id;
    private String name;
    private String state;
    private String time;
}
