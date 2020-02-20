package com.mhellis.bookstore.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Livre")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "livre_id")
    private int id;


    @Column(name = "titre")
    private String title;

    @Column(name = "auteur")
    private String author;

    @Column(name = "ISBN")
    private int ISBN;

    @Column(name = "date_added")
    private LocalDate added_at;

    @Column(name = "date_published")
    private LocalDate published_at;

    @Column(name = "sku")
    private int sku;

    public Book() {
    }

    public Book(String title, String author, int ISBN, LocalDate added_at, LocalDate published_at, int sku) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.added_at = added_at;
        this.published_at = published_at;
        this.sku = sku;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getISBN() {
        return ISBN;
    }

    public LocalDate getAdded_at() {
        return added_at;
    }

    public LocalDate getPublished_at() {
        return published_at;
    }

    public int getSku() {
        return sku;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", ISBN=" + ISBN +
                ", added_at=" + added_at +
                ", published_at=" + published_at +
                ", sku=" + sku +
                '}';
    }
}


