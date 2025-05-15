package com.example.demo.BankDemo.Repos;

import com.example.demo.BankDemo.Models.Konto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KontoRepo extends JpaRepository<Konto, Long> {
}
