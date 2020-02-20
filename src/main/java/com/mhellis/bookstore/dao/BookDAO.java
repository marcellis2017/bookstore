package com.mhellis.bookstore.dao;

import com.mhellis.bookstore.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//extends JpaRepository<Book, Integer>

@Repository
public interface BookDAO {

    public List<Book> findAll();

    public Book findById(int Id);

    public void saveBook(Book theBook);

    public void deleteById (int theId);
}
