package com.example.demo.BankDemo.Dtos;


import com.example.demo.BankDemo.Models.Kategori;
import com.example.demo.BankDemo.Models.Konto;
import com.example.demo.BankDemo.Models.Kpi;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class KundDtoSmall {

    private Long id;
    private String name;

    public KundDtoSmall(String name) {
        this.name = name;
    }

}
