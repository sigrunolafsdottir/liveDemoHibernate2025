package com.example.demo.BankDemo.Controllers;


import com.example.demo.BankDemo.Repos.KpiRepo;
import com.example.demo.BankDemo.Repos.KundRepo;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KundController {

    private final KundRepo kundRepo;

    public KundController(KundRepo kundRepo) {
        this.kundRepo = kundRepo;
    }
}
