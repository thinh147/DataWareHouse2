package com.example.demo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Data {
    List<Item> item;
    List<ItemStorage> item_storage;
    List<Office> office;
    List<Order> order;
    List<OrderItem> order_item;
    List<Store> store;
}
