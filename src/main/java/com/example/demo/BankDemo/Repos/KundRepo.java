package com.example.demo.BankDemo.Repos;

import com.example.demo.BankDemo.Models.Kund;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KundRepo extends JpaRepository<Kund, Long> {
}
