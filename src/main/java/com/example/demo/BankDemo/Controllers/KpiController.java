package com.example.demo.BankDemo.Controllers;


import com.example.demo.BankDemo.Models.Kategori;
import com.example.demo.BankDemo.Models.Kpi;
import com.example.demo.BankDemo.Repos.KpiRepo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class KpiController {

    private final KpiRepo kpiRepo;

    public KpiController(KpiRepo kpiRepo) {
        this.kpiRepo = kpiRepo;
    }

    @RequestMapping("kpi/all")
    public List<Kpi> Kpi() {
        return kpiRepo.findAll();
    }
}
