package com.example.demo.GameDemo;

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
public class Game {

    @Id @GeneratedValue
    private Long id;

    private String name;
    private String grade;
    private int age;

    public Game(String name, String grade, int age) {
        this.name = name;
        this.grade = grade;
        this.age = age;
    }
}
