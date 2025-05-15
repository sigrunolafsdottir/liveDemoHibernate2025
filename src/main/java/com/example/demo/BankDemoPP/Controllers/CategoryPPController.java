package com.example.demo.BankDemoPP.Controllers;

import com.example.demo.BankDemoPP.Models.CustomerPP;
import com.example.demo.BankDemoPP.Repos.CustomerPPRepo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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


    @PostMapping("/customerPP/add")
    public List<CustomerPP> add(@RequestBody CustomerPP c){
        repo.save(c);
        return repo.findAll();
    }

}
