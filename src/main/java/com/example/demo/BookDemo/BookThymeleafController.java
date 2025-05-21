package com.example.demo.BookDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BookThymeleafController {

    final private BookRepository bookRepository;
    private static final Logger log = LoggerFactory.getLogger(BookThymeleafController.class);

    public BookThymeleafController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    //http://localhost:8080/hello
    @RequestMapping("/helloworld")
    public String hello() {
        return "index.html";
    }


    @RequestMapping("/bookTH/all")
    public String listBook(Model model) {
        model.addAttribute("title", "Böcker");
        model.addAttribute("allBooks", bookRepository.findAll());
        return "allBooks.html";
    }

    //OBS, notera att @RequestBody saknas, den verkar inte vara kompatibel med th
    @PostMapping("/bookTH/add")
    public String addBook(Book book, Model model) {
        bookRepository.save(book);
        log.info("Book added: " + book.getTitle());
        return listBook(model);
    }

/*
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
*/

}
