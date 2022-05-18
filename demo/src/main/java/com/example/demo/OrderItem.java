package com.example.demo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderItem {
    private Long order_id;
    private Long item_id;
    private String price;
    private Integer quantity;
    private String time;
}
