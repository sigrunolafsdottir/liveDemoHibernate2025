package com.example.demo.BankDemo.Dtos;


import com.example.demo.BankDemo.Models.Kategori;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class KundDtoBig {

    private Long id;
    private String name;
    private KategoriDtoSmall kategori;

    public KundDtoBig(String name) {
        this.name = name;
    }

}
