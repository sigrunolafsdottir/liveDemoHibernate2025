package com.example.demo.BankDemoPP.Repos;

import com.example.demo.BankDemoPP.Models.AccountPP;
import com.example.demo.BankDemoPP.Models.CategoryPP;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountPPRepo extends JpaRepository<AccountPP, Long> {


}
