package com.example.demo.BookDemo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id @GeneratedValue
    private Long id;

    private String title;

    private String author;

    private int grade;

    public Book(String title, String author, int grade) {
        this.title = title;
        this.author = author;
        this.grade = grade;
    }
}
