package com.example.demo.BankDemoPP.Repos;

import com.example.demo.BankDemoPP.Models.CategoryPP;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryPPRepo extends JpaRepository<CategoryPP, Long> {

    public CategoryPP findByName(String name);
}
