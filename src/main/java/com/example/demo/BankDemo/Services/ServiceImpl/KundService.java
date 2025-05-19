package com.example.demo.BankDemo.Services.ServiceImpl;

import com.example.demo.BankDemo.Dtos.KategoriDtoBig;
import com.example.demo.BankDemo.Dtos.KategoriDtoSmall;
import com.example.demo.BankDemo.Dtos.KundDtoBig;
import com.example.demo.BankDemo.Dtos.KundDtoSmall;
import com.example.demo.BankDemo.Models.Kategori;
import com.example.demo.BankDemo.Models.Kund;

import java.util.List;

public interface KundService {

    public Kund KundDtoSmallToKund(KundDtoSmall kund);
    public Kund KundDtoBigToKund(KundDtoBig kund);

    public KundDtoSmall KundToKundDtoSmall(Kund kund);
    public KundDtoBig KundToKundDtoBig(Kund kund);

    public List<KundDtoBig> getAllaKunder();

}
