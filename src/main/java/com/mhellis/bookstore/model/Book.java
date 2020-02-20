package com.mhellis.bookstore.model;

import java.time.LocalDate;

public class Book {
    private long uuid;
    private String title;
    private String author;
    private int ISBN;
    private LocalDate added_at;
    private LocalDate published_at;
    private int sku;
}
