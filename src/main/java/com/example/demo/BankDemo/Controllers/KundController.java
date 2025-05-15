package com.example.demo.BankDemo.Controllers;


import com.example.demo.BankDemo.Models.Kpi;
import com.example.demo.BankDemo.Models.Kund;
import com.example.demo.BankDemo.Repos.KpiRepo;
import com.example.demo.BankDemo.Repos.KundRepo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class KundController {

    private final KundRepo kundRepo;

    public KundController(KundRepo kundRepo) {
        this.kundRepo = kundRepo;
    }

    @RequestMapping("kund/all")
    public List<Kund> getAllKund() {
        return kundRepo.findAll();
    }
}
