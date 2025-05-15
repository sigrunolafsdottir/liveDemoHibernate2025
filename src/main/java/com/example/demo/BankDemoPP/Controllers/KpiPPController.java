package com.example.demo.BankDemoPP.Controllers;

import com.example.demo.BankDemoPP.Models.CustomerPP;
import com.example.demo.BankDemoPP.Models.KpiPP;
import com.example.demo.BankDemoPP.Repos.CustomerPPRepo;
import com.example.demo.BankDemoPP.Repos.KpiPPRepo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/PP")
public class KpiPPController {


    private final KpiPPRepo repo;

    public KpiPPController(KpiPPRepo repo) {
        this.repo = repo;
    }

    @RequestMapping("/kpiPP/all")
    public List<KpiPP> getAllKpi(){
        return repo.findAll();
    }

    //läsa ut alla kunder
    //regga in kund

}
