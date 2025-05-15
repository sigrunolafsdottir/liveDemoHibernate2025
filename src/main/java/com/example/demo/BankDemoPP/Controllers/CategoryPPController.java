package com.example.demo.BankDemoPP.Controllers;

import com.example.demo.BankDemoPP.Models.CategoryPP;
import com.example.demo.BankDemoPP.Models.CustomerPP;
import com.example.demo.BankDemoPP.Repos.CategoryPPRepo;
import com.example.demo.BankDemoPP.Repos.CustomerPPRepo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/PP")
public class CategoryPPController {


    private final CategoryPPRepo repo;

    public CategoryPPController(CategoryPPRepo repo) {
        this.repo = repo;
    }

    @RequestMapping("/categoryPP/all")
    public List<CategoryPP> getAllCategories(){
        return repo.findAll();
    }


    @PostMapping("/categoryPP/add")
    public List<CategoryPP> add(@RequestBody CategoryPP c){
        repo.save(c);
        return repo.findAll();
    }

}
