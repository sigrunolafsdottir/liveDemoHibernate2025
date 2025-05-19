package com.example.demo.BankDemo.Services.ServiceImpl.impl;

import com.example.demo.BankDemo.Dtos.KategoriDtoSmall;
import com.example.demo.BankDemo.Dtos.KundDtoBig;
import com.example.demo.BankDemo.Dtos.KundDtoSmall;
import com.example.demo.BankDemo.Models.Kund;
import com.example.demo.BankDemo.Repos.KategoriRepo;
import com.example.demo.BankDemo.Repos.KundRepo;
import com.example.demo.BankDemo.Services.ServiceImpl.KundService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class KundServiceImpl implements KundService {

    KundRepo kundRepo;

    public KundServiceImpl(KundRepo kundRepo) {
        this.kundRepo = kundRepo;
    }

    public List<KundDtoBig> getAllaKunder(){
        return kundRepo.findAll().stream().map(kund -> KundToKundDtoBig(kund)).toList();
    }

    //läsning
    @Override
    public KundDtoSmall KundToKundDtoSmall(Kund kund) {
        return new KundDtoSmall(kund.getId(), kund.getName());
    }

    //läsning
    @Override
    public KundDtoBig KundToKundDtoBig(Kund kund) {
        return new KundDtoBig(kund.getId(), kund.getName(),
                new KategoriDtoSmall(kund.getKategori().getId(), kund.getKategori().getNamn()));
    }


    @Override
    public Kund KundDtoSmallToKund(KundDtoSmall kund) {
        return null;
    }

    @Override
    public Kund KundDtoBigToKund(KundDtoBig kund) {
        return null;
    }


}
