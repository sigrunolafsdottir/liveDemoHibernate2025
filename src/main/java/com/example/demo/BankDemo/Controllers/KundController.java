package com.example.demo.BankDemo.Controllers;


import com.example.demo.BankDemo.Dtos.KundDtoBig;
import com.example.demo.BankDemo.Models.Kund;
import com.example.demo.BankDemo.Repos.KundRepo;
import com.example.demo.BankDemo.Services.ServiceImpl.KundService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class KundController {

    private final KundService kundService;


    //Service
    @RequestMapping("kund/allViaService")
    public List<KundDtoBig> getAllKundViaService() {
        return kundService.getAllaKunder();
    }



/*
    @RequestMapping("kund/all")
    public List<Kund> getAllKund() {
        return kundRepo.findAll();
    }
*/
}
