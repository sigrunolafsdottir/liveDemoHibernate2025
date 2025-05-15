package com.example.demo.BankDemo.Models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Kategori {

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    private String namn;

  //  @OneToMany(mappedBy="kategori")
  //  private List<Kund> kunder;

    public Kategori(String namn) {
        this.namn = namn;
    }



}
