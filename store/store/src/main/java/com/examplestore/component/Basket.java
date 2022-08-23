package com.examplestore.component;

import com.examplestore.model.Item;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Component //Компанент потому что не мало для репозитория
@SessionScope
public class Basket {
    private final List<Item> items;

    public Basket() {
        this.items = new ArrayList<>();
    }

    public List<Item> add(List<Item> items) {
        this.items.addAll(items);
        return this.items;
    }

    public List<Item> add(Item item) {
        items.add(item);
        return items;
    }

    public List<Item> get() {
        return Collections.unmodifiableList(items);
    }
}
