package com.example.demo;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
    private long id;
    private String authorname;
    private int cost;

    public Book(long id, String authorname, int cost) {
        this.id = id;
        this.authorname = authorname;
        this.cost = cost;
    }


}
