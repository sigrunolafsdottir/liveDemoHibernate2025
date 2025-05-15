package com.example.demo.BankDemoPP.Controllers;

import com.example.demo.BankDemoPP.Models.AccountPP;
import com.example.demo.BankDemoPP.Models.CategoryPP;
import com.example.demo.BankDemoPP.Repos.AccountPPRepo;
import com.example.demo.BankDemoPP.Repos.CategoryPPRepo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/PP")
public class AccountPPController {


    private final AccountPPRepo repo;

    public AccountPPController(AccountPPRepo repo) {
        this.repo = repo;
    }

    @RequestMapping("/accountPP/all")
    public List<AccountPP> getAllCategories(){
        return repo.findAll();
    }


    @PostMapping("/accountPP/add")
    public List<AccountPP> add(@RequestBody AccountPP c){
        repo.save(c);
        return repo.findAll();
    }

}
