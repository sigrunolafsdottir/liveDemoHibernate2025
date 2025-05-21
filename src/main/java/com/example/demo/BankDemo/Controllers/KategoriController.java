package com.example.demo.BankDemo.Controllers;


import com.example.demo.BankDemo.Dtos.KategoriDtoBig;
import com.example.demo.BankDemo.Dtos.KategoriDtoSmall;
import com.example.demo.BankDemo.Models.Kategori;
import com.example.demo.BankDemo.Models.Konto;
import com.example.demo.BankDemo.Repos.KategoriRepo;
import com.example.demo.BankDemo.Repos.KundRepo;
import com.example.demo.BankDemo.Services.ServiceImpl.KategoriService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class KategoriController {

    //OBS INTE best practice att ha både repo och service,
    // det ser ut så här pga demo-exemplen i testerna skapades innan servicarna lades till
    private final KategoriRepo kategoriRepo;
    private final KategoriService kategoriService;

    public KategoriController(KategoriService kategoriService, KategoriRepo kategoriRepo) {
        this.kategoriService = kategoriService;
        this.kategoriRepo = kategoriRepo;
    }

    @RequestMapping("kategori/all")
    public List<KategoriDtoBig> getAllKategori() {
        return kategoriService.getAllaKategorier();
    }

    @PostMapping("kategori/add")
    public String addKategori(@RequestBody KategoriDtoSmall k) {
        System.out.println("kategoricontroller "+k.getNamn());
        return kategoriService.addKategori(k);
    }


    @PostMapping("kategori/addOLD")
    public String addKategori(@RequestBody Kategori kategori) {
        kategoriRepo.save(kategori);
        return "Kategori " + kategori.getNamn() + " lades till";
    }

/*
    @RequestMapping("kategori/all")
    public List<Kategori> getAllKategori() {
        return kategoriRepo.findAll();
    }



    */

}
