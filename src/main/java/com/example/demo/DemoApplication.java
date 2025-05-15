package com.example.demo;

import com.example.demo.BankDemo.Models.Kategori;
import com.example.demo.BankDemo.Models.Konto;
import com.example.demo.BankDemo.Models.Kpi;
import com.example.demo.BankDemo.Models.Kund;
import com.example.demo.BankDemo.Repos.KategoriRepo;
import com.example.demo.BankDemo.Repos.KontoRepo;
import com.example.demo.BankDemo.Repos.KpiRepo;
import com.example.demo.BankDemo.Repos.KundRepo;
import com.example.demo.BankDemoPP.Models.CategoryPP;
import com.example.demo.BankDemoPP.Models.CustomerPP;
import com.example.demo.BankDemoPP.Models.KpiPP;
import com.example.demo.BankDemoPP.Repos.CategoryPPRepo;
import com.example.demo.BankDemoPP.Repos.CustomerPPRepo;
import com.example.demo.BankDemoPP.Repos.KpiPPRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(KpiPPRepo kpiPPRepo, CustomerPPRepo customerPPRepo,
                                  CategoryPPRepo categoryRepo) {
        return (args) -> {
/*
            KpiPP kpi1 = new KpiPP(5);
            kpi1 = kpiPPRepo.save(kpi1);  //remove due to cascade

            customerPPRepo.save(new CustomerPP("wille", kpi1));


            CategoryPP gold = new CategoryPP("gold");
            CategoryPP silver = new CategoryPP("silver");
            CategoryPP platinum = new CategoryPP("platimum");

            categoryRepo.save(gold);
            categoryRepo.save(silver);
            categoryRepo.save(platinum);
*/
        };
    }



  /*  @Bean
    public CommandLineRunner demo(KpiRepo kpiRepo, KundRepo kundRepo,
                                  KategoriRepo kategoriRepo, KontoRepo kontoRepo) {
        return (args) -> {

               Kategori guld = new Kategori("guld");
            Kategori silver = new Kategori("silver");
            Kategori brons = new Kategori("brons");

            kategoriRepo.save(guld);
            kategoriRepo.save(brons);
            kategoriRepo.save(silver);

            Kund k2 = new Kund("Mimmi", new Kpi(78), guld);
            kundRepo.save(k2);
            Kund k3 = new Kund("Svante", new Kpi(45), silver);
            kundRepo.save(k3);


            Kategori k = kategoriRepo.findByNamn("guld").stream().findFirst().orElse(null);
            Kund k4 = new Kund("Rullan", new Kpi(1321), k);
            kundRepo.save(k4);



            Konto konto = new Konto(100);
            kontoRepo.save(konto);
            Kategori k = kategoriRepo.findByNamn("silver").stream().findFirst().orElse(null);
            Kund k4 = new Kund("Mickan", new Kpi(45), k, konto);
            kundRepo.save(k4);

        };
    }

 */

    /*
    @Bean
    public CommandLineRunner demo(GameRepository repository) {
        return (args) -> {
            // save a few books
            repository.save(new Game("GTA", "3", 18));
            repository.save(new Game("Minecraft", "4", 7));
            repository.save(new Game("COD", "2", 18));
            repository.save(new Game("CS", "3", 18));
            repository.save(new Game("DOTA", "4", 18));

        };
    }
*/

    /*
    @Bean
    public CommandLineRunner demo(BookRepository repository) {
        return (args) -> {
            // save a few books
            repository.save(new Book("Pippi", "Astrid Lindgren", 5));
            repository.save(new Book("Emil", "Astrid Lindgren", 5));
            repository.save(new Book("Karlsson", "Astrid Lindgren", 3));
            repository.save(new Book("Pale King", "David Foster Wallace", 5));
            repository.save(new Book("Idioten", "Dostoyevsky", 4));

        };
    }
*/
}
