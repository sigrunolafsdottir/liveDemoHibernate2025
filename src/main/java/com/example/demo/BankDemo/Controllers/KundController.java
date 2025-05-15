package com.example.demo.BankDemo.Controllers;


import com.example.demo.BankDemo.Repos.KpiRepo;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KpiController {

    private final KpiRepo kpiRepo;

    public KpiController(KpiRepo kpiRepo) {
        this.kpiRepo = kpiRepo;
    }
}
