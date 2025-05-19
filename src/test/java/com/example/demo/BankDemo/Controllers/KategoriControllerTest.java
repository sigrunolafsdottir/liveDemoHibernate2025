package com.example.demo.BankDemo.Controllers;

import com.example.demo.BankDemo.Models.Kategori;
import com.example.demo.BankDemo.Repos.KategoriRepo;
import com.example.demo.BankDemo.Repos.KundRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MvcResult;
import org.hamcrest.Matchers.*;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
class KategoriControllerTest {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private KategoriRepo kategoriRepo;

    @Autowired
    private KundRepo kundRepo;

    @BeforeEach
    public void setup() {
        //kund has fk to kategori, rows here will block removals in the kategori table
        kundRepo.deleteAll();
        kategoriRepo.deleteAll(); //
        kategoriRepo.save(new Kategori("guld"));
        kategoriRepo.save(new Kategori("silver"));
    }

    @Test
    public void getAllaKategorier() throws Exception {

        MvcResult result = mvc.perform(get("/kategori/all"))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.[*].namn")
                            .value(containsInAnyOrder("guld", "silver"))).andReturn();

        String response = result.getResponse().getContentAsString(); // skriva ut datat
        System.out.println("Response: " + response);
    }

    @Test
    void testAddKategoriWithPost() throws Exception {
        String jsonKategori = """
        {
            "namn": "platinum"
        }
        """;

        mvc.perform(post("/kategori/addOLD")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(jsonKategori))
                .andExpect(status().isOk())
                .andExpect(content().string("Kategori platinum lades till"));
    }

}


/*
        MvcResult result = this.mvc.perform(get("/kategori/all"))
                    .andExpect(status().isOk())
                    .andReturn();

        String response = result.getResponse().getContentAsString(); // skriva ut datat
        System.out.println("Response: " + response);
 */