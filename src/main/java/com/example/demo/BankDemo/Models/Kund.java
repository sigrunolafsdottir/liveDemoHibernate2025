package com.example.demo.BankDemo.Models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Kund {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private Kpi kpi;

    @ManyToOne
    private Kategori kategori;

    @ManyToMany
    @JoinTable
    private List<Konto> konto = new ArrayList<>();

    public Kund(String name, Kpi kpi) {
        this.name = name;
        this.kpi = kpi;
    }

    public Kund(String name, Kpi kpi, Kategori kategori) {
        this.name = name;
        this.kpi = kpi;
        this.kategori = kategori;
    }

    public Kund(String name, Kpi kpi, Kategori kategori, Konto konto) {
        this.name = name;
        this.kpi = kpi;
        this.kategori = kategori;
        this.konto.add(konto);
    }
}
