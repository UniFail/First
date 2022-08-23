package com.examplestore.model;
//Не изменяемый класс имутабельный, нет сетеров
public class Item {
    private final int id;

    public Item(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

