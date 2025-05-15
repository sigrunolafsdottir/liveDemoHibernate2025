package com.example.demo.BankDemoPP.Controllers;

import com.example.demo.BankDemoPP.Models.CustomerPP;
import com.example.demo.BankDemoPP.Repos.CustomerPPRepo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/PP")
public class CustomerPPController {


    private final CustomerPPRepo repo;

    public CustomerPPController(CustomerPPRepo repo) {
        this.repo = repo;
    }

    @RequestMapping("/customerPP/all")
    public List<CustomerPP> getAllCustomers(){
        return repo.findAll();
    }

    //läsa ut alla kunder
    //regga in kund

}
