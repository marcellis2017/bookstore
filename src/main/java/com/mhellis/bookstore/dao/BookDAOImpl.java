


package com.mhellis.bookstore.dao;

import com.mhellis.bookstore.entity.Book;
import org.hibernate.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import java.util.List;

@Repository
public class BookDAOImpl implements BookDAO {


    private EntityManager entityManager;

    @Autowired
    public BookDAOImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }


    @Override
    public List<Book> findAll() {


        Query theQuery = entityManager.createQuery("FROM Livre");

        List<Book> books = theQuery.getResultList();

    return books;
    }

    @Override
    public Book findById(int theId) {

        Session currentSession = entityManager.unwrap(Session.class);
        Book theBook = currentSession.get(Book.class, theId);
        return theBook;
    }

    @Override
    public void saveBook(Book theBook) {

    }

    @Override
    public void deleteById(int theId) {

    }
}



