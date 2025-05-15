package com.example.demo.BankDemoPP.Models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerPP {

    @Id @GeneratedValue
    private Long id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private KpiPP kpipp;

    @ManyToOne
    @JoinColumn
    private CategoryPP categorypp;

    public CustomerPP(String name, KpiPP kpipp) {
        this.name = name;
        this.kpipp = kpipp;
    }

    public CustomerPP(String name, KpiPP kpipp, CategoryPP categorypp) {
        this.name = name;
        this.kpipp = kpipp;
        this.categorypp = categorypp;
    }

}
