package com.mhellis.bookstore.service;

import com.mhellis.bookstore.dao.BookDAO;
import com.mhellis.bookstore.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    private BookDAO bookDAO;

    @Autowired
    public BookServiceImpl(BookDAO theBookDAO) {
        bookDAO = theBookDAO;
    }

    @Override
    @Transactional
    public List<Book> findAll() {
        return bookDAO.findAll();
    }

}
