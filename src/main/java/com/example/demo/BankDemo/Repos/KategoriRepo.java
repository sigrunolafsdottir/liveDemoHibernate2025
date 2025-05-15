package com.example.demo.BankDemo.Repos;

import com.example.demo.BankDemo.Models.Kategori;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface KategoriRepo extends JpaRepository<Kategori, Long> {

    public List<Kategori> findByNamn(String name);
}
