package com.example.demo.BankDemo.Repos;

import com.example.demo.BankDemo.Models.Kpi;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KpiRepo extends JpaRepository<Kpi, Long> {
}
