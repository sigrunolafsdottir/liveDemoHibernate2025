package com.example.demo.BankDemoPP.Models;

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
public class AccountPP {

    @Id
    @GeneratedValue
    private Long id;

    private int balance;

    public AccountPP(int balance) {
        this.balance = balance;
    }
}
