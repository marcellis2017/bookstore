package com.mhellis.bookstore.service;

import com.mhellis.bookstore.entity.Book;

import java.util.List;

public interface BookService {

    public List<Book> findAll();

   public Book findById(int Id);

    public void saveBook(Book theBook);

    public void deleteById (int theId);
}
