package com.example.demo.BankDemo.Services.ServiceImpl.impl;

import com.example.demo.BankDemo.Dtos.KategoriDtoBig;
import com.example.demo.BankDemo.Dtos.KategoriDtoSmall;
import com.example.demo.BankDemo.Dtos.KundDtoBig;
import com.example.demo.BankDemo.Dtos.KundDtoSmall;
import com.example.demo.BankDemo.Models.Kategori;
import com.example.demo.BankDemo.Models.Kund;
import com.example.demo.BankDemo.Repos.KategoriRepo;
import com.example.demo.BankDemo.Repos.KundRepo;
import com.example.demo.BankDemo.Services.ServiceImpl.KategoriService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class KategoriServiceImpl implements KategoriService {

    KategoriRepo kategoriRepo;

    public KategoriServiceImpl(KategoriRepo kategoriRepo) {
        this.kategoriRepo = kategoriRepo;
    }

    public List<KategoriDtoBig> getAllaKategorier(){
        return kategoriRepo.findAll().stream()
                .map(k -> KategoriToKategoriDtoBig(k)).toList();
    }

    public String addKategori(KategoriDtoSmall k){
        System.out.println("service "+k.getNamn());
        kategoriRepo.save(KategoriDtoSmallToKategori(k));
        return "Kategori "+k.getNamn() + " is saved.";
    }

    @Override
    public KundDtoSmall KundToKundDtoSmall(Kund kund) {
        return new KundDtoSmall(kund.getId(), kund.getName());
    }

    //läsning
    @Override
    public KategoriDtoSmall KategoriToKategoriDtoSmall(Kategori kategori) {
        return new KategoriDtoSmall(kategori.getId(), kategori.getNamn());
    }

    //läsning
    @Override
    public KategoriDtoBig KategoriToKategoriDtoBig(Kategori kategori) {
        List<KundDtoSmall> kunder = kategori.getKunder().stream()
                .map(k -> KundToKundDtoSmall(k) ).toList();
        return new KategoriDtoBig(kategori.getId(), kategori.getNamn(), kunder);
    }



    @Override
    public Kategori KategoriDtoSmallToKategori(KategoriDtoSmall kategori) {
        return new Kategori(kategori.getNamn());
    }

    @Override
    public Kategori KategoriDtoBigToKategori(KategoriDtoBig kategori) {
        return null;
    }
}
