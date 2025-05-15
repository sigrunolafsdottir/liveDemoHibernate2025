package com.example.demo.BankDemo.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Konto {

    @Id
    @GeneratedValue
    private Long id;

    private int saldo;

    public Konto(int saldo) {
        this.saldo = saldo;
    }
}
