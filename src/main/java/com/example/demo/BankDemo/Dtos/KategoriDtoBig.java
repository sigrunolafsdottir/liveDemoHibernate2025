package com.example.demo.BankDemo.Dtos;


import com.example.demo.BankDemo.Models.Kund;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class KategoriDtoBig {

    private Long id;
    private String namn;
    private List<KundDtoSmall> kunder;

    public KategoriDtoBig(String namn) {
        this.namn = namn;
    }

}
