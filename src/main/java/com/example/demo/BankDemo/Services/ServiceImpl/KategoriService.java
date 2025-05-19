package com.example.demo.BankDemo.Services.ServiceImpl;

import com.example.demo.BankDemo.Models.Kategori;
import com.example.demo.BankDemo.Models.Konto;
import com.example.demo.BankDemo.Dtos.*;

import java.util.List;

public interface KategoriService {


    public List<KategoriDtoBig> getAllaKategorier();
    public Kategori KategoriDtoSmallToKategori(KategoriDtoSmall kategori);
    public Kategori KategoriDtoBigToKategori(KategoriDtoBig kategori);

    public KategoriDtoSmall KategoriToKategoriDtoSmall(Kategori kategori);
    public KategoriDtoBig KategoriToKategoriDtoBig(Kategori kategori);

}
