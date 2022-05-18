package com.example.demo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Item {
    private Long id;
    private String description;
    private Integer size;
    private Integer weight;
    private String price;
    private String time;
}
