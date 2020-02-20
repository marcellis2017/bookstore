package com.mhellis.bookstore.rest;

import com.mhellis.bookstore.dao.BookDAO;
import com.mhellis.bookstore.entity.Book;
import com.mhellis.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class BookstoreRestController {

 private BookService bookService;

    @Autowired
    public BookstoreRestController(BookService theBookService) {
        bookService = theBookService;
    }

    @GetMapping("/sayHello")
    public String sayHello()
    {
        return "HW!";
    }

    @GetMapping("/books")
    public List<Book> findAll()
    {
        return bookService.findAll();
    }

    @GetMapping("/book/{bookId}")
    public Book getBook(@PathVariable int bookId) {
        Book theBook = bookService.findById(bookId);
        if (theBook == null) {
            throw new RuntimeException("Book Not found");
        }
        return theBook;
    }

    @PostMapping("/book/add")
    public Book addBook(@RequestBody Book theBook){

        theBook.setId(0);
        bookService.saveBook(theBook);

        return theBook;
    }


    @GetMapping("/book/{bookId}")


}
