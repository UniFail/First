package com.examplestore.service;

import com.examplestore.component.Basket;
import com.examplestore.model.Item;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StoreServiceImpl {
    public final Basket basket;

    public StoreServiceImpl(Basket basket) {
        this.basket = basket;
    }

    public List<Item> add(List<Integer> ids) {
        return basket.add(
                ids.stream()
                        .map(Item::new)
                        .collect(Collectors.toList()));
    }

    public List<Item> get() {
        return basket.get();
    }
}
