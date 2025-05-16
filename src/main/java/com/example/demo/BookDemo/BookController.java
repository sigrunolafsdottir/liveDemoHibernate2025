package com.example.demo.BookDemo;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class BookController {

    final private BookRepository bookRepository;
    private static final Logger log = LoggerFactory.getLogger(BookController.class);

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/book/all")
    public List<Book> listBook() {
        return bookRepository.findAll();
    }


    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @PostMapping("/book/add")
    public List<Book> addBook(@RequestBody Book book) {
        bookRepository.save(book);
        log.info("Book added: " + book.getTitle());
        return bookRepository.findAll();
    }

    @PutMapping("/book/update")
    public List<Book> putBook(@RequestBody Book book) {
        bookRepository.save(book);
        return bookRepository.findAll();
    }


}
