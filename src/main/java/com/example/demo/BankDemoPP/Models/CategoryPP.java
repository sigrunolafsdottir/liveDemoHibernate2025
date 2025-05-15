package com.example.demo.BankDemoPP.Models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryPP {

    @Id @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(mappedBy = "categorypp")
    private List<CustomerPP> customerpp;

    public CategoryPP(String name) {
        this.name = name;
    }

}
