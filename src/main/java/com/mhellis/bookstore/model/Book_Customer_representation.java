package com.mhellis.bookstore.model;

import com.mhellis.bookstore.entity.Book;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;


//avec Lombok
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter @NoArgsConstructor @AllArgsConstructor
public class Book_Customer_representation {
    String id;
    String title;
    Integer ISBN;
    String author;
    LocalDate publishedAt;
    LocalDate addedAt;

    public Book_Customer_representation mapBook(Book book) {
        Book_Customer_representation representation = new Book_Customer_representation();

        representation.id=Integer.toString(book.getId()); //note type conversion id=int in entity, id=String in repesentation
        representation.title=book.getTitle();
        representation.author=book.getAuthor();
        representation.ISBN=book.getISBN();
        representation.publishedAt=book.getPublished_at();
        representation.addedAt=book.getAdded_at();

        return representation;

    }
}
