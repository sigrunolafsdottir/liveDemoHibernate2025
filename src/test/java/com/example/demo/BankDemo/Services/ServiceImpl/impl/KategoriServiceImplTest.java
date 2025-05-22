package com.example.demo.BankDemo.Services.ServiceImpl.impl;

import com.example.demo.BankDemo.Dtos.KategoriDtoBig;
import com.example.demo.BankDemo.Dtos.KategoriDtoSmall;
import com.example.demo.BankDemo.Dtos.KundDtoBig;
import com.example.demo.BankDemo.Dtos.KundDtoSmall;
import com.example.demo.BankDemo.Models.Kategori;
import com.example.demo.BankDemo.Models.Kpi;
import com.example.demo.BankDemo.Models.Kund;
import com.example.demo.BankDemo.Repos.KategoriRepo;
import com.example.demo.BankDemo.Repos.KundRepo;
import com.example.demo.BankDemo.Services.ServiceImpl.KategoriService;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@ActiveProfiles("test")
@Transactional
@Rollback
class KategoriServiceImplTest {

    @Autowired
    private KategoriRepo kategoriRepo;

    @Autowired
    private KundRepo kundRepo;

    @Autowired
    private KategoriService service;


    String kundnamn = "Svenne";
    String kundnamn2 = "Bella";
    String kategoriNamn = "ylle";

//Vi skapar upp objekt av våra entiteter och dto:er
    Kund kund = new Kund(kundnamn, new Kpi(5));
    Kategori kategori = new Kategori(kategoriNamn);

    KundDtoSmall kundDtoSmall = new KundDtoSmall(kundnamn);
    KundDtoSmall kundDtoSmall2 = new KundDtoSmall(kundnamn2);
    KategoriDtoSmall kategoriDtoSmall = new KategoriDtoSmall(kategoriNamn);

    KundDtoBig kundDtoBig = new KundDtoBig(kundnamn);
    KundDtoBig kundDtoBig2 = new KundDtoBig(null, kundnamn, kategoriDtoSmall);
    KategoriDtoBig kategoriDtoBig = new KategoriDtoBig(null, kategoriNamn,
            List.of(kundDtoSmall, kundDtoSmall2));


    @BeforeEach
    public void setup() {
        //kund has fk to kategori, rows here will block removals in the kategori table
        kundRepo.deleteAll();
        kategoriRepo.deleteAll(); //
        kategoriRepo.save(new Kategori("guld"));
        kategoriRepo.save(new Kategori("silver"));
    }

    @Transactional
    @Test
    public void getAllaKategorier() throws Exception {

        List<KategoriDtoBig> allKategories = service.getAllaKategorier();
        assertTrue(allKategories.size() == 2);
        assertTrue(allKategories.stream().map(k -> k.getNamn()).toList().contains("guld"));
        assertTrue(allKategories.stream().map(k -> k.getNamn()).toList().contains("silver"));

    }

    @Test
    void addKategori() throws Exception {
        String jsonKategori = """
        {
            "namn": "platinum"
        }
        """;

        service.addKategori(new KategoriDtoSmall("frigolit"));
        List<KategoriDtoBig> allKategories = service.getAllaKategorier();
        assertTrue(allKategories.stream().map(k -> k.getNamn()).toList().contains("frigolit"));



    }

    @Test
    void kundToKundDtoSmall() {
        KundDtoSmall actual = service.KundToKundDtoSmall(kund);
        assertEquals(actual.getName(),kund.getName());
    }

    @Test
    void kategoriToKategoriDtoSmall() {
        KategoriDtoSmall actual = service.KategoriToKategoriDtoSmall(kategori);
        assertEquals(actual.getNamn(), kategori.getNamn());
    }

    @Test
    void kategoriToKategoriDtoBig() {
    }

    @Test
    void kategoriDtoSmallToKategori() {
        Kategori actual = service.KategoriDtoSmallToKategori(kategoriDtoSmall);
        assertEquals(actual.getNamn(), kategori.getNamn());
    }


}