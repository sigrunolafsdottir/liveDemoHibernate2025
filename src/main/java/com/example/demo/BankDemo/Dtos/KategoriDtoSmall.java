package com.example.demo.BankDemo.Dtos;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class KategoriDtoSmall {

    private Long id;
    private String namn;

    public KategoriDtoSmall(String namn) {
        this.namn = namn;
    }
}
