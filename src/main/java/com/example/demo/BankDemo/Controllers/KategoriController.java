package com.example.demo.BankDemo.Controllers;


import com.example.demo.BankDemo.Models.Kategori;
import com.example.demo.BankDemo.Models.Konto;
import com.example.demo.BankDemo.Repos.KategoriRepo;
import com.example.demo.BankDemo.Repos.KundRepo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class KategoriController {

    private final KategoriRepo kategoriRepo;

    public KategoriController(KategoriRepo kategoriRepo) {
        this.kategoriRepo = kategoriRepo;
    }

    @RequestMapping("kategori/all")
    public List<Kategori> getAllKategori() {
        return kategoriRepo.findAll();
    }
}
